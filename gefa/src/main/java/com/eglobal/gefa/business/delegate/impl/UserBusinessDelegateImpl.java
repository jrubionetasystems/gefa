package com.eglobal.gefa.business.delegate.impl;

import java.util.List;

import com.eglobal.gefa.business.delegate.UserBusinessDelegate;
import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.exception.DaoException;

public class UserBusinessDelegateImpl implements UserBusinessDelegate {

	@Override
	public List<UserDTO> getUsers() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleDTO> getRoles() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FactoryDTO> getFactories() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOrUpdateUser(UserDTO userDto) throws DaoException {
		// TODO Auto-generated method stub

	}

}
