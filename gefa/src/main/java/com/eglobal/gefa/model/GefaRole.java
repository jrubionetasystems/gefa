package com.eglobal.gefa.model;
// Generated 25/07/2018 08:37:44 PM by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;

/**
 * GefaRole generated by hbm2java
 */
public class GefaRole implements java.io.Serializable {

	private String roleId;
	private String name;
	private Set gefaUsers = new HashSet(0);

	public GefaRole() {
	}

	public GefaRole(String roleId, String name) {
		this.roleId = roleId;
		this.name = name;
	}

	public GefaRole(String roleId, String name, Set gefaUsers) {
		this.roleId = roleId;
		this.name = name;
		this.gefaUsers = gefaUsers;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getGefaUsers() {
		return this.gefaUsers;
	}

	public void setGefaUsers(Set gefaUsers) {
		this.gefaUsers = gefaUsers;
	}

}
