package backend.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import backend.models.Bills;
import backend.repositories.BillsServicesImp;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class BillController {

	@Autowired
	BillsServicesImp bs;

	@Autowired
	BillsServicesImp bds;

	

	@RequestMapping(value = "/bills", method = RequestMethod.GET)
	public List<Bills> getAllBills() {
		try {
			List<Bills> ls = (List<Bills>) bds.findAll();
			return ls;
		} catch (Exception e) {
			System.out.println("getAllBill: " + e);
			return null;
		}
	}

//	@RequestMapping(value = "/bills/total", method = RequestMethod.GET)
//	public List<String> totalCash() {             
//		List<Bills> ls =  new Array
//		Bills date = new Bills();
//		String startDate;
//		
//		
//	 startDate(date.getStartDate().toString());
//		System.out.println(startDate);
//		return startDate;
//	}

	@RequestMapping(value = "/bills/new", method = RequestMethod.POST)
	public void newBill(@RequestBody Bills model) {
		Bills startdate = new Bills();

		try {
			bs.save(model);

		} catch (Exception e) {
			System.out.println("createNewServices: " + e);
		}
	}

	@RequestMapping(value = "/bill/thongkedoanhthu", method = RequestMethod.GET)
	public List<Bills> thongKeDoanhThu() {
		List<Bills> list_quy = new ArrayList<Bills>();
		try {
			list_quy.addAll(bds.thongKeDoanhThu());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list_quy;
	}
	
//	@RequestMapping(value = "/bill/getAllBill", method = RequestMethod.GET)
//	public List<String> getAllBill() {
//		List<String> list_quy = new ArrayList<String>();
//		try {
//			list_quy.addAll(bds.getAllBill());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return list_quy;
//	}
}
