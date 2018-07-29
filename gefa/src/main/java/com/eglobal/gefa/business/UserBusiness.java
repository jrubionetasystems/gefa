package com.eglobal.gefa.business;

import java.util.List;

import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.exception.BusinessException;

/** Define business methods for User Use Case.
 * 
 * @author Neta Systems / Jorge Rubio */
public interface UserBusiness {
	/** Returns a list of Users
	 * @return List of users
	 * @throws BusinessException In case of error it throws this kind of exception */
	List<UserDTO> getUsers() throws BusinessException;

	/** Returns a list of roles
	 * @return List of roles
	 * @throws BusinessException In case of error it throws this kind of exception */
	List<RoleDTO> getRoles() throws BusinessException;

	/** Returns a list of factories
	 * @return List of factories
	 * @throws BusinessException In case of error it throws this kind of exception */
	List<FactoryDTO> getFactories() throws BusinessException;

	/** Returns a list of Users by a criteria
	 * @param userDto Contains the information with filter criteria
	 * @throws BusinessException In case of error it throws this kind of exception */
	void insertOrUpdateUser(UserDTO userDto) throws BusinessException;
}
