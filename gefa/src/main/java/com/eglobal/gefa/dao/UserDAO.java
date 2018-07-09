package com.eglobal.gefa.dao;

import java.util.List;

import com.eglobal.gefa.exception.DaoException;
import com.eglobal.gefa.model.GefaFactory;
import com.eglobal.gefa.model.GefaRole;
import com.eglobal.gefa.model.GefaUser;

public interface UserDAO {
	public List<GefaUser> getUsers() throws DaoException;
	
	public List<GefaRole> getRoles() throws DaoException;
	
	public List<GefaFactory> getFactories() throws DaoException;
	
	public void insertOrUpdateUser(GefaUser user) throws DaoException;
}
