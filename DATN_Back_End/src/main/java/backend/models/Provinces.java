package backend.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provinces")
public class Provinces implements Serializable{
	
	@Id
	@Column( name = "idProvince", length = 3)
	private String idProvince;
	
	@Column( name = "nameProvince", columnDefinition = "nvarchar(30)")
	private String nameProvince;
	
	@Column(name = "urlProvince", length = 100)
	private String urlProvvince;

	public String getIdProvince() {
		return idProvince;
	}

	public String getNameProvince() {
		return nameProvince;
	}

	public String getUrlProvvince() {
		return urlProvvince;
	}

	public void setIdProvince(String idProvince) {
		this.idProvince = idProvince;
	}

	public void setNameProvince(String nameProvince) {
		this.nameProvince = nameProvince;
	}

	public void setUrlProvvince(String urlProvvince) {
		this.urlProvvince = urlProvvince;
	}

	public Provinces(String idProvince, String nameProvince, String urlProvvince) {
		super();
		this.idProvince = idProvince;
		this.nameProvince = nameProvince;
		this.urlProvvince = urlProvvince;
	}

	public Provinces() {
		super();
	}
	
}
