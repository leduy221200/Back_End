package backend.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import backend.models.Admins;
import backend.repositories.AdminsServices;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class AdminsController {

	@Autowired
	AdminsServices as;
	
	@RequestMapping(value = "/admins/getAdmin", method = RequestMethod.GET)
	public List<Admins> getAllAdmins() {
		List<Admins> listAdmins = new ArrayList<Admins>();
		listAdmins =  (List<Admins>) as.findAll();
		return listAdmins;
	}
	
	@RequestMapping(value = "/admins/addAdmin", method = RequestMethod.POST)
	public void addAdmin(@RequestBody Admins model) {
		as.save(model);
	}
	
	@RequestMapping(value = "/admins/editAdmin", method = RequestMethod.POST)
	public void editAdmin(@RequestBody Admins model) {
		Optional<Admins> admin = as.findById(model.get_idAdmin());
		if (admin.isPresent()) {
			admin.get().setFullName(model.getFullName());
			admin.get().setBirthDate(model.getBirthDate());
			admin.get().setEmail(model.getEmail());
			admin.get().setStatus(model.isStatus());
			admin.get().setIdentityCard(model.getIdentityCard());
			as.save(admin.get());
		}
	}
	
	@RequestMapping(value = "/admins/deleteAdmin", method = RequestMethod.POST)
	public void deleteAdmin(@RequestBody Admins model) {
		Optional<Admins> admin = as.findById(model.get_idAdmin());
		if (admin.isPresent()) {
			as.deleteById(admin.get().get_idAdmin());
		}
	}
	
}
