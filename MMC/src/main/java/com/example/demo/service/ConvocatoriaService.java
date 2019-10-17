package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ConvocatoriaModel;

public interface ConvocatoriaService {
	List <ConvocatoriaModel> listAll();
	void save (ConvocatoriaModel convocatoriaModel);
	void delete (int id);
	ConvocatoriaModel getId (int id);

}
