package backend.models;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "vouchers")
public class Voucher implements Serializable {

	@Id
	@Column( name = "idVoucher", length = 5)
	private String idVoucher;
	
	
	@Column( name = "Discount", length = 4)
	private String Discount;
	
	
	@Column( name = "Content", columnDefinition = "nvarchar(100)")
	private String Content;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date EndDate;
	
//	@JsonManagedReference
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "idAdmin")
	private Admins admins;
	
	public Voucher() {
		
	}

	public Voucher(String _idVoucher, String discount, String content, Date endDate, Admins Admins) {
		super();
		this.idVoucher = _idVoucher;
		this.Discount = discount;
		this.Content = content;
		this.EndDate = endDate;
		this.admins = Admins;
	}


	public Admins getAdmins() {
		return admins;
	}

	public void setAdmins(Admins admins) {
		this.admins = admins;
	}

	public String get_idVoucher() {
		return idVoucher;
	}

	public void set_idVoucher(String idVoucher) {
		this.idVoucher = idVoucher;
	}

	public String getDiscount() {
		return Discount;
	}

	public void setDiscount(String discount) {
		Discount = discount;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

}
