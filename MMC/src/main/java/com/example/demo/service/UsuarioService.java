package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UsuarioModel;

public interface UsuarioService {
	List <UsuarioModel> listAll();
	void save (UsuarioModel usuarioModel);
	void delete (int id);
	UsuarioModel getId (int id);

}
