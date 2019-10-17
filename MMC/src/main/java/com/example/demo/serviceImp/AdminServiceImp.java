package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminModel;

import com.example.demo.repository.AdminRepository;

import com.example.demo.service.AdminService;

@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public List<AdminModel> listAll(){
		return adminRepository.findAll();
	}

	@Override
	public void save(AdminModel adminModel) {
		adminRepository.save(adminModel);
		
	}
	@Override
	public void delete(int id) {
		adminRepository.deleteById(id);
	}
	
	@Override
	public AdminModel getId(int id) {
		return adminRepository.findById(id).get();
	}

}
