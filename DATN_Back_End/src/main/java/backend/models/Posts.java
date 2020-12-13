package backend.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "posts")
public class Posts implements Serializable{
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPost", length = 5)
	private Integer idPost;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "host", columnDefinition = "nvarchar(50)")
	private String host;
	
	@Column(name = "phoneContact", length = 15)
	private String phoneContact;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date postDate;
	
	@ManyToOne
	@JoinColumn(name = "idAdmin")
//	@JsonBackReference
	private Admins admins;

	public Posts() {
	
	}

	public Integer getIdPost() {
		return idPost;
	}

	public Double getPrice() {
		return price;
	}

	public String getHost() {
		return host;
	}

	public String getPhoneContact() {
		return phoneContact;
	}

	public Date getPostDate() {
		return postDate;
	}

	public Admins getAdmins() {
		return admins;
	}

	public void setIdPost(Integer idPost) {
		this.idPost = idPost;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPhoneContact(String phoneContact) {
		this.phoneContact = phoneContact;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public void setAdmins(Admins admins) {
		this.admins = admins;
	}	
	
}
