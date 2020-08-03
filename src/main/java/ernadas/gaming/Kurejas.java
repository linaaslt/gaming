package ernadas.gaming;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Kurejas {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String pav;
	private String stilius;
	private Integer verte;
	private Integer id_platformos;
		
	@ManyToOne // (fetch = FetchType.LAZY)
    @JoinColumn(insertable=false, updatable=false,name="id_platformos")
	private Platforma platforma;
	
	public Kurejas (Integer id, String pav, String stilius, Integer verte, Integer id_platformos ) {
		super();
		this.id = id;
		this.pav = pav;
		this.stilius = stilius;
		this.verte = verte;
		this.id_platformos = id_platformos;
	}
	
	 public Kurejas () {
		 super ();
	 }

	public Platforma getPlatforma() {
		return platforma;
	}

	public void setPlatforma(Platforma platforma) {
		this.platforma = platforma;
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

	public String getStilius() {
		return stilius;
	}

	public void setStilius(String stilius) {
		this.stilius = stilius;
	}

	public Integer getVerte() {
		return verte;
	}

	public void setVerte(Integer verte) {
		this.verte = verte;
	}

	public Integer getId_platformos() {
		return id_platformos;
	}

	public void setId_platformos(Integer id_platformos) {
		this.id_platformos = id_platformos;
	}



}
