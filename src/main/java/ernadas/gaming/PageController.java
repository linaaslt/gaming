package ernadas.gaming;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
	
	@Autowired
	private PlatformaRepository platforma_repository;
	
	@Autowired
	private KurejasRepository kurejas_repository;
	
	@Autowired
	private ZaidimaiRepository zaidimai_repository;
	
	@Autowired 
	EntityManagerFactory factory;
	
	public SessionFactory sessionFactory() {

		
        if (factory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        return factory.unwrap(SessionFactory.class);
	}

	
	@RequestMapping("/platforma")
    public String platforma(	
    		Model model 
    		) {
		
		model.addAttribute("lst_menu", Menu.values() );	
		return "platforma";
	}
	
	@RequestMapping("/kurejas")
    public String kurejas(	
    		Model model 
    		) {
		
		model.addAttribute("lst_menu", Menu.values() );	
		return "kurejas";
	}
	
	@RequestMapping("/zaidimai")
    public String zaidimai(	
    		Model model 
    		) {
		
		model.addAttribute("lst_menu", Menu.values() );	
		return "zaidimai";
	}
}
