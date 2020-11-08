package backend.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "admins")
public class Admins implements Serializable{
	@Id
	@Column( name = "_idAdmin", length = 5)
	private String _idAdmin;
	
	@Column( name = "passWord", length = 20)
	private String passWord;

	@Column( name = "fullName",  columnDefinition = "nvarchar", length = 50)
	private String fullName;
	
	@Column( name = "birthDate")
	private String birthDate;
	
	@Column( name = "identityCard", length = 9)
	private String identityCard;
	
	@Column( name = "email", length = 30)
	private String email;
	
	@Column( name = "status")
	private boolean status;

	public Admins() {

	}

	public Admins(String _idAdmin, String passWord, String fullName, String birthDate, String identityCard, String email,
			boolean status) {
		super();
		this._idAdmin = _idAdmin;
		this.passWord = passWord;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.identityCard = identityCard;
		this.email = email;
		this.status = status;
	}

	public String get_idAdmin() {
		return _idAdmin;
	}

	public String getPassWord() {
		return passWord;
	}

	public String getFullName() {
		return fullName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public String getEmail() {
		return email;
	}

	public boolean isStatus() {
		return status;
	}

	public void set_idAdmin(String _idAdmin) {
		this._idAdmin = _idAdmin;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
