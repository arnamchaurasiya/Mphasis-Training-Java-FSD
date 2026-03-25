package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		private String m_name;
		
		private String m_location;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getM_name() {
			return m_name;
		}

		public void setM_name(String m_name) {
			this.m_name = m_name;
		}

		public String getM_location() {
			return m_location;
		}

		public void setM_location(String m_location) {
			this.m_location = m_location;
		}

}
