package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.UsuarioModel;
import com.example.demo.repository.UsuarioRespository;
import com.example.demo.service.UsuarioService;

public class UsuarioServiceImp implements UsuarioService {
	
	@Autowired
	private UsuarioRespository usuarioRepository;
	
	@Override
	public List<UsuarioModel> listAll(){
		return usuarioRepository.findAll();
	}

	@Override
	public void save(UsuarioModel usuarioModel) {
		usuarioRepository.save(usuarioModel);
		
	}
	@Override
	public void delete(int id) {
		usuarioRepository.deleteById(id);
	}
	
	@Override
	public UsuarioModel getId(int id) {
		return usuarioRepository.findById(id).get();
	}

}
