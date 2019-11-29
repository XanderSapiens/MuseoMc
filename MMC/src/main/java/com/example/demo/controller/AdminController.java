package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.AdminModel;

import com.example.demo.service.AdminService;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/login")
	public String login(@Valid AdminModel adminModel, Model model) {
		adminService.save(adminModel);
		return "redirect:/admin/adminList";
	}
	
	/*Crear*/
	@GetMapping("/adminForm")
	public String formAdmin(Model model) {
		AdminModel adminModel = new AdminModel();
		model.addAttribute("adminModel",adminModel);
		model.addAttribute("admins",adminService.listAll());
		return "adminForm";
	}
	
	/*Post mapping de crear*/
	@PostMapping("/save")
	public String saveAdmin(@Valid AdminModel adminModel, Model model) {
		adminService.save(adminModel);
		return "redirect:/admin/adminList";
	}
	
	//Modificar
	@GetMapping(value = "/adminForm/{id}")
	public String modificarAdmin(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("adminModel", adminService.getId(id));
			
		}else {
			model.addAttribute("adminModel", new AdminModel());
		}
		return "adminForm";
	}
	
	//Listar
	@GetMapping("/adminList")
	public String listarAdmins(Model model) {
		model.addAttribute("admins", adminService.listAll());
		return "adminList";
	}
		
	//Borrar por su id
	@RequestMapping("/delete/{id}")
	public String deleteAdmin(@PathVariable(name = "id") int id) {
		adminService.delete(id);
		return "redirect:/admin/adminList";     
	}

}
