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

import com.example.demo.service.ContactoService;

@Controller
@RequestMapping("/contacto")
public class ContactoController {
	
	@Autowired
	private ContactoService contactoService;
	
	/*Crear*/
	@GetMapping("/contactoForm")
	public String formContacto(Model model) {
		ContactoModel contactoModel = new ContactoModel();
		model.addAttribute("contactoModel",contactoModel);
		model.addAttribute("contactos",contactoService.listAll());
		return "contactoForm";
	}
	
	/*Post mapping de crear*/
	@PostMapping("/save")
	public String saveContacto(@Valid ContactoModel contactoModel, Model model) {
		contactoService.save(contactoModel);
		return "redirect:/contacto/contactoList";
	}
	
	//Modificar
	@GetMapping(value = "/contactoForm/{id}")
	public String modificarContacto(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("contactoModel", contactoService.getId(id));
			
		}else {
			model.addAttribute("contactoModel", new ContactoModel());
		}
		return "contactoForm";
	}
	
	//Listar
		@GetMapping("/contactoList")
		public String listarContactos(Model model) {
			model.addAttribute("contactos", contactoService.listAll());
			return "contactoList";
		}
			
		//Borrar por su id
		@RequestMapping("/delete/{id}")
		public String deleteContacto(@PathVariable(name = "id") int id) {
			contactoService.delete(id);
			return "redirect:/contacto/contactoList";     
		}
	
}
