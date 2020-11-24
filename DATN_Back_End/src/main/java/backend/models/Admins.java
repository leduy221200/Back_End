package backend.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "admins")
public class Admins implements Serializable{
	@Id
	@Column( name = "_idAdmin", length = 5)
	private String _idAdmin;
	
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "admins")
	private Set<Voucher> voucher;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "admins")
	private Set<Posts> _idPost;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "admins")
	private Set<Services> idService;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "admins")
	private Set<Contracts> idContract;

	public Admins() {
		
	}
	
	public Admins(String _idAdmin, String passWord, String fullName, Date birthDay, String identityCard, String email, boolean status) {
		this._idAdmin = _idAdmin;
		PassWord = passWord;
		FullName = fullName;
		BirthDay = birthDay;
		IdentityCard = identityCard;
		Email = email;
		Status = status;
	}

	public String get_idAdmin() {
		return _idAdmin;
	}

	public void set_idAdmin(String _idAdmin) {
		this._idAdmin = _idAdmin;
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
		return voucher;
	}

	public void setVoucher(Set<Voucher> voucher) {
		this.voucher = voucher;
	}

	public Set<Posts> get_idPost() {
		return _idPost;
	}

	public void set_idPost(Set<Posts> _idPost) {
		this._idPost = _idPost;
	}

	public Set<Services> getIdService() {
		return idService;
	}

	public void setIdService(Set<Services> idService) {
		this.idService = idService;
	}

	public Set<Contracts> getIdContract() {
		return idContract;
	}

	public void setIdContract(Set<Contracts> idContract) {
		this.idContract = idContract;
	}
	
	
}
