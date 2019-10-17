package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.VisitaModel;

import com.example.demo.repository.VisitaRepository;
import com.example.demo.service.VisitaService;

@Service
public class VisitaServiceImp implements VisitaService {
	
	@Autowired
	private VisitaRepository visitaRepository;
	
	@Override
	public List<VisitaModel> listAll(){
		return visitaRepository.findAll();
	}

	@Override
	public void save(VisitaModel visitaModel) {
		visitaRepository.save(visitaModel);
		
	}
	@Override
	public void delete(int id) {
		visitaRepository.deleteById(id);
	}
	
	@Override
	public VisitaModel getId(int id) {
		return visitaRepository.findById(id).get();
	}

}
