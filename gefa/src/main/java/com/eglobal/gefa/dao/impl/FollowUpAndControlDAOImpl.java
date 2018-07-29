package com.eglobal.gefa.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;

import com.eglobal.gefa.dao.FollowUpDAO;
import com.eglobal.gefa.dto.WorkOrderDTO;
import com.eglobal.gefa.exception.DaoException;
import com.eglobal.gefa.model.GefaWorkOrder;

/**
 * This class implements Data Access method for Follow Up and COntrol Use Case
 * @author Neta Systems / Jorge Rubio
 */
public class FollowUpAndControlDAOImpl implements FollowUpDAO, Serializable {
	/**
	 * UID for serializable classes
	 */
	private static final long serialVersionUID = 6833823322713631756L;
	/**
	 * Reference to session Factory
	 */
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.eglobal.gefa.dao.FollowUpAndControlDAO#getWorkOrdersDetail(com.eglobal.gefa.dto.WorkOrderDTO)
	 */
	@Override
	public List<GefaWorkOrder> getWorkOrdersDetail(WorkOrderDTO workOrder) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.eglobal.gefa.dao.FollowUpAndControlDAO#getWorkOrdersSummary(com.eglobal.gefa.dto.WorkOrderDTO)
	 */
	@Override
	public List<GefaWorkOrder> getWorkOrdersSummary(WorkOrderDTO workOrder) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
