package backend.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import backend.models.Admins;
import backend.repositories.AdminsServices;

@RestController
public class LoginController {
	
	String message = "";
	@Autowired
	AdminsServices as;
	
	@RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
	public String login(@RequestBody Admins model) {
		
		Optional<Admins> checkLogin = as.findById(model.get_idAdmin());

		if (checkLogin.isPresent()) {
			if (checkLogin.get().getPassWord().matches(model.getPassWord())) {
				return "/login/admin";
			}else {
				message = "Password is not correct!";
				return "/login_fail/admin";
			}
		}else {
			message = "id is not correct!";
			return "/login_fail/admin";
		}	
	}
	
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String login(@RequestBody Admins model) {
//		String message = "";
//		Optional<Admins> checkLogin = as.findById(model.get_idAdmin());
//
//		if (checkLogin.isPresent()) {
//			if (checkLogin.get().getPassWord().matches(model.getPassWord())) {
//				return "/login/admin";
//			}else {
//				message = "Password is not correct!";
//				return "/login_fail/admin";
//			}
//		}else {
//			message = "id is not correct!";
//			return "/login_fail/admin";
//		}	
//	}
	
}
