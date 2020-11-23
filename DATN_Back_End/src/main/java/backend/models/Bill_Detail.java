package backend.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "bills_detail")
public class Bill_Detail implements Serializable{
    @Id
	@Column(name="_idbilldetail")
	private String _idbilldetail;
	
	@Column(name="TotalCash")
	private Double TotalCash;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date StartDate;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date FinishDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "_idBill")
	private Bills bills;
	
	@OneToMany(fetch=FetchType.LAZY , mappedBy = "bills_detail")
	private Set<Services> services;

	public Bill_Detail() {
	
	}

	public Bill_Detail(String _idbilldetail, Double totalCash, Date startDate, Date finishDate, Bills bills) {
		this._idbilldetail = _idbilldetail;
		TotalCash = totalCash;
		StartDate = startDate;
		FinishDate = finishDate;
		this.bills = bills;
	}

	public String get_idbilldetail() {
		return _idbilldetail;
	}

	public void set_idbilldetail(String _idbilldetail) {
		this._idbilldetail = _idbilldetail;
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
