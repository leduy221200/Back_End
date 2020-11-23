package backend.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Contracts")
public class Contracts implements Serializable{

	@Id
	@Column(name="_idContract", length=5)
	private String _idContract;
	
	@Column(name="ValueContract")
	private float ValueContract;
	
	@Column(name="TypeContract")
	private int TypeContract;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date EndDate;
	
	@Column(name="Status")
	private boolean Status;
	
	@Column(name="Note", length=100)
	private String Note;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "_idAdmin")
	private Admins admins;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="_idCustomer")
	private Customers Customer;

	public Contracts() {
		
	}

	public Contracts(String _idContract, float valueContract, int typeContract, Date endDate, boolean status,
			String note, Admins admins) {
		this._idContract = _idContract;
		ValueContract = valueContract;
		TypeContract = typeContract;
		EndDate = endDate;
		Status = status;
		Note = note;
		this.admins = admins;
	}

	public String get_idContract() {
		return _idContract;
	}

	public void set_idContract(String _idContract) {
		this._idContract = _idContract;
	}

	public float getValueContract() {
		return ValueContract;
	}

	public void setValueContract(float valueContract) {
		ValueContract = valueContract;
	}

	public int getTypeContract() {
		return TypeContract;
	}

	public void setTypeContract(int typeContract) {
		TypeContract = typeContract;
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
