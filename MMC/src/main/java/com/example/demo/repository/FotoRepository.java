package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FotoModel;

@Repository
public interface FotoRepository extends JpaRepository<FotoModel, Integer> {

}
