package com.eglobal.gefa.dto;

import java.io.Serializable;
import java.util.Date;

public class WorkOrderDTO implements Serializable {

	/** UID for serializable classes */
	private static final long serialVersionUID = -8693834108637447377L;
	/** Work Order Id */
	private String id;
	/** Order Id name */
	private String name;
	/** Factory that is going to develop the wrk order */
	private FactoryDTO factory;
	/** Estimated hours to execute the work order */
	private Integer hours;
	/** Start Date for work order */
	private Date startDate;
	/** Finish date for work order */
	private Date finishDate;
	/** Creation Date for work order */
	private Date creationDate;
	/** Last Update Date for work order */
	private Date lastUpdateDate;
	/** Complexity of work order */
	private String complexity;
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
	/**
	 * @return the factory
	 */
	public FactoryDTO getFactory() {
		return factory;
	}
	/**
	 * @param factory the factory to set
	 */
	public void setFactory(FactoryDTO factory) {
		this.factory = factory;
	}
	/**
	 * @return the hours
	 */
	public Integer getHours() {
		return hours;
	}
	/**
	 * @param hours the hours to set
	 */
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the finishDate
	 */
	public Date getFinishDate() {
		return finishDate;
	}
	/**
	 * @param finishDate the finishDate to set
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @return the lastUpdateDate
	 */
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	/**
	 * @param lastUpdateDate the lastUpdateDate to set
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	/**
	 * @return the complexity
	 */
	public String getComplexity() {
		return complexity;
	}
	/**
	 * @param complexity the complexity to set
	 */
	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

}
