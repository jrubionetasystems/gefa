package com.eglobal.gefa.business.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.eglobal.gefa.assembler.Assembler;
import com.eglobal.gefa.business.UserBusiness;
import com.eglobal.gefa.dao.UserDAO;
import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.exception.BusinessException;
import com.eglobal.gefa.exception.DaoException;
import com.eglobal.gefa.model.GefaFactory;
import com.eglobal.gefa.model.GefaRole;
import com.eglobal.gefa.model.GefaUser;

@Transactional(readOnly = true)
public class UserBusinessImpl implements UserBusiness, Serializable {
	/**
	 * UID for serializable classes.
	 */
	private static final long serialVersionUID = -7557198367608416540L;
	/**
	 * Reference to data access object
	 */
	private UserDAO userDao;

	/**
	 * @return the userDao
	 */
	public UserDAO getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao
	 *            the userDao to set
	 */
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<UserDTO> getUsers() throws BusinessException {
		List<UserDTO> result = null;
		try {
			List<GefaUser> users = userDao.getUsers();
			result = new ArrayList<UserDTO>();
			for (GefaUser user : users) {
				result.add(Assembler.gefaUsers2UserDTO(user));
			}
		} catch (DaoException daoE) {
			throw new BusinessException(daoE);
		}
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public List<RoleDTO> getRoles() throws BusinessException {
		List<RoleDTO> result = null;
		try {
			List<GefaRole> roles = userDao.getRoles();
			result = new ArrayList<RoleDTO>();
			for (GefaRole gefaRole : roles) {
				result.add(Assembler.gefaRole2RoleDTO(gefaRole));
			}
		} catch (DaoException daoE) {
			throw new BusinessException(daoE);
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FactoryDTO> getFactories() throws BusinessException {
		List<FactoryDTO> result = null;
		try {
			List<GefaFactory> factories = userDao.getFactories();
			result = new ArrayList<FactoryDTO>();
			for (GefaFactory factory : factories) {
				result.add(Assembler.gefaFactory2FactoryDTO(factory));
			}
		} catch (DaoException daoE) {
			throw new BusinessException(daoE);
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOrUpdateUser(UserDTO userDto) throws BusinessException {
		try {
			GefaUser user = Assembler.userDTO2GefaUser(userDto);
			userDao.insertOrUpdateUser(user);
		} catch (DaoException daoE) {
			throw new BusinessException(daoE);
		}
	}

}
