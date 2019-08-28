package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;

public interface CompanyController {

	
	public List<Company> getCompanyList() throws SQLException;
	
	
	/*public boolean updateCompamy(int companyCode,String ceo) throws SQLException;
	public boolean removeCompanyDetails(int companycode) throws SQLException;
	public ModelAndView getCompanyList() throws Exception;
	public void insertCompany(Company company) throws SQLException;;*/
	
}
