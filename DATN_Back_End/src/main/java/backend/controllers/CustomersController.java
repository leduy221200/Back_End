package backend.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.models.Customers;
import backend.repositories.CustomersServices;

@RestController
public class CustomersController {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	CustomersServices cs;
	
	@Autowired
	public JavaMailSender sender;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customers> getAllCustomer(){
		try {
			List<Customers> listCustomers = new ArrayList<Customers>();
			listCustomers =  (List<Customers>) cs.findAll();
			return listCustomers;
		} catch (Exception e) {
			System.out.println("getAllCustomer: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/customers/new", method = RequestMethod.POST)
	public String addCustomers(@RequestBody Customers model) {
		try {
			List<Customers> checkCustomer = cs.findByUserName(model.getUserName());
			if(checkCustomer.size() == 0) {
				cs.save(model);
				return "Đăng ký thành công!";
			}else {
				return "Đăng ký thất bại!";
			}
		} catch (Exception e) {
			System.out.println("addCustomers: " + e);
			return "Đăng ký thất bại!";
		}
	}
	
	@RequestMapping(value = "/customers/edit", method = RequestMethod.POST)
	public String EditCustomer(@RequestBody Customers model) {
		try {
			Optional<Customers> customer = cs.findById(model.get_idCustomer());
			if (customer.isPresent()) {
				customer.get().setFullName(model.getFullName());
				customer.get().setBirthDay(model.getBirthDay());
				customer.get().setBankNumber(model.getBankNumber());
				customer.get().setGender(model.isGender());
				customer.get().setImage(model.getImage());
				customer.get().setNationality(model.getNationality());
				customer.get().setPhone(model.getPhone());
				customer.get().setIdentityCard(model.getIdentityCard());
				cs.save(customer.get());
				return "Cập nhật thông tin thành công!";
			}else {
				return "Cập nhật thông tin thất bại!";
			}
		} catch (Exception e) {
			System.out.println("EditCustomer: " + e);
			return "Cập nhật thông tin thất bại!";
		}
	}
	
	@RequestMapping(value = "/customers/load", method = RequestMethod.GET)
	public List<Customers> loadInforCustomer(@RequestParam String userName) {
		try {
			List<Customers> customer = cs.findByUserName(userName);
			return customer;
		} catch (Exception e) {
			System.out.println("loadInforCustomer: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/customers/forgotPass", method = RequestMethod.POST)
	public String forgotPassWord(@RequestBody Customers model) {
		try {
			String noti = "Check your email to get new password!";
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(model.getEmail());
			message.setSubject("Get Password");
			message.setText("Your new password is: dreamhome1q2w3e");		
			
			Optional<Customers> customer = cs.findCustomerByEmailUserName(model.getUserName(), model.getEmail());
			if (customer.isPresent()) {
				customer.get().setPassWord("dreamhome1q2w3e");
				sender.send(message);
				cs.save(customer.get());
			}	
			
			return noti;
		} catch (Exception e) {
			e.printStackTrace();
			return "Your email or username is wrong!";
		}
	}
	
	@RequestMapping(value = "/customers/delete", method = RequestMethod.POST)
	public void deleteCustomer(@RequestBody Customers model) {
		try {
			Optional<Customers> customer = cs.findById(model.get_idCustomer());
			if (customer.isPresent()) {
				cs.deleteById(customer.get().get_idCustomer());
			}
		} catch (Exception e) {
			System.out.println("deleteCustomer: " + e);
		}
	}
}
