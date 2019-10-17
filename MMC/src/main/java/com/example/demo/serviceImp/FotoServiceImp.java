package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.FotoModel;

import com.example.demo.repository.FotoRepository;
import com.example.demo.service.FotoService;

@Service
public class FotoServiceImp implements FotoService {
	
	@Autowired
	private FotoRepository fotoRepository;
	
	@Override
	public List<FotoModel> listAll(){
		return fotoRepository.findAll();
	}

	@Override
	public void save(FotoModel fotoModel) {
		fotoRepository.save(fotoModel);
		
	}
	@Override
	public void delete(int id) {
		fotoRepository.deleteById(id);
	}
	
	@Override
	public FotoModel getId(int id) {
		return fotoRepository.findById(id).get();
	}

}
