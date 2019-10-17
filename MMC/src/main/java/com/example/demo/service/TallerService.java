package com.example.demo.service;

import java.util.List;


import com.example.demo.model.TallerModel;

public interface TallerService {
	List < TallerModel> listAll();
	void save ( TallerModel  tallerModel);
	void delete (int id);
	TallerModel getId (int id);

}
