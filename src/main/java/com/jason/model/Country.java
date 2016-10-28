package com.jason.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* 
 * This is our model class and it corresponds to Country table in database 
 */
@Entity
@Table(name = "COUNTRY")
public class Country {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(name = "countryName")
	String countryName;

	@Column(name = "gold")
	long gold;

	@Column(name = "silver")
	long silver;

	@Column(name = "bronze")
	long bronze;

	public Country() {
		super();
	}

	public Country(int i, String countryName, long gold, long silver, long bronze) {
		super();
		this.id = i;
		this.countryName = countryName;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getGold() {
		return gold;
	}

	public void setGold(long gold) {
		this.gold = gold;
	}

	public long getSilver() {
		return silver;
	}

	public void setSilver(long silver) {
		this.silver = silver;
	}

	public long getBronze() {
		return bronze;
	}

	public void setBronze(long bronze) {
		this.bronze = bronze;
	}

}