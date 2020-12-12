//Post detail in mongoDB.
package backend.models;
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
	
	@Field(name = "size")
	private String size;
	
	@Field(name = "price")
	private String price;
	
	@Field(name = "max_guests")
	private String maxGuest;

	@Field(name = "bed_rooms")
	private String bedRooms;
	
	@Field(name = "rest_rooms")
	private String restRooms;
	
	@Field(name = "content")
	private String content;
	
	@Field(name = "address")
	private String address;
	
	@Field(name = "phone_contact")
	private String phoneContact;
	
	@Field(name = "status")
	private String status;
	
	@Field(name = "rating")
	private String rating;

	public Post_Detail() {

	}

	public ObjectId getId() {
		return id;
	}

	public Integer getIdPost() {
		return idPost;
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

	public String getSize() {
		return size;
	}

	public String getPrice() {
		return price;
	}

	public String getMaxGuest() {
		return maxGuest;
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

	public String getPhoneContact() {
		return phoneContact;
	}

	public String getStatus() {
		return status;
	}

	public String getRating() {
		return rating;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setIdPost(Integer idPost) {
		this.idPost = idPost;
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

	public void setSize(String size) {
		this.size = size;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setMaxGuest(String maxGuest) {
		this.maxGuest = maxGuest;
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

	public void setPhoneContact(String phoneContact) {
		this.phoneContact = phoneContact;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
}
