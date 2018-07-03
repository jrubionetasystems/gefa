package com.eglobal.gefa.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.eglobal.gefa.dao.UserDAO;
import com.eglobal.gefa.exception.DaoException;
import com.eglobal.gefa.model.GefaFactory;
import com.eglobal.gefa.model.GefaRole;
import com.eglobal.gefa.model.GefaUsers;

public class UserDAOImpl implements UserDAO, Serializable {

	/**
	 * UID for Serializable classes.
	 */
	private static final long serialVersionUID = -559178015638575137L;
	/**
	 * Reference to session Factory
	 */
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GefaUsers> getUsers() throws DaoException {
		Session session = null;
		List<GefaUsers> result = null;
		try {
			session = sessionFactory.openSession();
			result = session.createQuery("FROM GefaUsers").getResultList();
			return result;
		} catch (Exception e) {
			throw new DaoException();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}	
		}	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GefaRole> getRoles() throws DaoException {
		Session session = null;
		List<GefaRole> result = null;
		try {
			session = sessionFactory.openSession();
			result = session.createQuery("FROM GefaRole").getResultList();
			return result;
		} catch (Exception e) {
			throw new DaoException();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}	
		}	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GefaFactory> getFactories() throws DaoException {
		Session session = null;
		List<GefaFactory> result = null;
		try {
			session = sessionFactory.openSession();
			result = session.createQuery("FROM GefaFactory").getResultList();
			return result;
		} catch (Exception e) {
			throw new DaoException();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}	
		}
	}

}
