package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.model.ContactoModel;
import com.example.demo.model.FotoModel;
import com.example.demo.model.NoticiaModel;
import com.example.demo.service.ContactoService;
import com.example.demo.service.FotoService;
import com.example.demo.service.NoticiaService;



@Controller
@RequestMapping("/user")
public class UsuarioController {
	
	
	@Autowired
	private ContactoService contactoService;
	@Autowired
	private FotoService fotoService;
	@Autowired
	private NoticiaService noticiaService;
	
	
	
	//Login
	@GetMapping("/login")
	public String inicio() {
		return "userLogin";
	}
	
	//Redireccion de vistas de usario
	@GetMapping("/userQuienesSomos")
	public String quienes() {
		return "userQuienesSomos";
	}
	
	
	
	@GetMapping("/userMarta")
	public String marta() {
		return "userMarta";
	}
	
	@GetMapping("/userObras")
	public String obras() {
		return "userObras";
	}
	
	@GetMapping("/userVisita")
	public String visita() {
		return "userVisita";
	}
	
	@GetMapping("/userMediacion")
	public String mediacion() {
		return "userMediacion";
	}
	
	/*/Fotos
	@GetMapping("/userFotos")
	public String fotos() {
		return "userFotos";
	}*/
	
	
	
	//Ver Tipos de Obras
	@GetMapping("/esculturas")
	public String esculturas() {
		return "ObrasEsculturas";
	}
	
	@GetMapping("/bocetos")
	public String bocetos() {
		return "ObrasBocetos";
	}
	
	@GetMapping("/grabados")
	public String grabados() {
		return "ObrasGrabados";
	}
	
	@GetMapping("/collage")
	public String collage() {
		return "ObrasCollage";
	}
	
	@GetMapping("/maquetas")
	public String maquetas() {
		return "ObrasMaquetas";
	}
	
	
	
	/*Crear contacto*/
	@GetMapping("/userIndex")
	public String formContacto(Model model) {
		ContactoModel contactoModel = new ContactoModel();
		model.addAttribute("contactoModel",contactoModel);
		model.addAttribute("contactos",contactoService.listAll());
		model.addAttribute("noticias",noticiaService.listAll());
		return "userIndex";
	}
	
	/*Post mapping de crear contacto*/
	@PostMapping("/save")
	public String saveContacto(@Valid ContactoModel contactoModel, Model model) {
		contactoService.save(contactoModel);
		return "redirect:/user/userIndex";
	}
	
	//Listar
	@GetMapping("/userFotos")
	public String listarfoto(Model model) {
		
		model.addAttribute("fotos",fotoService.listAll());
		return "userFotos";
	}
	
	@GetMapping("/getNoticia/{id}")
	public String getNoticia(@PathVariable("id") Integer id,Model model ) {
			model.addAttribute("noticia", noticiaService.getId(id));
		
		return "userNoticias";
	}
	

}
