package com.eglobal.gefa.dto;

import java.io.Serializable;

public class RoleDTO  implements Serializable {
	
	/**
	 * @param roleId
	 * @param roleName
	 */
	public RoleDTO(String roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	/**
	 * UID for serializable classes.
	 */
	private static final long serialVersionUID = 3984778276949983950L;
	/**
	 * Role Id
	 */
	private String roleId;
	/**
	 * Role name
	 */
	private String roleName;
	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(final String roleId) {
		this.roleId = roleId;
	}
	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(final String roleName) {
		this.roleName = roleName;
	}
}
