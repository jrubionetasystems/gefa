package com.eglobal.gefa.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.eglobal.gefa.business.UserBusiness;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.exception.BusinessException;

@ManagedBean(name="user")
@ViewScoped
public class UsersManagedBean implements Serializable {
	/**
	 * UID for serializable classes.
	 */
	private static final long serialVersionUID = -2178599835999497346L;
	@ManagedProperty(value="#{userBusiness}")
	UserBusiness userBusiness;
	
	public UsersManagedBean () {
		
	}
	
	/**
	 * @return the userBusiness
	 */
	public UserBusiness getUserBusiness() {
		return userBusiness;
	}

	/**
	 * @param userBusiness the userBusiness to set
	 */
	public void setUserBusiness(UserBusiness userBusiness) {
		this.userBusiness = userBusiness;
	}

	@PostConstruct
	public void start() {
		
	}
	
	public List<UserDTO> getUsers(){
		List<UserDTO> result = new ArrayList<UserDTO>();
		try {
			result = userBusiness.getUsers();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<RoleDTO> getRoles(){
		List<RoleDTO> result = new ArrayList<RoleDTO>();
		try {
			result = userBusiness.getRoles();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
