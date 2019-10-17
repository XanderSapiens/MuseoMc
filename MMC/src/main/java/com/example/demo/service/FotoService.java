package com.example.demo.service;

import java.util.List;

import com.example.demo.model.FotoModel;

public interface FotoService {
	List <FotoModel> listAll();
	void save (FotoModel fotoModel);
	void delete (int id);
	FotoModel getId (int id);

}
