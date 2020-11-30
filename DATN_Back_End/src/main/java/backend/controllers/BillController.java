package backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import backend.models.Bills;
import backend.repositories.BillDetailServices;
import backend.repositories.BillsServices;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class BillController {
	
	@Autowired
	BillsServices bs;
	
	@Autowired
	BillDetailServices bds;
	
	@RequestMapping(value = "/bills", method = RequestMethod.GET)
	public List<Bills> getAllBills(){
		try {
			List<Bills> ls = (List<Bills>) bs.findAll();
			return ls;
		} catch (Exception e) {
			System.out.println("getAllBill: " + e);
			return null;
		}
	}
	
}
