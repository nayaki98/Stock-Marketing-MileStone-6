package com.example.stockspring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.stockspring.model.Company;
public interface CompanyDao extends JpaRepository<Company, Integer> {
	
	public List<Company> findBySectorId(int sectorId);
	
	@Query("Select c From Company c where c. companyName like %:namepattern%")
	List<Company> findByNameWithPattern(@Param("namepattern") String namepattern);

	public Company findBycompanyName(String companyName);

	@Query("select c.companyCode from Company c where c.sectorId=:sectorid")
	public int[] findCompanycode1(@Param("sectorid") int sectorid);

	
	
	
	

}

/*public void insertCompany(Company company);
public List<Company> getCompanyList() throws SQLException;
public boolean updateCompamy(int companyCode,String ceo) throws SQLException;
public boolean removeCompanyDetails(int companycode) throws SQLException;*/