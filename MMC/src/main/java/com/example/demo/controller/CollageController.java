package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.model.CollageModel;

import com.example.demo.service.CollageService;

@Controller
@RequestMapping("/collage")
public class CollageController {
	
	@Autowired
	private CollageService collageService;
	
	/*Crear*/
	@GetMapping("/collageForm")
	public String formCollage(Model model) {
		CollageModel collageModel = new CollageModel();
		model.addAttribute("collageModel",collageModel);
		model.addAttribute("collage",collageService.listAll());
		return "collageForm";
	}
	
	/*Post mapping de crear*/
	@PostMapping("/save")
	public String saveCollage(@Valid CollageModel collageModel, Model model) {
		collageService.save(collageModel);
		return "redirect:/collage/collageList";
	}
	
	//Modificar
		@GetMapping(value = "/collageForm/{id}")
		public String modificarCollage(@PathVariable("id") Integer id, Model model) {
			if(id != null && id != 0) {
				model.addAttribute("collageModel", collageService.getId(id));
				
			}else {
				model.addAttribute("collageModel", new CollageModel());
			}
			return "collageForm";
		}
		
		//Listar
		@GetMapping("/collageList")
		public String listarCollage(Model model) {
			model.addAttribute("collages",collageService.listAll());
			return "collageList";
		}
					
		//Borrar por su id
		@RequestMapping("/delete/{id}")
		public String deleteCollage(@PathVariable(name = "id") int id) {
			collageService.delete(id);
			return "redirect:/collage/collageList";     
		}

}
