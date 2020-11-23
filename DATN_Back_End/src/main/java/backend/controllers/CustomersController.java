package backend.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import backend.models.Customers;
import backend.repositories.CustomersServices;

@RestController
public class CustomersController {
	
	@Autowired
	CustomersServices cs;
	
	@Autowired
	public JavaMailSender sender;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customers> getAllCustomer(){
		List<Customers> listCustomers = new ArrayList<Customers>();
		listCustomers =  (List<Customers>) cs.findAll();
		return listCustomers;
	}
	
	@RequestMapping(value = "/customers/add", method = RequestMethod.POST)
	public void addCustomers(@RequestBody Customers model) {
		cs.save(model);
	}
	
	@RequestMapping(value = "/customers/edit", method = RequestMethod.POST)
	public void EditCustomer(@RequestBody Customers model) {
		Optional<Customers> customer = cs.findById(model.get_idCustomer());
		if (customer.isPresent()) {
			customer.get().setFullName(model.getFullName());
			customer.get().setBirthDay(model.getBirthDay());
			customer.get().setEmail(model.getEmail());
			customer.get().setBankNumber(model.getBankNumber());
			customer.get().setGender(model.isGender());
			customer.get().setImage(model.getImage());
			customer.get().setNationality(model.getNationality());
			customer.get().setPhone(model.getPhone());
			customer.get().setIdentityCard(model.getIdentityCard());
			cs.save(customer.get());
		}
	}
	
	@RequestMapping(value = "/customers/host", method = RequestMethod.POST)
	public void becomeHost(@RequestBody Customers model) {
		Optional<Customers> customer = cs.findById(model.get_idCustomer());
		if (customer.isPresent()) {
			customer.get().setRole(model.isRole());
			cs.save(customer.get());
		}
	}
	
	@RequestMapping(value = "/customers/load", method = RequestMethod.POST)
	public Customers loadInforCustomer(@RequestBody Customers model) {
		Optional<Customers> customer = cs.findById(model.get_idCustomer());
		return customer.get();
	}
	
	@RequestMapping(value = "/customers/delete", method = RequestMethod.POST)
	public void deleteCustomer(@RequestBody Customers model) {
		Optional<Customers> customer = cs.findById(model.get_idCustomer());
		if (customer.isPresent()) {
			cs.deleteById(customer.get().get_idCustomer());
		}
	}
	
	@RequestMapping(value = "/customers/forgotPass", method = RequestMethod.POST)
	public String forgotPassWord(@RequestBody Customers model) {
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(model.getEmail());
			message.setSubject("Get Password");
			message.setText("Your new password is: 123456");		
			
			sender.send(message);
			
			Optional<Customers> customer = cs.findById(model.get_idCustomer());
			if (customer.isPresent()) {
				customer.get().setPassWord("123456");
				cs.save(customer.get());
			}	
			
			return "/customers/load";
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
//			return "/customers/load";
		}
	}
}
