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
	@GetMapping("/formNoticia")
	public String formNoticia(Model model) {
		NoticiaModel noticiaModel = new NoticiaModel();
		model.addAttribute("noticialModel",noticiaModel);
		model.addAttribute("noticias",noticiaService.listAll());
		return "formNoticia";
	}
	
	/*Post mapping de crear, guarda noticia y muestra la lista de noticias*/
	@PostMapping("/save")
	public String saveNoticia(@Valid NoticiaModel noticiaModel, Model model) {
		noticiaService.save(noticiaModel);
		return "redirect:/noticia/listNoticia";
	}
	
	//Modificar
	@GetMapping(value = "/formNoticia/{id}")
	public String modificarNoticia(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("noticiaModel", noticiaService.getId(id));
			
		}else {
			model.addAttribute("noticiaModel", new NoticiaModel());
		}
		return "formNoticia";
	}
	
	//Listar Todas las Noticias
	@GetMapping("/listNoticia")
	public String listarNoticias(Model model) {
		model.addAttribute("noticias", noticiaService.listAll());
		return "teacherList";
	}
		
	//Borrar una noticia por su id
	@RequestMapping("/delete/{id}")
	public String deleteNoticia(@PathVariable(name = "id") int id) {
		noticiaService.delete(id);
		return "redirect:/noticia/listNoticia";     
	}
	

}
