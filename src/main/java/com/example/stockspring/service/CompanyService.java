package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;

public interface CompanyService {

	
	void insertCompany(Company company);
	public List<Company> getCompanyList() throws SQLException;
	/*public boolean updateCompamy(int companyCode,String ceo) throws SQLException;
	public boolean removeCompanyDetails(int companycode) throws SQLException;*/
	public Company getCompanyId(int companyCode);
	void updateCompany(Company company);
	public void deleteById(int companyCode);
	
}
