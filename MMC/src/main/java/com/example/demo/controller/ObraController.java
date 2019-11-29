package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.ObraModel;
import com.example.demo.service.ObraService;



@Controller
@RequestMapping("/obra")
public class ObraController {

	@Autowired
	private ObraService obraService;
	
	/*Crear*/
	@GetMapping("/obraForm")
	public String formObra(Model model) {
		ObraModel obraModel = new ObraModel();
		model.addAttribute("obraModel",obraModel);
		model.addAttribute("obras",obraService.listAll());
		return "obraForm";
	}
	
	/*Post mapping de crear, guarda noticia y muestra la lista de noticias*/
	@PostMapping("/save")
	public String saveObras(@Valid ObraModel obraModel, Model model) {
		obraService.save(obraModel);
		return "redirect:/obra/obraList";
	}
	
	//Modificar
	@GetMapping(value = "/obraForm/{id}")
	public String modificarObra(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("obraModel", obraService.getId(id));
			
		}else {
			model.addAttribute("obraModel", new ObraModel());
		}
		return "obraForm";
	}
	
	//Listar Todas las Noticias
	@GetMapping("/obraList")
	public String listarObras(Model model) {
		model.addAttribute("obras", obraService.listAll());
		return "obraList";
	}
		
	//Borrar una noticia por su id
	@RequestMapping("/delete/{id}")
	public String deleteObra(@PathVariable(name = "id") int id) {
		obraService.delete(id);
		return "redirect:/obra/obraList";     
	}
	
	
}
