package backend.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "admins")
public class Admins implements Serializable{
	@Id
	@Column( name = "idAdmin", length = 5)
	private String idAdmin;
	
	@Column( name = "PassWord", length = 20)
	private String PassWord;

	@Column( name = "FullName", columnDefinition = "nvarchar(50)")
	private String FullName;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date BirthDay;
	
	@Column( name = "IdentityCard", length = 9)
	private String IdentityCard;
	
	@Column( name = "Email", length = 50)
	private String Email;
	
	@Column( name = "Status")
	private boolean Status;
	
	@JsonBackReference
	@OneToMany(mappedBy = "admins", cascade = CascadeType.ALL)
	private Set<Voucher> idVoucher;
	
	@JsonBackReference
	@OneToMany(mappedBy = "admins", cascade = CascadeType.ALL)
	private Set<Posts> idPost;
	
	@JsonBackReference
	@OneToMany(mappedBy = "admins", cascade = CascadeType.ALL)
	private Set<Services> idService;
	
	public Admins() {
		
	}
	
	public Admins(String idAdmin, String passWord, String fullName, Date birthDay, String identityCard, String email, boolean status) {
		this.idAdmin = idAdmin;
		PassWord = passWord;
		FullName = fullName;
		BirthDay = birthDay;
		IdentityCard = identityCard;
		Email = email;
		Status = status;
	}

	public String getidAdmin() {
		return idAdmin;
	}

	public void setidAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
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

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public Set<Voucher> getVoucher() {
		return idVoucher;
	}

	public void setVoucher(Set<Voucher> idVoucher) {
		this.idVoucher = idVoucher;
	}

	public Set<Posts> getidPost() {
		return idPost;
	}

	public void set_idPost(Set<Posts> idPost) {
		this.idPost = idPost;
	}

	public Set<Services> getIdService() {
		return idService;
	}

	public void setIdService(Set<Services> idService) {
		this.idService = idService;
	}
	
}
