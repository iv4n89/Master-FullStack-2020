package domain;

import java.io.Serializable;

public class Persona implements Serializable{
	private String name;
	private String subName;
	
	public Persona() {
		super();
	}
	
	public Persona(String name, String subName) {
		this.name=name;
		this.subName=subName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Name: "+name + ", subName" + subName;
	}
	
	
	
}
