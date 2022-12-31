package com.maven.Map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	private int pid;
	private String pname;
	
	@ManyToMany (mappedBy = "prod")
	private List<Emp> emp;

	public Product(int pid, String pname, List<Emp> emp) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.emp = emp;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	
	
	

}
