package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CollageModel;

public interface CollageService {
	List <CollageModel> listAll();
	void save (CollageModel collageModel);
	void delete (int id);
	CollageModel getId (int id);

}
