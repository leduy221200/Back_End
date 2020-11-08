package backend.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "customers")
public class Customers implements Serializable{
	@Id
	@Column(name = "_idCustomer", length = 10)
	private String _idCustomer;
	
	@Column(name = "userName", length = 15)
	private String userName;
	
	@Column(name = "passWord", length = 20)
	private String passWord;
	
	@Column(name = "fullName", columnDefinition = "nvarchar",length = 30)
	private String fullName;
	
	@Column(name = "birthDate", length = 8)
	private String birthDate;
	
	@Column(name = "identityCard", length = 10)
	private String identityCard;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone", length = 10)
	private String phone;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "gender")
	private boolean gender;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "score")
	private Integer score;
	
	@Column(name = "bankNumber", length = 10)
	private String bankNumber;
	
	@Column(name = "role")
	private boolean role;
	
	public Customers() {
	}

	public Customers(String _idCustomer, String userName, String passWord, String fullName, String birthDate,
			String identityCard, String email, String phone, String image, boolean gender, String nationality,
			Integer score, String bankNumber, boolean role) {
		super();
		this._idCustomer = _idCustomer;
		this.userName = userName;
		this.passWord = passWord;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.identityCard = identityCard;
		this.email = email;
		this.phone = phone;
		this.image = image;
		this.gender = gender;
		this.nationality = nationality;
		this.score = score;
		this.bankNumber = bankNumber;
		this.role = role;
	}

	public String get_idCustomer() {
		return _idCustomer;
	}

	public String getUserName() {
		return userName;
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

	public String getPhone() {
		return phone;
	}

	public String getImage() {
		return image;
	}

	public boolean isGender() {
		return gender;
	}

	public String getNationality() {
		return nationality;
	}

	public Integer getScore() {
		return score;
	}

	public String getBankNumber() {
		return bankNumber;
	}

	public boolean isRole() {
		return role;
	}

	public void set_idCustomer(String _idCustomer) {
		this._idCustomer = _idCustomer;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public void setRole(boolean role) {
		this.role = role;
	}
	
	
}
