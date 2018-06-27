package com.eglobal.gefa.managedBean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.eglobal.gefa.dto.UserDTO;

@ManagedBean(name="user")
@ViewScoped
public class UsersManagedBean implements Serializable {
	/**
	 * UID for serializable classes.
	 */
	private static final long serialVersionUID = -2178599835999497346L;
	
	private UserDTO user;
	
	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public UsersManagedBean() {
		
	}

	@PostConstruct
	public void start() {
		
	}
	
	
}
