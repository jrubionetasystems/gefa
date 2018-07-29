package com.eglobal.gefa.dao;

import java.util.List;

import com.eglobal.gefa.exception.DaoException;
import com.eglobal.gefa.model.GefaFactory;
import com.eglobal.gefa.model.GefaRole;
import com.eglobal.gefa.model.GefaUser;

/** Defines the Data Access Methods for Users Use Case
 * @author Neta Systems / Jorge Rubio */
public interface UserDAO {
	/** Returns a list of Users
	 * @return List of Users
	 * @throws DaoException In case of error it throws this kind of exception */
	List<GefaUser> getUsers() throws DaoException;

	/** Returns a list of Users by a criteria
	 * @param gefaFactory Contains the information with filter criteria
	 * @return List of Factories
	 * @throws DaoException In case of error it throws this kind of exception */
	List<GefaUser> getUsers(GefaFactory gefaFactory) throws DaoException;

	/** Returns a list of Roles
	 * @return List of Roles
	 * @throws DaoException In case of error it throws this kind of exception */
	List<GefaRole> getRoles() throws DaoException;

	/** Returns a list of factories
	 * @return List of factories
	 * @throws DaoException In case of error it throws this kind of exception */
	List<GefaFactory> getFactories() throws DaoException;

	/** Add or update a new user in the database
	 * @param user
	 * @throws DaoException In case of error it throws this kind of exception */
	void insertOrUpdateUser(GefaUser user) throws DaoException;
}
