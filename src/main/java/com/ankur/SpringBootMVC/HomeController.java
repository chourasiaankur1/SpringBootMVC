package com.ankur.SpringBootMVC;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ankur.SpringBootMVC.model.Alien;

@Controller
public class HomeController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {

		m.addAttribute("result", repo.findAll());
		return "showAliens.jsp";
	}
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid, Model m) {

		m.addAttribute("result", repo.getById(aid));
		return "showAliens.jsp";
	}
	
	@GetMapping("getAlienByName")
	public String getAlien(@RequestParam String aname, Model m) {

		m.addAttribute("result", repo.find(aname));
		return "showAliens.jsp";
	}
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute("result") Alien a) {
		
		repo.save(a);
		return "showAliens.jsp";
	}
	
	@GetMapping("removeAlien")
	public String removeAlien(@RequestParam int aid, Model m) {
		
		System.out.println("dwedwd");
		repo.deleteById(aid);
		m.addAttribute("result", "deletion confirmed");
		return "showAliens.jsp";
	}
}
