package com.example.demo.service;

import java.util.List;


import com.example.demo.model.NoticiaModel;

public interface NoticiaService {
	List <NoticiaModel> listAll();
	void save (NoticiaModel noticiaModel);
	void delete (int id);
	NoticiaModel getId (int id);
}
