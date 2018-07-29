package com.eglobal.gefa.business.delegate.impl;

import java.io.Serializable;
import java.util.List;

import com.eglobal.gefa.business.UserBusiness;
import com.eglobal.gefa.business.delegate.UserBusinessDelegate;
import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.exception.BusinessException;
import com.eglobal.gefa.exception.ViewException;

public class UserBusinessDelegateImpl implements UserBusinessDelegate, Serializable {

	/**
	 * UID for serializable classes.
	 */
	private static final long serialVersionUID = -8672289433529625477L;
	
	private UserBusiness userBusiness;
	
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

	@Override
	public List<UserDTO> getUsers() throws ViewException {
		List<UserDTO> result = null;
		try {
			result = userBusiness.getUsers();
			return result;
		} catch (BusinessException e) {
			throw new ViewException(e.getMessage());
		}
	}

	@Override
	public List<RoleDTO> getRoles() throws ViewException {
		List<RoleDTO> result = null;
		try {
			result = userBusiness.getRoles();
			return result;
		} catch (BusinessException e) {
			throw new ViewException(e.getMessage());
		}
	}

	@Override
	public List<FactoryDTO> getFactories() throws ViewException {
		List<FactoryDTO> result = null;
		try {
			result = userBusiness.getFactories();
			return result;
		} catch (BusinessException e) {
			throw new ViewException(e.getMessage());
		}	
	}

	@Override
	public void insertOrUpdateUser(UserDTO userDto) throws ViewException {
		try {
			userBusiness.insertOrUpdateUser(userDto);
		} catch (BusinessException e) {
			throw new ViewException(e.getMessage());
		}	
	}

}
