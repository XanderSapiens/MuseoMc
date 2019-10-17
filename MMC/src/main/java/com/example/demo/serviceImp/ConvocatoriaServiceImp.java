package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ConvocatoriaModel;

import com.example.demo.repository.ConvocatoriaRepository;
import com.example.demo.service.ConvocatoriaService;

@Service
public class ConvocatoriaServiceImp implements ConvocatoriaService {
	
	@Autowired
	private ConvocatoriaRepository convocatoriaRepository;
	
	@Override
	public List<ConvocatoriaModel> listAll(){
		return convocatoriaRepository.findAll();
	}

	@Override
	public void save(ConvocatoriaModel convocatoriaModel) {
		convocatoriaRepository.save(convocatoriaModel);
		
	}
	@Override
	public void delete(int id) {
		convocatoriaRepository.deleteById(id);
	}
	
	@Override
	public ConvocatoriaModel getId(int id) {
		return convocatoriaRepository.findById(id).get();
	}

}
