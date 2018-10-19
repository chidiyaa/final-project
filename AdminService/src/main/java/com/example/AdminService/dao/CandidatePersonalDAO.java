package com.example.AdminService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AdminService.entities.CandidatePersonal;

public interface CandidatePersonalDAO extends JpaRepository <CandidatePersonal,String> {


}