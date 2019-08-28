package com.example.stockspring.model;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="stock_price_details")
public class StockPrice {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stock_code")
	private int stockCode;


	@Column(name="company_code")
	private int companyCode;
	
	
	@Column(name="stock_exchange_id")
	private int stockExchangeId;
	
	@Column(name="stock_exchange_name")
	private String stockExchangeName;
	
	

	@Column(name="current_price")
	private double currentPrice;
	
	@Column(name="date")
	private Date date;
	

	@Column(name="time")
	private Time time;

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockEx) {
		this.stockExchangeName = stockEx;
	}
	

	public int getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double price) {
		this.currentPrice = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	public int getStockCode() {
		return stockCode;
	}

	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	

	
}
