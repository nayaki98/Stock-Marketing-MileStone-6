package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyDao dao;
	
	public void insertCompany(Company company) {
		dao.save(company);
		
	}
	
	public List<Company> getCompanyList() throws SQLException {
		return dao.findAll();
	}

	@Override
	public Company getCompanyId(int companyCode) {
		
		return dao.getOne(companyCode);
	}

	@Override
	public void updateCompany(Company company) {
		dao.save(company);
		
	}

	@Override
	public void deleteById(int companyCode) {
		dao.deleteById(companyCode);
		
	}

	
	
	/*public boolean updateCompamy(int companyCode,String ceo) throws SQLException{
		boolean result = dao.updateCompamy(companyCode, ceo);
		return result;
	}

	public boolean removeCompanyDetails(int companycode) throws SQLException {
		boolean result =dao.removeCompanyDetails(companycode);
		return result;
	}*/

}
