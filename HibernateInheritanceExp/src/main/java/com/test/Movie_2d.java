package com.test;

import jakarta.persistence.Entity;

@Entity


public class Movie_2d extends Movie{
	private String casting;

	public String getCasting() {
		return casting;
	}

	public void setCasting(String casting) {
		this.casting = casting;
	}
	
}
