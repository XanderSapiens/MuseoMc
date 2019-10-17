package com.example.demo.service;

import java.util.List;

import com.example.demo.model.VisitaModel;

public interface VisitaService {
	List < VisitaModel> listAll();
	void save ( VisitaModel  visitaModel);
	void delete (int id);
	VisitaModel getId (int id);

}
