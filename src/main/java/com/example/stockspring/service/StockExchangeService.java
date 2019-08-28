package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import com.example.stockspring.model.StockExchange;

public interface StockExchangeService {


	void insertStockexchange(StockExchange stockExchange);

	public List<StockExchange> getstockExchangeList() throws SQLException;

	public StockExchange getStockExchangeId(int stockExchangeId);

	public void updateStockExchange(StockExchange stockexchange);

	public void deleteById(int stockExchangeId); 

}
