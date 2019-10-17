package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.ContactoModel;

import com.example.demo.repository.ContactoRepository;
import com.example.demo.service.ContactoService;

@Service
public class ContactoServiceImp implements ContactoService {
	
	@Autowired
	private ContactoRepository contactoRepository;
	
	@Override
	public List<ContactoModel> listAll(){
		return contactoRepository.findAll();
	}

	@Override
	public void save(ContactoModel contactoModel) {
		contactoRepository.save(contactoModel);
		
	}
	@Override
	public void delete(int id) {
		contactoRepository.deleteById(id);
	}
	
	@Override
	public ContactoModel getId(int id) {
		return contactoRepository.findById(id).get();
	}


}
