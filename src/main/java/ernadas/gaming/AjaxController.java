package ernadas.gaming;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/ajax") // This means URL's start with /demo (after Application path)
public class AjaxController {
	
	@Autowired
	private PlatformaRepository platforma_repository; 
	
	@Autowired
	private KurejasRepository kurejas_repository; 
	
	@Autowired
	private ZaidimaiRepository zaidimai_repository; 
	
	@Autowired
	private ZaidimaiPlatformosRepository zaidimaiPlatformos_repository;
	
	@GetMapping(path="/lst-platforma")
	public @ResponseBody Iterable<Platforma> getAllPlatforma() {
		// This returns a JSON or XML with the users
		return platforma_repository.findAll();
	}
	
	@GetMapping(path="/lst-kurejas")
	public @ResponseBody Iterable<Kurejas> getAllKurejas() {
		// This returns a JSON or XML with the users
		return kurejas_repository.findAll();
	}
	
	@GetMapping(path="/lst-zaidimai")
	public @ResponseBody Iterable<Zaidimai> getAllZaidimai() {
		// This returns a JSON or XML with the users
		return zaidimai_repository.findAll();
	}
	
	@GetMapping(path="/platforma")
	public @ResponseBody Platforma getPlatforma1(
			
    		@RequestParam(required=true) Integer id
			) {
		// This returns a JSON or XML with the users
		Optional<Platforma> op_men = platforma_repository.findById( id );
		
		Platforma plat1 = new Platforma();
		
		if ( op_men.isPresent() ) {
			
			plat1 = op_men.get(); 
		}
		
		System.out.println( plat1.toString() );
		
		return plat1;
	}	
	
	 @RequestMapping("/platforma-pakeisti")
	    public @ResponseBody String platformaSave(
	    		@RequestParam(required=false) String id	
	    		, @RequestParam(required=false) String pav	
	    		, @RequestParam(required=false) String salis
	    		// , @RequestParam(required=false) String irasas

	    	) {
		 
		 	String msg = "nieks neatlikta";
		 
		 	// if ( irasas != null ) {
		 		
		 		Platforma platforma1 = new Platforma (
		 				
		 				FormPrepare.takeId ( id )
		 				, pav
		 				, salis
		 				
		 		);
		 	
		 		// if ( irasas.equals ( "papildyti" ) ) {
		 			
				 	msg = "bandėm įrašyti";			 			
		 			
		 			if ( platforma_repository.save( platforma1 ) != null ) {
		 				
					 	msg = "tipo išsaugojom";
		 			}
		 		// }
	 		
		 	// }
	    	   	
	        return msg;
	    }		
	
	 @RequestMapping("/platforma-salinti")		
	    public @ResponseBody String platformaSalinti(
	    		@RequestParam(required=false) String id	
	    		, @RequestParam(required=false) String irasas

	    	) {
			 
			 	String msg = "nieks neatlikta";
			 
//			 	if ( ( irasas != null ) &&  irasas.equals ( "trinti" ) ) {
			 		
			 		msg = "ieškomas irašas";
			 		
			 		Optional<Platforma> op_platforma = platforma_repository.findById( FormPrepare.takeId ( id ) );
			 		
			 		if ( ! op_platforma.isEmpty() ) {
			 			
				 		msg = "irašas surastas, trinam";
				 		
				 		Platforma platforma1 = op_platforma.get();
				 		platforma_repository.delete( platforma1 );
			 		}	
//			 	} 	   	
		     return msg;
		 }	

	 @GetMapping(path="/kurejas")
		public @ResponseBody Kurejas getKurejas1(
				
	    		@RequestParam(required=true) Integer id
				) {
			// This returns a JSON or XML with the users
			Optional<Kurejas> op_men = kurejas_repository.findById( id );
			
			Kurejas kurejs1 = new Kurejas();
			
			if ( op_men.isPresent() ) {
				
				kurejs1 = op_men.get(); 
			}
			
			System.out.println( kurejs1.toString() );
			
			return kurejs1;
		}	
	
		 @RequestMapping("/kurejas-pakeisti")
		    public @ResponseBody String kurejasSave(
		    		@RequestParam(required=false) String id	
		    		, @RequestParam(required=false) String pav	
		    		, @RequestParam(required=false) String stilius
		    		, @RequestParam(required=false) String verte
		    		, @RequestParam(required=false) String id_platformos
		    		// , @RequestParam(required=false) String irasas

		    	) {
			 
			 	String msg = "nieks neatlikta";
			 
			 	// if ( irasas != null ) {
			 		
			 		Kurejas kurejas1 = new Kurejas (
			 				
			 				FormPrepare.takeId ( id )
			 				, pav
			 				, stilius
			 				, FormPrepare.takeId ( verte )
			 				, FormPrepare.takeId ( id_platformos )
			 				
			 		);
			 	
			 		// if ( irasas.equals ( "papildyti" ) ) {
			 			
					 	msg = "bandėm įrašyti";			 			
			 			
			 			if ( kurejas_repository.save( kurejas1 ) != null ) {
			 				
						 	msg = "tipo išsaugojom";
			 			}
			 		// }
		 		
			 	// }
		    	   	
		        return msg;
		    }		
		
		 @RequestMapping("/kurejas-salinti")		
		    public @ResponseBody String kurejasSalinti(
		    		@RequestParam(required=false) String id	
		    		, @RequestParam(required=false) String irasas

		    	) {
				 
				 	String msg = "nieks neatlikta";
				 
//				 	if ( ( irasas != null ) &&  irasas.equals ( "trinti" ) ) {
				 		
				 		msg = "ieškomas irašas";
				 		
				 		Optional<Kurejas> op_kurejas = kurejas_repository.findById( FormPrepare.takeId ( id ) );
				 		
				 		if ( ! op_kurejas.isEmpty() ) {
				 			
					 		msg = "irašas surastas, trinam";
					 		
					 		Kurejas kurejas1 = op_kurejas.get();
					 		kurejas_repository.delete( kurejas1 );
				 		}	
//				 	} 	   	
			     return msg;
			 }		
		 
		 @GetMapping(path="/zaidimai")
			public @ResponseBody Zaidimai getZaidimai1(
					
		    		@RequestParam(required=true) Integer id
					) {
				// This returns a JSON or XML with the users
				Optional<Zaidimai> op_men = zaidimai_repository.findById( id );
				
				Zaidimai zaidims1 = new Zaidimai();
				
				if ( op_men.isPresent() ) {
					
					zaidims1 = op_men.get(); 
				}
				
				System.out.println( zaidims1.toString() );
				
				return zaidims1;
			}	
		 
			 @RequestMapping("/zaidimai-pakeisti")
			    public @ResponseBody String zaidimaiSave(
			    		@RequestParam(required=false) String id	
			    		, @RequestParam(required=false) String pav	
			    		, @RequestParam(required=false) String stilius
			    		, @RequestParam(required=false) String reitingas
			    		, @RequestParam(required=false) String kaina
			    		, @RequestParam(required=false) String id_kurejo
			    		, @RequestParam(required=false) String platforma
			    		, @RequestParam(required=false) String ar_isleistas
			    		// , @RequestParam(required=false) String irasas

			    	) {
				 
				 	String msg = "nieks neatlikta";
				 
				 	// if ( irasas != null ) {
				 		
				 		Zaidimai zaidimas1 = new Zaidimai (
				 				
				 				FormPrepare.takeId ( id )
				 				, pav
				 				, stilius
				 				, reitingas
				 				, FormPrepare.takeId ( kaina )
				 				, FormPrepare.takeId ( id_kurejo )
				 				, null
				 				, FormPrepare.takeId ( ar_isleistas )
				 				
				 		);
				 	
				 		// if ( irasas.equals ( "papildyti" ) ) {
				 			
						 	msg = "bandėm įrašyti";			 			
				 			
				 			if ( zaidimai_repository.save( zaidimas1 ) != null ) {
				 				
							 	msg = "tipo išsaugojom";
							 	
							 	if (ar_isleistas != null) {
							 		
							 		
							 	}
				 			}
				 		// }
			 		
				 	// }
			    	   	
			        return msg;
			    }		
			
			 @RequestMapping("/zaidimai-salinti")		
			    public @ResponseBody String zaidimaiSalinti(
			    		@RequestParam(required=false) String id	
			    		, @RequestParam(required=false) String irasas

			    	) {
					 
					 	String msg = "nieks neatlikta";
					 
//					 	if ( ( irasas != null ) &&  irasas.equals ( "trinti" ) ) {
					 		
					 		msg = "ieškomas irašas";
					 		
					 		Optional<Zaidimai> op_zaidimai = zaidimai_repository.findById( FormPrepare.takeId ( id ) );
					 		
					 		if ( ! op_zaidimai.isEmpty() ) {
					 			
						 		msg = "irašas surastas, trinam";
						 		
						 		Zaidimai zaidimas1 = op_zaidimai.get();
						 		zaidimai_repository.delete( zaidimas1 );
					 		}	
//					 	} 	   	
				     return msg;
				 }	
			 
			 
}
