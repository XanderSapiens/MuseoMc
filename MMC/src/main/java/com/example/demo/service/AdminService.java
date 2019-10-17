package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AdminModel;

public interface AdminService {
	List <AdminModel> listAll();
	void save (AdminModel adminModel);
	void delete (int id);
	AdminModel getId (int id);

}
