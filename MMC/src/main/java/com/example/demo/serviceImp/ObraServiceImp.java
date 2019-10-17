package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.ObraModel;

import com.example.demo.repository.ObraRepository;
import com.example.demo.service.ObraService;

@Service
public class ObraServiceImp implements ObraService {
	
	@Autowired
	private  ObraRepository obraRepository;
	
	@Override
	public List< ObraModel> listAll(){
		return  obraRepository.findAll();
	}

	@Override
	public void save(ObraModel obraModel) {
		obraRepository.save(obraModel);
		
	}
	@Override
	public void delete(int id) {
		obraRepository.deleteById(id);
	}
	
	@Override
	public ObraModel getId(int id) {
		return obraRepository.findById(id).get();
	}

}
