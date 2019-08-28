package com.example.stockspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.StockPrice;


@Service
public class StockPriceServiceImpl implements StockPriceService {

	
	@Autowired
	private StockPriceDao stockpricedao;

	public void insertStockPriceDetail(StockPrice stockprice) {
		stockpricedao.save(stockprice);
		
	}

}
