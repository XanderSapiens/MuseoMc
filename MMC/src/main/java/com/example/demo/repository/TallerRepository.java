package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TallerModel;

@Repository
public interface TallerRepository extends JpaRepository<TallerModel, Integer> {

}
