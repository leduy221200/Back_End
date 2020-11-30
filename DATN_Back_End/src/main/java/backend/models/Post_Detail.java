//Post detail in mongoDB.
package backend.models;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "post_detail")
public class Post_Detail {	
	@Id
	private ObjectId id;
	
	@Field(name = "id_post")
	private Integer idPost;
	
	@Field(name = "host_id")
	private String hostId;
	
	@Field(name = "host")
	private String host;
	
	@Field(name = "province_id")
	private String provinceId;
	
	@Field(name = "province")
	private String province;
	
	@Field(name = "title")
	private String title;
	
	@Field(name = "url_post")
	private String urlPost;
	
	@Field(name = "images")
	private List<String> images;
	
	@Field(name = "post_date")
	private Date PostDate;
	
	@Field(name = "end_date")
	private Date EndDate;

	@Field(name = "size")
	private String size;
	
	@Field(name = "price")
	private String price;
	
	@Field(name = "max_guests")
	private String maxGuest;
	
	@Field(name = "facility")
	private String facility;

	@Field(name = "bed_rooms")
	private String bedRooms;
	
	@Field(name = "rest_rooms")
	private String restRooms;
	
	@Field(name = "content")
	private String content;
	
	@Field(name = "address")
	private String address;
	
	@Field(name = "contact_name")
	private String contactName;
	
	@Field(name = "phone_contact")
	private String phoneContact;
	
	@Field(name = "status")
	private String status;
	
	@Field(name = "comment")
	private String comment;
	
	@Field(name = "rating")
	private String rating;
	
	@Field(name = "censored")
	private String censored;

	public Post_Detail() {

	}

	public Post_Detail(Integer idPost, String hostId, String host, String provinceId, String province,
			String title, String urlPost, List<String> images, Date postDate, Date endDate, String size, String price,
			String maxGuest, String facility, String bedRooms, String restRooms, String content, String address,
			String contactName, String phoneContact, String status, String comment, String rating, String censored) {
		this.idPost = idPost;
		this.hostId = hostId;
		this.host = host;
		this.provinceId = provinceId;
		this.province = province;
		this.title = title;
		this.urlPost = urlPost;
		this.images = images;
		PostDate = postDate;
		EndDate = endDate;
		this.size = size;
		this.price = price;
		this.maxGuest = maxGuest;
		this.facility = facility;
		this.bedRooms = bedRooms;
		this.restRooms = restRooms;
		this.content = content;
		this.address = address;
		this.contactName = contactName;
		this.phoneContact = phoneContact;
		this.status = status;
		this.comment = comment;
		this.rating = rating;
		this.censored = censored;
	}

	public ObjectId getId() {
		return id;
	}

	public String getHostId() {
		return hostId;
	}

	public String getHost() {
		return host;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public String getProvince() {
		return province;
	}

	public String getTitle() {
		return title;
	}

	public String getUrlPost() {
		return urlPost;
	}

	public List<String> getImages() {
		return images;
	}

	public Date getPostDate() {
		return PostDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public String getSize() {
		return size;
	}

	public String getPrice() {
		return price;
	}

	public String getMaxGuest() {
		return maxGuest;
	}

	public String getFacility() {
		return facility;
	}

	public String getBedRooms() {
		return bedRooms;
	}

	public String getRestRooms() {
		return restRooms;
	}

	public String getContent() {
		return content;
	}

	public String getAddress() {
		return address;
	}

	public String getContactName() {
		return contactName;
	}

	public String getPhoneContact() {
		return phoneContact;
	}

	public String getStatus() {
		return status;
	}

	public String getComment() {
		return comment;
	}

	public String getRating() {
		return rating;
	}

	public String getCensored() {
		return censored;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setHostId(String hostId) {
		this.hostId = hostId;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUrlPost(String urlPost) {
		this.urlPost = urlPost;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public void setPostDate(Date postDate) {
		PostDate = postDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setMaxGuest(String maxGuest) {
		this.maxGuest = maxGuest;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public void setBedRooms(String bedRooms) {
		this.bedRooms = bedRooms;
	}

	public void setRestRooms(String restRooms) {
		this.restRooms = restRooms;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public void setPhoneContact(String phoneContact) {
		this.phoneContact = phoneContact;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setCensored(String censored) {
		this.censored = censored;
	}

	public Integer getIdPost() {
		return idPost;
	}

	public void setIdPost(Integer idPost) {
		this.idPost = idPost;
	}
	
	
}
