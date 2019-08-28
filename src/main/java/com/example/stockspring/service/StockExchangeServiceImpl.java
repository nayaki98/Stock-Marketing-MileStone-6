package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.stockspring.dao.StockExchangeDao;
import com.example.stockspring.model.StockExchange;


@Service
public class StockExchangeServiceImpl implements StockExchangeService {

	@Autowired
	StockExchangeDao stockexchangedao;

	public void insertStockexchange(StockExchange stockExchange) {
		stockexchangedao.save(stockExchange);
		
	}
	public  List<StockExchange> getstockExchangeList() throws SQLException
	{
		return stockexchangedao.findAll();
	}

	public StockExchange getStockExchangeId(int stockExchangeId) {
		return stockexchangedao.getOne(stockExchangeId);
	}
	@Override
	public void updateStockExchange(StockExchange stockexchange) {
		
		stockexchangedao.save(stockexchange);
	}
	@Override
	public void deleteById(int stockExchangeId) {
		stockexchangedao.deleteById(stockExchangeId);
		
	}
}
