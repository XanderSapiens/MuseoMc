package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.ContactoModel;
import com.example.demo.service.ContactoService;
import com.example.demo.service.UsuarioService;


@Controller
@RequestMapping("/user")
public class UsuarioController {
	
	
	@Autowired
	private ContactoService contactoService;
	
	
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
		return "userIndex";
	}
	
	/*Post mapping de crear contacto*/
	@PostMapping("/save")
	public String saveContacto(@Valid ContactoModel contactoModel, Model model) {
		contactoService.save(contactoModel);
		return "redirect:/user/userIndex";
	}

}
