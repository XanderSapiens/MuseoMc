package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TallerModel;
import com.example.demo.repository.TallerRepository;
import com.example.demo.service.TallerService;

@Service
public class TallerServiceImp implements TallerService {
	
	@Autowired
	private TallerRepository tallerRepository;
	
	@Override
	public List<TallerModel> listAll(){
		return tallerRepository.findAll();
	}

	@Override
	public void save(TallerModel tallerModel) {
		tallerRepository.save(tallerModel);
		
	}
	@Override
	public void delete(int id) {
		tallerRepository.deleteById(id);
	}
	
	@Override
	public TallerModel getId(int id) {
		return tallerRepository.findById(id).get();
	}

}
