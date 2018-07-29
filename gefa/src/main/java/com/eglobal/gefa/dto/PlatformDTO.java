package com.eglobal.gefa.dto;

import java.io.Serializable;

public class PlatformDTO implements Serializable{
	/** UID for serializable classes */
	private static final long serialVersionUID = 1503190440595462742L;
	/** Platform id */
	private String id;
	/** Platform name */
	private String name;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
