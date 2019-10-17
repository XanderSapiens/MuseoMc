package com.example.demo.service;

import java.util.List;

import com.example.demo.model.MaterialEduModel;

public interface MaterialEduService {
	List < MaterialEduModel> listAll();
	void save ( MaterialEduModel  materialEduModel);
	void delete (int id);
	MaterialEduModel getId (int id);

}
