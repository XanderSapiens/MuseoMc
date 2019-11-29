package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.TallerModel;
import com.example.demo.service.TallerService;

@Controller
@RequestMapping("/taller")
public class TallerController {
	
	@Autowired
	private TallerService tallerService;

	/*Crear*/
	@GetMapping("/tallerForm")
	public String formTaller(Model model) {
		TallerModel tallerModel = new TallerModel();
		model.addAttribute("tallerModel",tallerModel);
		model.addAttribute("taller",tallerService.listAll());
		return "tallerForm";
	}
	
	/*Post mapping de crear, guarda noticia y muestra la lista de noticias*/
	@PostMapping("/save")
	public String saveTalleres(@Valid TallerModel tallerModel, Model model) {
		tallerService.save(tallerModel);
		return "redirect:/taller/tallerList";
	}
	
	//Modificar
	@GetMapping(value = "/tallerForm/{id}")
	public String modificarTaller(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("tallerModel", tallerService.getId(id));
			
		}else {
			model.addAttribute("tallerModel", new TallerModel());
		}
		return "tallerForm";
	}
	
	//Listar Todas las Noticias
	@GetMapping("/tallerList")
	public String listarTalleres(Model model) {
		model.addAttribute("taller", tallerService.listAll());
		return "tallerList";
	}
		
	//Borrar una noticia por su id
	@RequestMapping("/delete/{id}")
	public String deleteTaller(@PathVariable(name = "id") int id) {
		tallerService.delete(id);
		return "redirect:/taller/tallerList";     
	}
}
