package com.example.stockspring.model;

import javax.persistence.*;

@Entity
@Table(name="sector")
public class Sector {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sector_id")
	private int sectorId;
	
	@Column(name="sector_name")
	private String sectorName;
	
	private String brief;

	public int getSectorId() {
		return sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}
	
	 
	
}
