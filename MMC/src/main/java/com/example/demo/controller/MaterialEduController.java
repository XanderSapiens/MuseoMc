package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.model.MaterialEduModel;
import com.example.demo.service.MaterialEduService;

@Controller
@RequestMapping("/materialEdu")
public class MaterialEduController {
	
	@Autowired
	private MaterialEduService materialEduService;
	
	/*Crear*/
	@GetMapping("/materialEduForm")
	public String formMaterialEdu(Model model) {
		MaterialEduModel materialEduModel = new MaterialEduModel();
		model.addAttribute("materialEduModel",materialEduModel);
		model.addAttribute("materialEdus",materialEduService.listAll());
		return "materialEduForm";
	}
	
	/*Post mapping de crear*/
	@PostMapping("/save")
	public String saveMaterialEdu(@Valid MaterialEduModel materialEduModel, Model model) {
		materialEduService.save(materialEduModel);
		return "redirect:/materialEdu/materialEduList";
	}
	
	//Modificar
			@GetMapping(value = "/materialEduForm/{id}")
			public String modificarMaterialEdu(@PathVariable("id") Integer id, Model model) {
				if(id != null && id != 0) {
					model.addAttribute("materialEduModel", materialEduService.getId(id));
					
				}else {
					model.addAttribute("materialEduModel", new MaterialEduModel());
				}
				return "materialEduForm";
			}
			
			//Listar
			@GetMapping("/materialEduList")
			public String listarMaterialEdu(Model model) {
				model.addAttribute("materialEdus",materialEduService.listAll());
				return "materialEduList";
			}
						
			//Borrar por su id
			@RequestMapping("/delete/{id}")
			public String deleteMaterialEdu(@PathVariable(name = "id") int id) {
				materialEduService.delete(id);
				return "redirect:/materialEdu/materialEduList";     
			}

}
