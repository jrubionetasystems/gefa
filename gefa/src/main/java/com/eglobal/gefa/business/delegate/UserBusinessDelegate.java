package com.eglobal.gefa.business.delegate;

import java.util.List;

import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.exception.ViewException;

/** Defines methods for Users Use Case
 * @author Neta / Systems */
public interface UserBusinessDelegate {
	/** Returns a list of Users
	 * @return List of users
	 * @throws ViewException In case of error it throws this kind of exception */
	List<UserDTO> getUsers() throws ViewException;

	/** Returns a list of Roles
	 * @return List of Roles
	 * @throws ViewException In case of error it throws this kind of exception */
	List<RoleDTO> getRoles() throws ViewException;

	/** Returns a list of Factories
	 * @return List of software factories
	 * @throws ViewException In case of error it throws this kind of exception */
	List<FactoryDTO> getFactories() throws ViewException;

	/** Add or update a new user in the database
	 * @param userDto Object with the information of user to save
	 * @throws ViewException In case of error it throws this kind of exception */
	void insertOrUpdateUser(UserDTO userDto) throws ViewException;
}