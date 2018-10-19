package com.example.AdminService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AdminService.entities.PlacedCandidate;

public interface PlacedCandidateDAO extends JpaRepository<PlacedCandidate,Integer>{

}