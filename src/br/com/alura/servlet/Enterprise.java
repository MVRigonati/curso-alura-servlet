package br.com.alura.servlet;

import java.util.Date;

public class Enterprise {

	private Integer id;
	private String name;
	private Date openDate;

	public Enterprise(String enterpriseName) {
		name = enterpriseName;
	}

	public Enterprise(String name, Date openDate) {
		this.name = name;
		this.openDate = openDate;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Date getOpenDate() {
		return openDate;
	}
	
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	
}
