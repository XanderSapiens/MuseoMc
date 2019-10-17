package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.MaterialEduModel;

import com.example.demo.repository.MaterialEduRepository;
import com.example.demo.service.MaterialEduService;

@Service
public class MaterialEduServiceImp implements MaterialEduService {
	
	@Autowired
	private MaterialEduRepository materialEduRepository;
	
	@Override
	public List<MaterialEduModel> listAll(){
		return materialEduRepository.findAll();
	}

	@Override
	public void save(MaterialEduModel materialEduModel) {
		materialEduRepository.save(materialEduModel);
		
	}
	@Override
	public void delete(int id) {
		materialEduRepository.deleteById(id);
	}
	
	@Override
	public MaterialEduModel getId(int id) {
		return materialEduRepository.findById(id).get();
	}

}
