/*package com.example.stockspring.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao{

	
	
public List<Company> getCompanyList() throws SQLException {
		
		List <Company> companyList=new ArrayList<Company>();
		try{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/stock","root","root");
		PreparedStatement ps=conn.prepareStatement("select * from company");
		ResultSet rs=	ps.executeQuery();
		Company company=null;
		while(rs.next()){
			 company=new Company();
			company.setCompanyCode(rs.getInt("company_code"));;
			company.setBoardOfDirectors(rs.getString("boardofdirectors"));
			company.setBriefWriteup(rs.getString("breifwriteup"));
			company.setCeo(rs.getString("ceo"));
			company.setTurnOver(rs.getInt("stock_Code"));
			company.setCompanyName(rs.getString("company_Name"));
			companyList.add(company);
		}
		}
		catch(SQLException e){
			System.out.println(e);
			throw e;
		}
		return companyList;
	}

	
	
	
	
	
	

public boolean updateCompamy(int companyCode,String ceo) throws SQLException  {
boolean result = false;
try{  
	Connection conn=DriverManager.getConnection( "jdbc:mysql://localhost:3306/stock","root","root"); 
	PreparedStatement ps=conn.prepareStatement("update company set ceo=? where company_code=?");
	ps.setInt(2, companyCode);
	ps.setString(1, ceo);
	int rs=ps.executeUpdate();
	if(rs>0)
		result=true;

	else
		result=false;
}
catch(SQLException e){
	System.out.println(e);
	throw e;
}
return result;
}

public boolean removeCompanyDetails(int companycode) throws SQLException {
boolean result = false;
try{  
	Connection conn=DriverManager.getConnection( "jdbc:mysql://localhost:3306/stock","root","root"); 
	PreparedStatement ps=conn.prepareStatement("delete from company where company_code=?");
	ps.setInt(1, companycode);
	int rs=ps.executeUpdate();
	if(rs>0)
		result=true;

	else
		result=false;
}
catch(SQLException e){
	System.out.println(e);
	throw e;
}
return result;

}
public void insertCompany(Company company) {

try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/stock","root","root");  
PreparedStatement ps=con.prepareStatement("insert into company(stock_Code,company_Name,turnover,ceo,boardofdirectors,breifwriteup) value(?,?,?,?,?,?)");
//ps.setInt(1, company.getCompanyCode());
ps.setString(2, company.getCompanyName());
ps.setDouble(3, company.getTurnOver());
ps.setString(4, company.getCeo());
ps.setString(5, company.getBoardOfDirectors());
//ps.setInt(6, company.getSectorOd());
ps.setString(6, company.getBriefWriteup());
ps.setInt(1, company.getStockCode());
int result=ps.executeUpdate();
if(result>0) {
	System.out.println("inserted");
}
else
{
	System.out.println("not inserted");
}
}
catch (Exception e) {
e.printStackTrace();
}
}
}
*/