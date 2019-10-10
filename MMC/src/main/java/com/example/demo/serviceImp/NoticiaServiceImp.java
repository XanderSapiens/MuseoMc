package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.NoticiaModel;
import com.example.demo.repository.NoticiaRepository;
import com.example.demo.service.NoticiaService;

@Service
public class NoticiaServiceImp implements NoticiaService  {
	
	@Autowired
	private NoticiaRepository noticiaRepository;
	
	@Override
	public List<NoticiaModel> listAll(){
		return noticiaRepository.findAll();
	}

	@Override
	public void save(NoticiaModel noticiaModel) {
		noticiaRepository.save(noticiaModel);
		
	}
	@Override
	public void delete(int id) {
		noticiaRepository.deleteById(id);
	}
	
	@Override
	public NoticiaModel getId(int id) {
		return noticiaRepository.findById(id).get();
	}

}
