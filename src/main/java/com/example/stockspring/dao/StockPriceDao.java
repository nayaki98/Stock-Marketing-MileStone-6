package com.example.stockspring.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.stockspring.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice, Integer>{

	@Query("Select s From StockPrice s where s.companyCode=:companyCode and s.date between :startdate and :enddate")
	public List<StockPrice> findBydate1(@Param("companyCode") int companyCode,@Param("startdate")Date startdate,@Param("enddate")Date enddate);

   
    @Query("Select s.currentPrice from StockPrice s where s.companyCode= :companyCode and s.date between :startdate and :enddate")
	public List<Double> findBycompanyCode(@Param("companyCode") int companyCode,@Param("startdate") Date startdate, @Param("enddate") Date enddate);

	
	
	/*//select s.currentPrice from ((StockPrice s join Company c on c.stockCode=s.stockCode) join Sector t on t.sectorId=c.sectorId);
	@Query("select s.currentPrice from ((StockPrice s join Company c on c.stockCode=s.stockCode) join Sector t on t.sectorId=c.sectorId)")
	public List<StockPrice> findStockPrice1();*/

}
