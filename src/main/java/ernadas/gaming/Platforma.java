package ernadas.gaming;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Platforma {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String pav;
	private String salis;
	
	public Platforma (Integer id, String pav, String salis) {
		super();
		this.id = id;
		this.pav = pav;
		this.salis = salis;
	}
	
	 public Platforma () {
		 super ();
	 }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPav() {
		return pav;
	}

	public void setPav(String pav) {
		this.pav = pav;
	}

	public String getSalis() {
		return salis;
	}

	public void setSalis(String salis) {
		this.salis = salis;
	}
	 
	 
}