package com.eglobal.gefa.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.eglobal.gefa.dao.UserDAO;
import com.eglobal.gefa.exception.DaoException;
import com.eglobal.gefa.model.GefaFactory;
import com.eglobal.gefa.model.GefaRole;
import com.eglobal.gefa.model.GefaUser;

/** This class implements Data Access method for User Catalog
 * @author Neta Systems / Jorge Rubio */
public class UserDAOImpl implements UserDAO, Serializable {
	/** UID for Serializable classes. */
	private static final long serialVersionUID = -559178015638575137L;
	/** Reference to session Factory */
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GefaUser> getUsers() throws DaoException {

		Session session = null;
		List<GefaUser> result = null;
		try {
			session = sessionFactory.openSession();
			result = session.createQuery("FROM GefaUser").getResultList();
			return result;
		} catch (HibernateException hex) {
			throw new DaoException(hex);
		} catch (Exception e) {
			throw new DaoException(e);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GefaUser> getUsers(GefaFactory gefaFactory) throws DaoException {

		Session session = null;
		List<GefaUser> result = null;
		try {
			session = sessionFactory.openSession();
			result = session.createQuery("FROM GefaUser").getResultList();
			return result;
		} catch (HibernateException hex) {
			throw new DaoException(hex);
		} catch (Exception e) {
			throw new DaoException(e);
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
			throw new DaoException(e);
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
			throw new DaoException(e);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@Override
	public void insertOrUpdateUser(GefaUser user) throws DaoException {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.saveOrUpdate(user);
		} catch (Exception e) {
			throw new DaoException(e);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

	}

}
