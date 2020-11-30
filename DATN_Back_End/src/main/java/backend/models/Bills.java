package backend.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@Column(name="Status")
	private boolean Status;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date OutputDate;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date PayDate;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "idCustomer")
	private Customers customers;
	
	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "idPost")
	private Posts Post;
	
	@JsonBackReference
	@OneToMany(mappedBy = "bills", cascade = CascadeType.ALL)
	private Set<Bill_Detail> idBillDetail;

	public Bills() {
		
	}

	public Bills(String idBill, boolean status, Date outputDate, Date payDate, Customers customers, Posts post) {
		this.idBill = idBill;
		Status = status;
		OutputDate = outputDate;
		PayDate = payDate;
		this.customers = customers;
		Post = post;
	}

	public String get_idBill() {
		return idBill;
	}

	public void set_idBill(String idBill) {
		this.idBill = idBill;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public Date getOutputDate() {
		return OutputDate;
	}

	public void setOutputDate(Date outputDate) {
		OutputDate = outputDate;
	}

	public Date getPayDate() {
		return PayDate;
	}

	public void setPayDate(Date payDate) {
		PayDate = payDate;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public Posts getPost() {
		return Post;
	}

	public void setPost(Posts post) {
		Post = post;
	}

	public Set<Bill_Detail> getIdBill_Details() {
		return idBillDetail;
	}

	public void setIdBill_Details(Set<Bill_Detail> idBillDetail) {
		this.idBillDetail = idBillDetail;
	}

}
