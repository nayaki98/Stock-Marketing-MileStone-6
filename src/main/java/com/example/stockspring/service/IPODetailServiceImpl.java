package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.IPODetailDao;
import com.example.stockspring.model.IPODetail;


@Service
public class IPODetailServiceImpl implements IPODetailService {

	@Autowired
	private IPODetailDao ipodao;
	
	
	public void insertIPODetail(IPODetail ipo) throws SQLException {
		ipodao.save(ipo);
			}
	public List<IPODetail> getIpodetailList() throws SQLException
	{
		return ipodao.findAll();
	}
	@Override
	public IPODetail getipoId(int ipoId) {
		
		return ipodao.getOne(ipoId);
	}
	@Override
	public void updateIpo(IPODetail ipodetail) {
		ipodao.save(ipodetail);
	}
	@Override
	public void deleteById(int ipoId) {
		// TODO Auto-generated method stub
		ipodao.deleteById(ipoId);
	}

}
