package com.eglobal.gefa.business.delegate;

import java.util.List;

import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.exception.DaoException;

public interface UserBusinessDelegate {
	public List<UserDTO> getUsers() throws DaoException;
	
	public List<RoleDTO> getRoles() throws DaoException;
	
	public List<FactoryDTO> getFactories() throws DaoException;
	
	public void insertOrUpdateUser(UserDTO userDto) throws DaoException;
}