package com.example.stockspring.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="company")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="company_code")
	private int companyCode;
	
    @NotEmpty(message="please enter username")
	@Column(name="company_Name")
	private String companyName;
	
    
	@Column(name="turnover")
	private BigDecimal turnOver;
	
    @NotEmpty(message="please enter ceo")
	@Column(name="ceo")
	private String ceo;
	
    @NotEmpty(message="please enter boardofdirectors")
	@Column(name="boardofdirectors")
	private String boardOfDirectors;
	
	@Transient
	private String stockExchanges;
	
	
	@Column(name="sector_id")
	private int sectorId;
	
	@NotEmpty(message="please enter breifwriteup")
	@Column(name="breifwriteup")
	private String briefWriteup;
	
	
	@Column(name="stock_Code")
	private int stockCode;
	
	public String getCompanyName() {
		return companyName;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public BigDecimal getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(BigDecimal turnOver) {
		this.turnOver = turnOver;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public String getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(String stockExchanges) {
		this.stockExchanges = stockExchanges;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		
		return "companyCode=" + companyCode + " companyName=" + companyName + " turnOver=" + turnOver
				+ " ceo=" + ceo + " boardOfDirectors=" + boardOfDirectors + " stockExchanges=" + stockExchanges
				+ " sectorId=" + sectorId + " briefWriteup=" + briefWriteup + " stockCode=" + stockCode + "\n";
	}

	
}
