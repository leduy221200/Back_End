package backend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import backend.models.Voucher;
import backend.repositories.VoucherService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class VoucherController {

	@Autowired
	VoucherService voucherService;
	
	@PostMapping(value = "/newvoucher")
	public Voucher createNew(@RequestBody Voucher model) {
		voucherService.save(model);
		System.out.println(model.toString());
		
		return model;
	}
	
	@GetMapping(value = "/viewvoucher")
	public List<Voucher> viewData() {
		List<Voucher> list = new ArrayList<Voucher>();
		list = voucherService.findAll();
		System.out.println(list);
		return list;
		
	}
	
	@DeleteMapping(value="/deletevoucher/{idVoucher}")
	public void delete(@PathVariable(name="idVoucher") String idVoucher) {
//		List<User> list = new ArrayList<User>();
		System.out.println("====="+idVoucher);
		voucherService.deleteById(idVoucher);
//		list = userservice.findAll(); 
			
	}
}
