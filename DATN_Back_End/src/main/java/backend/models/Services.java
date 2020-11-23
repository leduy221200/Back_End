package backend.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "services")
public class Services implements Serializable{

	@Id
	@Column(name = "_idServices", length=5)
	private String _idServices;
	
	@Column(name = "NameService", length=20)
	private String NameService;
	
	@Column(name = "Description", length=50)
	private String Description;
	
	@Column(name = "Price")
	private Double Price;
	
	@Column(name = "Status")
	private boolean Status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "_idAdmin")
	private Admins admins;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "_idbilldetail")
	private Bill_Detail bills_detail;

	public Services() {

	}

	public Services(String _idServices, String nameService, String description, Double price, boolean status,
			Admins admins, Bill_Detail bills_detail) {
		this._idServices = _idServices;
		NameService = nameService;
		Description = description;
		Price = price;
		Status = status;
		this.admins = admins;
		this.bills_detail = bills_detail;
	}

	public String get_idServices() {
		return _idServices;
	}

	public void set_idServices(String _idServices) {
		this._idServices = _idServices;
	}

	public String getNameService() {
		return NameService;
	}

	public void setNameService(String nameService) {
		NameService = nameService;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public Admins getAdmins() {
		return admins;
	}

	public void setAdmins(Admins admins) {
		this.admins = admins;
	}

	public Bill_Detail getBills_detail() {
		return bills_detail;
	}

	public void setBills_detail(Bill_Detail bills_detail) {
		this.bills_detail = bills_detail;
	}

	
	
}
