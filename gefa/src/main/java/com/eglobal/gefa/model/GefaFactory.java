package com.eglobal.gefa.model;
// Generated 25/07/2018 08:37:44 PM by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;

/**
 * GefaFactory generated by hbm2java
 */
public class GefaFactory implements java.io.Serializable {

	private String factoryId;
	private String name;
	private Double rate1;
	private Double rate2;
	private Double rate3;
	private Set gefaWorkOrders = new HashSet(0);
	private Set gefaUsers = new HashSet(0);

	public GefaFactory() {
	}

	public GefaFactory(String factoryId) {
		this.factoryId = factoryId;
	}

	public GefaFactory(String factoryId, String name, Double rate1, Double rate2, Double rate3, Set gefaWorkOrders,
			Set gefaUsers) {
		this.factoryId = factoryId;
		this.name = name;
		this.rate1 = rate1;
		this.rate2 = rate2;
		this.rate3 = rate3;
		this.gefaWorkOrders = gefaWorkOrders;
		this.gefaUsers = gefaUsers;
	}

	public String getFactoryId() {
		return this.factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRate1() {
		return this.rate1;
	}

	public void setRate1(Double rate1) {
		this.rate1 = rate1;
	}

	public Double getRate2() {
		return this.rate2;
	}

	public void setRate2(Double rate2) {
		this.rate2 = rate2;
	}

	public Double getRate3() {
		return this.rate3;
	}

	public void setRate3(Double rate3) {
		this.rate3 = rate3;
	}

	public Set getGefaWorkOrders() {
		return this.gefaWorkOrders;
	}

	public void setGefaWorkOrders(Set gefaWorkOrders) {
		this.gefaWorkOrders = gefaWorkOrders;
	}

	public Set getGefaUsers() {
		return this.gefaUsers;
	}

	public void setGefaUsers(Set gefaUsers) {
		this.gefaUsers = gefaUsers;
	}

}
