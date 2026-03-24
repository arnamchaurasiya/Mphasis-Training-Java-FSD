package com.test;

import javax.annotation.processing.Generated;

import jakarta.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")

public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	
	
	private String cus_name;
		
	private String cus_details;
	
	private String cus_city;
	
	public int getid() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getCus_details() {
		return cus_details;
	}
	
	public void setCus_details(String cus_details) {
		this.cus_details = cus_details;
	}
	
	public String getCus_city() {
		return cus_city;
	}
	
	public void setCus_city(String cus_city) {
		this.cus_city = cus_city;
	}

	
}