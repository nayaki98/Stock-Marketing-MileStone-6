package com.example.stockspring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.IPODetail;

public interface IPODetailDao extends JpaRepository<IPODetail, Integer>{

	public List<IPODetail> findBycompanycode(int companycode);

	

}
