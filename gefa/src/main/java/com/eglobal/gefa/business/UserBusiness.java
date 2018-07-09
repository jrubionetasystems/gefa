package com.eglobal.gefa.business;

import java.util.List;

import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.exception.BusinessException;

public interface UserBusiness {
	public List<UserDTO> getUsers() throws BusinessException;
	
	public List<RoleDTO> getRoles() throws BusinessException;
	
	public List<FactoryDTO> getFactories() throws BusinessException;
	
	public void insertOrUpdateUser(UserDTO userDto) throws BusinessException;
}
