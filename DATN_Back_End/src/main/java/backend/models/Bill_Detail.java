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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "bill_detail")
public class Bill_Detail implements Serializable{
    @Id
	@Column(name="idBillDetail")
	private String idBillDetail;
	
	@Column(name="TotalCash")
	private Double TotalCash;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date StartDate;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date FinishDate;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "idBill")
	private Bills bills;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "billDetail_Services", 
		joinColumns = @JoinColumn(name = "idBillDetail"),
		inverseJoinColumns = @JoinColumn(name = "idServices"))
	private Set<Services> services;

	public Bill_Detail() {
	
	}

	public Bill_Detail(String idBillDetail, Double totalCash, Date startDate, Date finishDate, Bills bills) {
		this.idBillDetail = idBillDetail;
		TotalCash = totalCash;
		StartDate = startDate;
		FinishDate = finishDate;
		this.bills = bills;
	}

	public String get_idbilldetail() {
		return idBillDetail;
	}

	public void set_idbilldetail(String idBillDetail) {
		this.idBillDetail = idBillDetail;
	}

	public Double getTotalCash() {
		return TotalCash;
	}

	public void setTotalCash(Double totalCash) {
		TotalCash = totalCash;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getFinishDate() {
		return FinishDate;
	}

	public void setFinishDate(Date finishDate) {
		FinishDate = finishDate;
	}

	public Bills getBills() {
		return bills;
	}

	public void setBills(Bills bills) {
		this.bills = bills;
	}
	
}
