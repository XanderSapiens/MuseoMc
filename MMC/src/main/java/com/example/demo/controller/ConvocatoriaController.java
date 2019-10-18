package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.model.ConvocatoriaModel;
import com.example.demo.service.ConvocatoriaService;

@Controller
@RequestMapping("/convocatoria")
public class ConvocatoriaController {
	
	@Autowired
	private ConvocatoriaService convocatoriaService;
	
	/*Crear*/
	@GetMapping("/convocatoriaForm")
	public String formConvocatoria(Model model) {
		ConvocatoriaModel convocatoriaModel = new ConvocatoriaModel();
		model.addAttribute("convocatoriaModel",convocatoriaModel);
		model.addAttribute("convocatorias",convocatoriaService.listAll());
		return "convocatoriaForm";
	}
	
	/*Post mapping de crear*/
	@PostMapping("/save")
	public String saveonvocatoria(@Valid ConvocatoriaModel convocatoriaModel, Model model) {
		convocatoriaService.save(convocatoriaModel);
		return "redirect:/convocatoria/convocatoriaList";
	}
	
	//Modificar
	@GetMapping(value = "/convocatoriaForm/{id}")
	public String modificarConvocatoria(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("convocatoriaModel", convocatoriaService.getId(id));
			
		}else {
			model.addAttribute("convocatoriaModel", new ConvocatoriaModel());
		}
		return "convocatoriaForm";
	}
	
	//Listar
	@GetMapping("/convocatoriaList")
	public String listarConvocatoria(Model model) {
		model.addAttribute("convocatorias", convocatoriaService.listAll());
		return "convocatoriaList";
	}
				
	//Borrar por su id
	@RequestMapping("/delete/{id}")
	public String deleteConvocatoria(@PathVariable(name = "id") int id) {
		convocatoriaService.delete(id);
		return "redirect:/convocatoria/convocatoriaList";     
	}

}
