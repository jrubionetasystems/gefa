package com.eglobal.gefa.dao;

import java.util.List;

import com.eglobal.gefa.exception.DaoException;
import com.eglobal.gefa.model.GefaFactory;
import com.eglobal.gefa.model.GefaRole;
import com.eglobal.gefa.model.GefaUsers;

public interface UserDAO {
	public List<GefaUsers> getUsers() throws DaoException;
	
	public List<GefaRole> getRoles() throws DaoException;
	
	public List<GefaFactory> getFactories() throws DaoException;
}
