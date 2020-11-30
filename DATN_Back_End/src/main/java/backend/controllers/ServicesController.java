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

import backend.models.Services;
import backend.repositories.ServicesServices;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class ServicesController {

	@Autowired
	ServicesServices ss;
	
	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public List<Services> getAllServices(){
		try {
			List<Services> listServices = new ArrayList<Services>();
			listServices = (List<Services>) ss.findAll();
			return listServices;
		} catch (Exception e) {
			System.out.println("getAllServices: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/services/new", method = RequestMethod.POST)
	public void newServices(@RequestBody Services model) {
		try {
			ss.save(model);
			
		} catch (Exception e) {
			System.out.println("createNewServices: " + e);
		}
	}
	
	@RequestMapping(value = "/services/edit", method = RequestMethod.POST)
	public void editServices(@RequestBody Services model) {
		try {
			Optional<Services> services = ss.findById(model.get_idServices());
			if (services.isPresent()) {
				services.get().setNameService(model.getNameService());
				services.get().setDescription(model.getDescription());
				services.get().setPrice(model.getPrice());
				services.get().setStatus(model.isStatus());
				services.get().setAdmins(model.getAdmins());
			}		
		} catch (Exception e) {
			System.out.println("editServices: " + e);
		}
	}
	
	@RequestMapping(value="/services/delete", method = RequestMethod.POST)
	public void deleteServices(@RequestBody Services model) {
		try {
			Optional<Services> services = ss.findById(model.get_idServices());
			if (services.isPresent()) {
				ss.deleteById(services.get().get_idServices());
			}		
		} catch (Exception e) {
			System.out.println("deleteServices: " + e);
		}		
	}

}
