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

import backend.models.Voucher;
import backend.repositories.VoucherService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class VoucherController {

	@Autowired
	VoucherService vs;
	
	@RequestMapping(value = "/vouchers", method = RequestMethod.GET)
	public List<Voucher> getAllVouchers(){
		try {
			List<Voucher> listVoucher = new ArrayList<Voucher>();
			listVoucher = (List<Voucher>) vs.findAll();
			
			return listVoucher;
		} catch (Exception e) {
			System.out.println("getAllVouchers: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/vouchers/new", method = RequestMethod.POST)
	public void newVoucher(@RequestBody Voucher model) {
		try {
			vs.save(model);
			
		} catch (Exception e) {
			System.out.println("createNewVoucher: " + e);
		}
	}
	
	@RequestMapping(value = "/vouchers/edit", method = RequestMethod.POST)
	public void editVoucher(@RequestBody Voucher model) {
		try {
			Optional<Voucher> voucher = vs.findById(model.get_idVoucher());
			if (voucher.isPresent()) {
				voucher.get().setContent(model.getContent());
				voucher.get().setDiscount(model.getDiscount());
				voucher.get().setEndDate(model.getEndDate());
			}		
		} catch (Exception e) {
			System.out.println("createNewVoucher: " + e);
		}
	}
	
	@RequestMapping(value="/vouchers/delete", method = RequestMethod.POST)
	public void deleteVoucher(@RequestBody Voucher model) {
		try {
			Optional<Voucher> voucher = vs.findById(model.get_idVoucher());
			if (voucher.isPresent()) {
				vs.deleteById(voucher.get().get_idVoucher());
			}		
		} catch (Exception e) {
			System.out.println("createNewVoucher: " + e);
		}		
	}
}
