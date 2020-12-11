package backend.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Posts implements Serializable{
	
	@Id
	@Column(name = "idPost", length = 5)
	private String idPost;
	
	@Column(name = "Price")
	private Double Price;
	
	@Column(name = "ContactName", columnDefinition = "nvarchar(50)")
	private String ContactName;
	
	@Column(name = "PhoneContact", length = 10)
	private String PhoneContact;
	
	@ManyToOne
	@JoinColumn(name = "idAdmin")
//	@JsonBackReference
	private Admins admins;
	
//	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "idCustomer")
	private Customers customers;
	
//	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "idVoucher")
	private Voucher vouchers;

	public Posts() {
	
	}


	public Posts(String idPost, Double price, String contactName, String phoneContact, Admins admins,
			Customers customers, Voucher vouchers) {
		this.idPost = idPost;
		Price = price;
		ContactName = contactName;
		PhoneContact = phoneContact;
		this.admins = admins;
		this.customers = customers;
		this.vouchers = vouchers;
	}


	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}


	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public String getPhoneContact() {
		return PhoneContact;
	}

	public void setPhoneContact(String phoneContact) {
		PhoneContact = phoneContact;
	}


	public Admins getAdmins() {
		return admins;
	}

	public void setAdmins(Admins admins) {
		this.admins = admins;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public Voucher getVouchers() {
		return vouchers;
	}

	public void setVouchers(Voucher vouchers) {
		this.vouchers = vouchers;
	}


	public String getIdPost() {
		return idPost;
	}


	public void setIdPost(String idPost) {
		this.idPost = idPost;
	}
	
}
