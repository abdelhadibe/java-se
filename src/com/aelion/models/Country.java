package com.aelion.models;

import java.sql.ResultSet;

import com.aelion.models.annotations.Column;
import com.aelion.models.annotations.Table;

@Table(name="country")
public final class Country extends Model{
	@Column(name="country_id")
	private int id;

	@Column(name="country")
	private String country;
	
	public Country() {
		super();
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void hydrate(ResultSet res) {
		// TODO Auto-generated method stub
		
	}
	
}
