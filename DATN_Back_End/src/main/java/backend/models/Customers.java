package backend.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "customers")
public class Customers implements Serializable{
	@Id
	@Column(name = "_idCustomer", length = 5)
	private String _idCustomer;
	
	@Column(name = "UserName", length = 15)
	private String UserName;
	
	@Column(name = "PassWord", length = 20)
	private String PassWord;
	
	@Column(name = "FullName", length = 30)
	private String FullName;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date BirthDay;
	
	@Column(name = "IdentityCard", length = 9)
	private String IdentityCard;
	
	@Column(name = "Email", length = 50)
	private String Email;
	
	@Column(name = "Phone", length = 10)
	private String Phone;
	
	@Column(name = "Address", length = 50)
	private String Address;
	
	@Column(name = "Image", length = 50)
	private String Image;
	
	@Column(name = "Gender")
	private boolean Gender;
	
	@Column(name = "Nationality")
	private String Nationality;
	
	@Column(name = "Score")
	private Integer Score;
	
	@Column(name = "BankNumber", length = 15)
	private String BankNumber;
	
	@Column(name = "Role")
	private boolean Role;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customers")
	private Set<Posts> idPosts;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customers")
	private Set<Bills> idBills;

	public Customers() {

	}

	public Customers(String _idCustomer, String userName, String passWord, String fullName, Date birthDay,
			String identityCard, String email, String phone, String address, String image, boolean gender,
			String nationality, Integer score, String bankNumber, boolean role) {
		this._idCustomer = _idCustomer;
		UserName = userName;
		PassWord = passWord;
		FullName = fullName;
		BirthDay = birthDay;
		IdentityCard = identityCard;
		Email = email;
		Phone = phone;
		Address = address;
		Image = image;
		Gender = gender;
		Nationality = nationality;
		Score = score;
		BankNumber = bankNumber;
		Role = role;
	}

	public String get_idCustomer() {
		return _idCustomer;
	}

	public void set_idCustomer(String _idCustomer) {
		this._idCustomer = _idCustomer;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public Date getBirthDay() {
		return BirthDay;
	}

	public void setBirthDay(Date birthDay) {
		BirthDay = birthDay;
	}

	public String getIdentityCard() {
		return IdentityCard;
	}

	public void setIdentityCard(String identityCard) {
		IdentityCard = identityCard;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public boolean isGender() {
		return Gender;
	}

	public void setGender(boolean gender) {
		Gender = gender;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public Integer getScore() {
		return Score;
	}

	public void setScore(Integer score) {
		Score = score;
	}

	public String getBankNumber() {
		return BankNumber;
	}

	public void setBankNumber(String bankNumber) {
		BankNumber = bankNumber;
	}

	public boolean isRole() {
		return Role;
	}

	public void setRole(boolean role) {
		Role = role;
	}
	
}
