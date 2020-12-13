package backend.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name = "services")
public class Services implements Serializable{

	@Id
	@Column(name = "idServices", length = 5)
	private String idServices;
	
	@Column(name = "NameService", columnDefinition = "nvarchar(20)")
	private String NameService;
	
	@Column(name = "Description", columnDefinition = "nvarchar(50)")
	private String Description;
	
	@Column(name = "Price")
	private Double Price;
	
	@Column(name = "Status")
	private boolean Status;
	
	@ManyToOne
//	@JsonBackReference
	@JoinColumn(name = "idAdmin")
	private Admins admins;
	
	@ManyToMany(mappedBy = "services")
	@Exclude
	private Set<Bills> bills;

	public Services() {

	}

	public Services(String idServices, String nameService, String description, Double price, boolean status,
			Admins admins) {
		this.idServices = idServices;
		NameService = nameService;
		Description = description;
		Price = price;
		Status = status;
		this.admins = admins;
	}

	public String get_idServices() {
		return idServices;
	}

	public void set_idServices(String _idServices) {
		this.idServices = _idServices;
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
	
}
