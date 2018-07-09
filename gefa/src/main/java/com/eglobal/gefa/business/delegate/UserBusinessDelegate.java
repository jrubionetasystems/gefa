package com.eglobal.gefa.business.delegate;

import java.util.List;

import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.exception.ViewException;

public interface UserBusinessDelegate {
	public List<UserDTO> getUsers() throws ViewException;
	
	public List<RoleDTO> getRoles() throws ViewException;
	
	public List<FactoryDTO> getFactories() throws ViewException;
	
	public void insertOrUpdateUser(UserDTO userDto) throws ViewException;
}