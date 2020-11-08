package backend.controllers;

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
	CustomersServices cs;
	
	@RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
	public String loginAdmin(@RequestBody Admins model) {	
		Optional<Admins> checkLogin = as.findById(model.get_idAdmin());
		if (checkLogin.isPresent()) {
			if (checkLogin.get().getPassWord().matches(model.getPassWord())) {
				return "/adminManager";
			}else {
				message = "Password is not correct!";
				return "/loginAdmin";
			}
		}else {
			message = "id is not correct!";
			return "/loginAdmin";
		}	
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestBody Customers model) {
		Optional<Customers> checkLogin = cs.findById(model.get_idCustomer());
		if (checkLogin.isPresent()) {
			if (checkLogin.get().getPassWord().matches(model.getPassWord())) {
				return "/index";
			}else {
				message = "Password is not correct!";
				return "/login";
			}
		}else {
			message = "username is not correct!";
			return "/login";
		}	
	}
	
}
