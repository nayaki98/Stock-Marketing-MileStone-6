package com.example.stockspring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="ipo_planned")
public class IPODetail {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

@Column(name="Company_code")
private int companycode;


@Column(name=" Stock_exchange_id")
private int stockExchangeId;

@Column(name="price_per_share")
private double price;

@Column(name="total_no_of_shares")
private int totalShares;

@Column(name="open_date_time")
private String dateTime;

@NotEmpty(message="please enter remark")
@Column(name="remarks")
private String remarks;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getCompanycode() {
	return companycode;
}

public void setCompanycode(int companycode) {
	this.companycode = companycode;
}


public int getStockExchangeId() {
	return stockExchangeId;
}

public void setStockExchangeId(int stockExchangeId) {
	this.stockExchangeId = stockExchangeId;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getTotalShares() {
	return totalShares;
}

public void setTotalShares(int totalShares) {
	this.totalShares = totalShares;
}

public String getDateTime() {
	return dateTime;
}

public void setDateTime(String dateTime) {
	this.dateTime = dateTime;
}

public String getRemarks() {
	return remarks;
}

public void setRemarks(String remarks) {
	this.remarks = remarks;
}




}
