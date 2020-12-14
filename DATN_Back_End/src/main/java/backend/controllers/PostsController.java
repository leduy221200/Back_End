package backend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.models.Customers;
import backend.models.Posts;
import backend.models.Provinces;
import backend.repositories.AdminsServices;
import backend.repositories.CustomersServices;
import backend.repositories.PostsServices;
import backend.repositories.ProvincesService;
import backend.repositories.ProvincesServicesImp;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class PostsController {
	
	@Autowired
	PostsServices ps;
	
	@Autowired
	AdminsServices as;
	
	@Autowired
	CustomersServices cs;
	
	@Autowired
	ProvincesService pss;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public List<Posts> getAllPosts() {
		try {
			List<Posts> listAdmins = new ArrayList<Posts>();
			listAdmins =  (List<Posts>) ps.findAll();
			return listAdmins;
		} catch (Exception e) {
			System.out.println("getAllPosts: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/posts/new", method = RequestMethod.POST)
	public void addPosts(@RequestBody Customers modelCus, Posts modelPost) {
		try {
				ps.save(modelPost);

		} catch (Exception e) {
			System.out.println("addPosts: " + e);
		}
	}
	
	
	@RequestMapping(value = "/posts/province", method = RequestMethod.GET)
	public List<Provinces> getProvices(){
		try {
			return (List<Provinces>) pss.findAll();
		} catch (Exception e) {
			System.out.println("getProvices: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/provinceName", method = RequestMethod.GET)
	public String getProvicesIdByName(@RequestParam String provinceName){
		try {
			return pss.getIdByName(provinceName);
		} catch (Exception e) {
			System.out.println("getProvices: " + e);
			return "";
		}
	}
}
