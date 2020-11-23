package backend.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "posts")
public class Posts implements Serializable{
	
	@Id
	@Column(name = "_idPost", length = 10)
	private String _idPost;
	private String _idHost;
	private String _idAdmin;
	private String _idVoucher;
	private String title;
	private String urlPost;
	private String images;
	private String postDate;
	private Double size;
	private Double price;
	private String facility;
	private String content;
	private String address;
	private String ContactName;
	private String phoneContact;
	private Boolean available;
	private String comment;
	private Integer rating;
	
	public Posts() {
		
	}
	
	public Posts(String _idPost, String _idHost, String _idAdmin, String _idVoucher, String title, String urlPost,
			String images, String postDate, Double size, Double price, String facility, String content, String address,
			String contactName, String phoneContact, Boolean available, String comment, Integer rating) {
		super();
		this._idPost = _idPost;
		this._idHost = _idHost;
		this._idAdmin = _idAdmin;
		this._idVoucher = _idVoucher;
		this.title = title;
		this.urlPost = urlPost;
		this.images = images;
		this.postDate = postDate;
		this.size = size;
		this.price = price;
		this.facility = facility;
		this.content = content;
		this.address = address;
		ContactName = contactName;
		this.phoneContact = phoneContact;
		this.available = available;
		this.comment = comment;
		this.rating = rating;
	}



	public String get_idPost() {
		return _idPost;
	}
	public String get_idHost() {
		return _idHost;
	}
	public String get_idAdmin() {
		return _idAdmin;
	}
	public String get_idVoucher() {
		return _idVoucher;
	}
	public String getTitle() {
		return title;
	}
	public String getUrlPost() {
		return urlPost;
	}
	public String getImages() {
		return images;
	}
	public String getPostDate() {
		return postDate;
	}
	public Double getSize() {
		return size;
	}
	public Double getPrice() {
		return price;
	}
	public String getFacility() {
		return facility;
	}
	public String getContent() {
		return content;
	}
	public String getAddress() {
		return address;
	}
	public String getContactName() {
		return ContactName;
	}
	public String getPhoneContact() {
		return phoneContact;
	}
	public Boolean getAvailable() {
		return available;
	}
	public String getComment() {
		return comment;
	}
	public Integer getRating() {
		return rating;
	}
	public void set_idPost(String _idPost) {
		this._idPost = _idPost;
	}
	public void set_idHost(String _idHost) {
		this._idHost = _idHost;
	}
	public void set_idAdmin(String _idAdmin) {
		this._idAdmin = _idAdmin;
	}
	public void set_idVoucher(String _idVoucher) {
		this._idVoucher = _idVoucher;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setUrlPost(String urlPost) {
		this.urlPost = urlPost;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public void setSize(Double size) {
		this.size = size;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setFacility(String facility) {
		this.facility = facility;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setContactName(String contactName) {
		ContactName = contactName;
	}
	public void setPhoneContact(String phoneContact) {
		this.phoneContact = phoneContact;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
}
