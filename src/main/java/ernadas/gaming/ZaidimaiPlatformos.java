package ernadas.gaming;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ZaidimaiPlatformos {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_zaidimo;
	private Integer id_platformos;
	
	@ManyToOne // (fetch = FetchType.LAZY)
    @JoinColumn(insertable=false, updatable=false,name="id_zaidimo")
	private Zaidimai zaidimai;
	
	@ManyToOne // (fetch = FetchType.LAZY)
    @JoinColumn(insertable=false, updatable=false,name="id_platformos")
	private Platforma platforma;
	
	public ZaidimaiPlatformos (Integer id, Integer id_zaidimo, Integer id_platformos ) {
		super();
		this.id = id;
		this.id_zaidimo = id_zaidimo; 
		this.id_platformos = id_platformos;
		
	}
	
	public ZaidimaiPlatformos () {
		super ();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_zaidimo() {
		return id_zaidimo;
	}

	public void setId_zaidimo(Integer id_zaidimo) {
		this.id_zaidimo = id_zaidimo;
	}

	public Integer getId_platformos() {
		return id_platformos;
	}

	public void setId_platformos(Integer id_platformos) {
		this.id_platformos = id_platformos;
	}
	
	
}