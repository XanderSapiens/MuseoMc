package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ObraModel;

public interface ObraService {
	List < ObraModel> listAll();
	void save ( ObraModel  obraModel);
	void delete (int id);
	ObraModel getId (int id);

}
