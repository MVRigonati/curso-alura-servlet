package br.com.alura.servlet;

public class Enterprise {

	private Integer id;
	private String name;

	public Enterprise(String enterpriseName) {
		name = enterpriseName;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
