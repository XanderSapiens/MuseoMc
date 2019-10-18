package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.model.FotoModel;

import com.example.demo.service.FotoService;

@Controller
@RequestMapping("/foto")
public class FotoController {
	
	@Autowired
	private FotoService fotoService;
	
	/*Crear*/
	@GetMapping("/fotoForm")
	public String formfoto(Model model) {
		FotoModel fotoModel = new FotoModel();
		model.addAttribute("fotoModel",fotoModel);
		model.addAttribute("fotos",fotoService.listAll());
		return "fotoForm";
	}
	
	/*Post mapping de crear*/
	@PostMapping("/save")
	public String savefoto(@Valid FotoModel fotoModel, Model model) {
		fotoService.save(fotoModel);
		return "redirect:/foto/fotoList";
	}
	
	//Modificar
		@GetMapping(value = "/fotoForm/{id}")
		public String modificarfoto(@PathVariable("id") Integer id, Model model) {
			if(id != null && id != 0) {
				model.addAttribute("fotoModel", fotoService.getId(id));
				
			}else {
				model.addAttribute("fotoModel", new FotoModel());
			}
			return "fotoForm";
		}
		
		//Listar
		@GetMapping("/fotoList")
		public String listarfoto(Model model) {
			model.addAttribute("fotos",fotoService.listAll());
			return "fotoList";
		}
					
		//Borrar por su id
		@RequestMapping("/delete/{id}")
		public String deleteFoto(@PathVariable(name = "id") int id) {
			fotoService.delete(id);
			return "redirect:/foto/fotoList";     
		}

}
