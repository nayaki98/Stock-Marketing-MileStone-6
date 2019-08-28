package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import com.example.stockspring.model.IPODetail;

public interface IPODetailService {

	public void insertIPODetail(IPODetail ipo) throws SQLException;
	public List<IPODetail> getIpodetailList() throws SQLException;
	public IPODetail getipoId(int ipoId);
	public void updateIpo(IPODetail ipodetail);
	public void deleteById(int ipoId);

}
