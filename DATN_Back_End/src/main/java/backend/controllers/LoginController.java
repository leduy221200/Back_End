package backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import backend.models.Admins;
import backend.models.Customers;
import backend.repositories.AdminsServices;
import backend.repositories.CustomersServices;

@RestController
public class LoginController {
	
	String message = "";
	
	@Autowired
	AdminsServices as;
	
	@Autowired
	CustomersServices cs;
	
	@RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
	public String loginAdmin(@RequestBody Admins model) {	
		Optional<Admins> checkLogin = as.findById(model.getidAdmin());
		if (checkLogin.isPresent()) {
			if (checkLogin.get().getPassWord().matches(model.getPassWord())) {
				return "login success";
			}else {
				message = "Password is not correct!";
				return message;
			}
		}else {
			message = "id is not correct!";
			return message;
		}	
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Customers login(@RequestBody Customers model) {
		List<Customers> checkLogin = cs.loginCustomer(model.getUserName(), model.getPassWord());
		if (checkLogin.size() != 0) {
			message = "login success";
			System.out.println(message);
			return checkLogin.get(0);
		}else {
			message = "username or password is not correct!";
			System.out.println(message);
			return null;
		}		
	}
	
}
