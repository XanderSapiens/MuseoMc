package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.NoticiaModel;
import com.example.demo.service.NoticiaService;

@Controller
@RequestMapping("/noticia")
public class NoticiaController {
	
	@Autowired
	private NoticiaService noticiaService;
	
	/*Crear*/
	@GetMapping("/noticiaForm")
	public String formNoticia(Model model) {
		NoticiaModel noticiaModel = new NoticiaModel();
		model.addAttribute("noticiaModel",noticiaModel);
		model.addAttribute("noticias",noticiaService.listAll());
		return "noticiaForm";
	}
	
	/*Post mapping de crear, guarda noticia y muestra la lista de noticias*/
	@PostMapping("/save")
	public String saveNoticia(@Valid NoticiaModel noticiaModel, Model model) {
		noticiaService.save(noticiaModel);
		return "redirect:/noticia/noticiaList";
	}
	
	//Modificar
	@GetMapping(value = "/noticiaForm/{id}")
	public String modificarNoticia(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("noticiaModel", noticiaService.getId(id));
			
		}else {
			model.addAttribute("noticiaModel", new NoticiaModel());
		}
		return "noticiaForm";
	}
	
	//Listar Todas las Noticias
	@GetMapping("/noticiaList")
	public String listarNoticias(Model model) {
		model.addAttribute("noticias", noticiaService.listAll());
		return "noticiaList";
	}
		
	//Borrar una noticia por su id
	@RequestMapping("/delete/{id}")
	public String deleteNoticia(@PathVariable(name = "id") int id) {
		noticiaService.delete(id);
		return "redirect:/noticia/noticiaList";     
	}
	

}
