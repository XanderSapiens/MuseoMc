package com.example.demo.service;

import java.util.List;


import com.example.demo.model.ContactoModel;

public interface ContactoService {
	List <ContactoModel> listAll();
	void save (ContactoModel contactoModel);
	void delete (int id);
	ContactoModel getId (int id);

}
