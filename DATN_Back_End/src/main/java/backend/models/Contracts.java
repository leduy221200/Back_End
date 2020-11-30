package backend.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "contracts")
public class Contracts implements Serializable{

	@Id
	@Column(name = "idContract", length=5)
	private String idContract;
	
	@Column(name = "ValueContract")
	private Double ValueContract;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date EndDate;
	
	@Column(name="Status")
	private boolean Status;
	
	@Column(name="Note", length=100)
	private String Note;
	
//	@JsonManagedReference
//	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "idAdmin")
	private Admins admins;
	
//	@JsonManagedReference
//	@JsonBackReference
	@OneToOne
	@JoinColumn(name ="idCustomer")
	private Customers Customer;

	public Contracts() {
		
	}

	public Contracts(String idContract, Double valueContract, Date endDate, boolean status,
			String note, Admins admins) {
		this.idContract = idContract;
		ValueContract = valueContract;
		EndDate = endDate;
		Status = status;
		Note = note;
		this.admins = admins;
	}

	public String get_idContract() {
		return idContract;
	}

	public void set_idContract(String _idContract) {
		this.idContract = _idContract;
	}

	public Double getValueContract() {
		return ValueContract;
	}

	public void setValueContract(Double valueContract) {
		ValueContract = valueContract;
	}
	
	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	public Admins getAdmins() {
		return admins;
	}

	public void setAdmins(Admins admins) {
		this.admins = admins;
	}

	public Customers getCustomer() {
		return Customer;
	}

	public void setCustomer(Customers customer) {
		Customer = customer;
	}
}
