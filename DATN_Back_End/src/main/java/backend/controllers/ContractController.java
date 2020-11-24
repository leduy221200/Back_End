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

import backend.models.Contracts;

import backend.repositories.ContactServices;


@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class ContractController {
	
	@Autowired
	ContactServices cs;
	
	@RequestMapping(value = "/contract", method = RequestMethod.GET)
	public List<Contracts> getAllVouchers(){
		try {
			List<Contracts> listContract = new ArrayList<Contracts>();
			listContract = (List<Contracts>) cs.findAll();
			return listContract;
		} catch (Exception e) {
			System.out.println("getAllContract: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/contract/new", method = RequestMethod.POST)
	public void newVoucher(@RequestBody Contracts model) {
		try {
			cs.save(model);
			
		} catch (Exception e) {
			System.out.println("createNewContract: " + e);
		}
	}
	
	@RequestMapping(value = "/contract/edit", method = RequestMethod.POST)
	public void editVoucher(@RequestBody Contracts model) {
		try {
			Optional<Contracts> contract = cs.findById(model.get_idContract());
			if (contract.isPresent()) {
				contract.get().setValueContract(model.getValueContract());
				contract.get().setTypeContract(model.getTypeContract());
				contract.get().setEndDate(model.getEndDate());
				contract.get().setStatus(model.isStatus());
				contract.get().setNote(model.getNote());
				contract.get().setAdmins(model.getAdmins());
				contract.get().setCustomer(model.getCustomer());
			}		
		} catch (Exception e) {
			System.out.println("editContract: " + e);
		}
	}
	
	@RequestMapping(value="/contract/delete", method = RequestMethod.POST)
	public void deleteVoucher(@RequestBody Contracts model) {
		try {
			Optional<Contracts> contract = cs.findById(model.get_idContract());
			if (contract.isPresent()) {
				cs.deleteById(contract.get().get_idContract());
			}		
		} catch (Exception e) {
			System.out.println("deleteContract: " + e);
		}		
	}

}
