package com.eglobal.gefa.dto;

import java.io.Serializable;


public class FactoryDTO  implements Serializable {
	/**
	 * UID for serializable classes.
	 */
	private static final long serialVersionUID = -8493628401070691935L;
	String id;
	String factoryName;
	public FactoryDTO() {
		super();
	}
	/**
	 * @param id
	 * @param factoryName
	 */
	public FactoryDTO(String id, String factoryName) {
		super();
		this.id = id;
		this.factoryName = factoryName;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the factoryName
	 */
	public String getFactoryName() {
		return factoryName;
	}
	/**
	 * @param factoryName the factoryName to set
	 */
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}	
}
