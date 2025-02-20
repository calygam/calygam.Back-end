package com.calygam.back.enums;

public enum UserRankEnum {
		BRONZE(0),
		BRONZEII(500),
		BRONZEIII(1000),
		
		SILVER(1500),
		SILVERII(2000),
		SILVERIII(2500),
		IRON(3000),
		IRONII(3500),
		IRONIII(4000),	
		GOLD(4500),
		GOLDII(5000),
		PLATINUM(5500),
		PLATINUMI(6000),
		PLATINUMII(6500),
		
		DIAMOND(7000),
		DIAMONDII(7500),
		DIAMOUNDIII(8000),
		
		ASCENDENT(10000),
		ASCENDENTII(12000),
		ASCENDENTIII(15000);
	
	private Integer points;

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	private UserRankEnum(Integer points) {
		this.points = points;
	}
	
	
}
