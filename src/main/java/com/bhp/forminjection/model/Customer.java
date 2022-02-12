package com.bhp.forminjection.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "[customer]")
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	private int spvid;
	private String name;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	


	public Customer(long id, String name, String address, int spvid) {
		super();
		this.id = id;
		this.spvid = spvid;
		this.name = name;
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getSpvid() {
		return spvid;
	}

	public void setSpvid(int spvid) {
		this.spvid = spvid;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
