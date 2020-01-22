package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.CollageModel;

import com.example.demo.repository.CollageRepository;
import com.example.demo.service.CollageService;

@Service
public class CollageServiceImp implements CollageService {
	
	@Autowired
	private CollageRepository collageRepository;
	
	@Override
	public List<CollageModel> listAll(){
		return collageRepository.findAll();
	}

	@Override
	public void save(CollageModel collageModel) {
		collageRepository.save(collageModel);
		
	}
	@Override
	public void delete(int id) {
		collageRepository.deleteById(id);
	}
	
	@Override
	public CollageModel getId(int id) {
		return collageRepository.findById(id).get();
	}

}