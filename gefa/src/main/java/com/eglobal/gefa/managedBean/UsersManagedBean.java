package com.eglobal.gefa.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.eglobal.gefa.business.delegate.UserBusinessDelegate;
import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.exception.ViewException;

@ManagedBean(name="user")
@ViewScoped
public class UsersManagedBean implements Serializable {
	/**
	 * UID for serializable classes.
	 */
	private static final long serialVersionUID = -2178599835999497346L;
	@ManagedProperty(value="#{userBusinessDelegate}")
	UserBusinessDelegate userBusinessDelegate;
	
	/**
	 * @return the userBusinessDelegate
	 */
	public UserBusinessDelegate getUserBusinessDelegate() {
		return userBusinessDelegate;
	}

	/**
	 * @param userBusinessDelegate the userBusinessDelegate to set
	 */
	public void setUserBusinessDelegate(UserBusinessDelegate userBusinessDelegate) {
		this.userBusinessDelegate = userBusinessDelegate;
	}


	public UsersManagedBean () {
		
	}
	

	@PostConstruct
	public void start() {
		
	}
	
	public List<UserDTO> getUsers(){
		List<UserDTO> result = new ArrayList<UserDTO>();
		try {
			result = userBusinessDelegate.getUsers();
		} catch (ViewException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<RoleDTO> getRoles(){
		List<RoleDTO> result = new ArrayList<RoleDTO>();
		try {
			result = userBusinessDelegate.getRoles();
		} catch (ViewException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<FactoryDTO> getFactories(){
		List<FactoryDTO> result = new ArrayList<FactoryDTO>();
		try {
			result = userBusinessDelegate.getFactories();
		} catch (ViewException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
