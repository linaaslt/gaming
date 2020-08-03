package ernadas.gaming;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Zaidimai {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String pav;
	private String stilius;
	private String reitingas;
	private Integer kaina;
	private Integer id_kurejo;
	private String platforma;
	private Integer ar_isleistas;
	
	@ManyToOne // (fetch = FetchType.LAZY)
    @JoinColumn(insertable=false, updatable=false,name="id_kurejo")
	private Kurejas kurejas;
	
	public Zaidimai (Integer id, String pav, String stilius, String reitingas, Integer kaina, Integer id_kurejo, String platforma, Integer ar_isleistas ) {
		super();
		this.id = id;
		this.pav = pav;
		this.stilius = stilius;
		this.reitingas = reitingas;
		this.kaina = kaina;
		this.id_kurejo = id_kurejo;
		this.platforma = platforma;
		this.ar_isleistas = ar_isleistas;
	}
	
	public Zaidimai () {
		super();
	}
	
	
	public Integer getAr_isleistas() {
		return ar_isleistas;
	}

	public void setAr_isleistas(Integer ar_isleistas) {
		this.ar_isleistas = ar_isleistas;
	}

	public String getPlatforma() {
		return platforma;
	}

	public void setPlatforma(String platforma) {
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

	public String getReitingas() {
		return reitingas;
	}

	public void setReitingas(String reitingas) {
		this.reitingas = reitingas;
	}

	public Integer getKaina() {
		return kaina;
	}

	public void setKaina(Integer kaina) {
		this.kaina = kaina;
	}

	public Integer getId_kurejo() {
		return id_kurejo;
	}

	public void setId_kurejo(Integer id_kurejo) {
		this.id_kurejo = id_kurejo;
	}

	public Kurejas getKurejas() {
		return kurejas;
	}

	public void setKurejas(Kurejas kurejas) {
		this.kurejas = kurejas;
	}
	
}
