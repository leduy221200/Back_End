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
@Table(name = "posts")
public class Posts implements Serializable{
	
	@Id
	@Column(name = "_idPost", length = 5)
	private String _idPost;
	
	@Column(name = "Title", columnDefinition = "nvarchar(50)")
	private String Title;
	
	@Column(name = "UrlPost", length = 100)
	private String UrlPost;
	
	@Column(name = "Images", length = 100)
	private String Images;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date PostDate;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date EndDate;

	@Column(name = "Size")
	private Double Size;
	
	@Column(name = "Price")
	private Double Price;
	
	@Column(name = "Facility", columnDefinition = "nvarchar(50)")
	private String Facility;
	
	@Column(name = "Content", columnDefinition = "nvarchar(1000)")
	private String Content;
	
	@Column(name = "Address", columnDefinition = "nvarchar(100)")
	private String Address;
	
	@Column(name = "ContactName", columnDefinition = "nvarchar(50)")
	private String ContactName;
	
	@Column(name = "PhoneContact", length = 10)
	private String PhoneContact;
	
	@Column(name = "Available")
	private Boolean Available;
	
	@Column(name = "Comment", columnDefinition = "nvarchar(150)")
	private String Comment;
	
	@Column(name = "Rating")
	private Integer Rating;
	
	@Column(name = "Censored")
	private Integer Censored;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "_idAdmin")
	private Admins admins;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "_idCustomer")
	private Customers customers;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "_idVoucher")
	private Voucher vouchers;

	public Posts() {
	
	}

	public Posts(String _idPost, String title, String urlPost, String images, Date postDate, Date endDate, Double size,
			Double price, String facility, String content, String address, String contactName, String phoneContact,
			Boolean available, String comment, Integer rating, Admins admins, Customers customers) {
		this._idPost = _idPost;
		Title = title;
		UrlPost = urlPost;
		Images = images;
		PostDate = postDate;
		EndDate = endDate;
		Size = size;
		Price = price;
		Facility = facility;
		Content = content;
		Address = address;
		ContactName = contactName;
		PhoneContact = phoneContact;
		Available = available;
		Comment = comment;
		Rating = rating;
		this.admins = admins;
		this.customers = customers;
	}

	public String get_idPost() {
		return _idPost;
	}

	public void set_idPost(String _idPost) {
		this._idPost = _idPost;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getUrlPost() {
		return UrlPost;
	}

	public void setUrlPost(String urlPost) {
		UrlPost = urlPost;
	}

	public String getImages() {
		return Images;
	}

	public void setImages(String images) {
		Images = images;
	}

	public Date getPostDate() {
		return PostDate;
	}

	public void setPostDate(Date postDate) {
		PostDate = postDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public Double getSize() {
		return Size;
	}

	public void setSize(Double size) {
		Size = size;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getFacility() {
		return Facility;
	}

	public void setFacility(String facility) {
		Facility = facility;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
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

	public Boolean getAvailable() {
		return Available;
	}

	public void setAvailable(Boolean available) {
		Available = available;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public Integer getRating() {
		return Rating;
	}

	public void setRating(Integer rating) {
		Rating = rating;
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

	public Integer getCensored() {
		return Censored;
	}

	public void setCensored(Integer censored) {
		Censored = censored;
	}

	public Voucher getVouchers() {
		return vouchers;
	}

	public void setVouchers(Voucher vouchers) {
		this.vouchers = vouchers;
	}
	
}
