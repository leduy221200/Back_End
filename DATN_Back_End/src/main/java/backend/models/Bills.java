package backend.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "bills")
public class Bills implements Serializable{

	@Id
	@Column(name="idBill",length=5)
	private String idBill;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="totalCash")
	private Double totalCash;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date OutputDate;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date PayDate;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "idCustomer")
	private Customers customers;
	
	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "idPost")
	private Posts Post;
	
	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "idVoucher")
	private Voucher vouchers;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "bill_services", 
		joinColumns = @JoinColumn(name = "idBill"),
		inverseJoinColumns = @JoinColumn(name = "idServices"))
	private Set<Services> services;

	public Bills() {
		
	}

	public String getIdBill() {
		return idBill;
	}

	public boolean isStatus() {
		return status;
	}

	public Double getTotalCash() {
		return totalCash;
	}

	public Date getOutputDate() {
		return OutputDate;
	}

	public Date getPayDate() {
		return PayDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Customers getCustomers() {
		return customers;
	}

	public Posts getPost() {
		return Post;
	}

	public Voucher getVouchers() {
		return vouchers;
	}

	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setTotalCash(Double totalCash) {
		this.totalCash = totalCash;
	}

	public void setOutputDate(Date outputDate) {
		OutputDate = outputDate;
	}

	public void setPayDate(Date payDate) {
		PayDate = payDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public void setPost(Posts post) {
		Post = post;
	}

	public void setVouchers(Voucher vouchers) {
		this.vouchers = vouchers;
	}

	public Set<Services> getServices() {
		return services;
	}

	public void setServices(Set<Services> services) {
		this.services = services;
	}


}
