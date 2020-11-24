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
import backend.models.Posts;
import backend.repositories.AdminsServices;
import backend.repositories.PostsServices;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class AdminsController {

	@Autowired
	AdminsServices as;
	
	@Autowired
	PostsServices ps;
	
	@RequestMapping(value = "/admins", method = RequestMethod.GET)
	public List<Admins> getAllAdmins() {
		try {
			List<Admins> listAdmins = new ArrayList<Admins>();
			listAdmins =  (List<Admins>) as.findAll();
			return listAdmins;
		} catch (Exception e) {
			System.out.println("getAllAdmins: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/admins/new", method = RequestMethod.POST)
	public void addAdmin(@RequestBody Admins model) {
		try {
			as.save(model);
		} catch (Exception e) {
			System.out.println("addAdmin: " + e);
		}
	}
	
	@RequestMapping(value = "/admins/edit", method = RequestMethod.POST)
	public void editAdmin(@RequestBody Admins model) {
		try {
			Optional<Admins> admin = as.findById(model.get_idAdmin());
			if (admin.isPresent()) {
				admin.get().setFullName(model.getFullName());
				admin.get().setBirthDay(model.getBirthDay());
				admin.get().setEmail(model.getEmail());
				admin.get().setStatus(model.isStatus());
				admin.get().setIdentityCard(model.getIdentityCard());
				as.save(admin.get());
			}
		} catch (Exception e) {
			System.out.println("editAdmin: " + e);
		}
	}
	
	@RequestMapping(value = "/admins/delete", method = RequestMethod.POST)
	public void deleteAdmin(@RequestBody Admins model) {
		try {
			Optional<Admins> admin = as.findById(model.get_idAdmin());
			if (admin.isPresent()) {
				as.deleteById(admin.get().get_idAdmin());
			}
		} catch (Exception e) {
			System.out.println("deleteAdmin: " + e);
		}
	}
	
	@RequestMapping(value = "/admins/censored", method = RequestMethod.POST)
	public void censoredPost(@RequestBody Posts model) {
		try {
			Optional<Posts> post = ps.findById(model.get_idPost());
			if (post.isPresent()) {
				post.get().setCensored(model.getCensored());
				ps.save(post.get());
			}
		} catch (Exception e) {
			System.out.println("censoredPost: " + e);
		}
	}
	
}
