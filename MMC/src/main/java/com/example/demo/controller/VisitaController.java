package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.VisitaModel;
import com.example.demo.service.VisitaService;

@Controller
@RequestMapping("/visita")
public class VisitaController {
	
	@Autowired
	private VisitaService visitaService;
	
	/*Crear*/
	@GetMapping("/visitaForm")
	public String formVisita(Model model) {
		VisitaModel visitaModel = new VisitaModel();
		model.addAttribute("visitaModel",visitaModel);
		model.addAttribute("visita",visitaService.listAll());
		return "visitaForm";
	}
	
	/*Post mapping de crear, guarda noticia y muestra la lista de noticias*/
	@PostMapping("/save")
	public String saveVisitas(@Valid VisitaModel visitaModel, Model model) {
		visitaService.save(visitaModel);
		return "redirect:/visita/visitaList";
	}
	
	//Modificar
	@GetMapping(value = "/visitaForm/{id}")
	public String modificarVisita(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("visitaModel", visitaService.getId(id));
			
		}else {
			model.addAttribute("visitaModel", new VisitaModel());
		}
		return "visitaForm";
	}
	
	//Listar Todas las Noticias
	@GetMapping("/visitaList")
	public String listarVisitas(Model model) {
		model.addAttribute("visita", visitaService.listAll());
		return "visitaList";
	}
		
	//Borrar una noticia por su id
	@RequestMapping("/delete/{id}")
	public String deleteVisita(@PathVariable(name = "id") int id) {
		visitaService.delete(id);
		return "redirect:/visita/visitaList";     
	}

}
