package com.maven.Map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	@JoinTable(name ="emp_learn",joinColumns = {@JoinColumn (name = "eid")},inverseJoinColumns = {@JoinColumn (name = "pid")})
	private List<Product> prod;

	public Emp(int eid, String name, List<Product> prod) {
		super();
		this.eid = eid;
		this.name = name;
		this.prod = prod;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProd() {
		return prod;
	}

	public void setProd(List<Product> prod) {
		this.prod = prod;
	}
	
	

}
