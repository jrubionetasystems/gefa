package com.eglobal.gefa.business.impl;

import java.io.Serializable;
import java.util.List;

import com.eglobal.gefa.business.FollowUpBusiness;
import com.eglobal.gefa.dao.FollowUpDAO;
import com.eglobal.gefa.dao.UserDAO;
import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.dto.WorkOrderDTO;
import com.eglobal.gefa.exception.BusinessException;

/** Implements the methods used for Follow Up And Control Use Case.
 * @author Neta Systems / Jorge Rubio */
public class FollowUpBusinessImpl implements FollowUpBusiness, Serializable {
	/** UID for Serielizable classes. */
	private static final long serialVersionUID = -1389884433651039816L;
	/** Reference to data access object */
	private UserDAO userDao;
	/** Reference to data access object */
	private FollowUpDAO followUpAndControlDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.eglobal.gefa.business.FollowUpBusiness#getWorkOrdersDetail(com.eglobal.gefa.dto.WorkOrderDTO)
	 */
	@Override
	public List<WorkOrderDTO> getWorkOrdersDetail(WorkOrderDTO workOrder) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.eglobal.gefa.business.FollowUpBusiness#getWorkOrdersSummary(com.eglobal.gefa.dto.WorkOrderDTO)
	 */
	@Override
	public List<WorkOrderDTO> getWorkOrdersSummary(WorkOrderDTO workOrder) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.eglobal.gefa.business.FollowUpBusiness#getContactsfromFactory(com.eglobal.gefa.dto.FactoryDTO)
	 */
	@Override
	public List<UserDTO> getContactsfromFactory(FactoryDTO factory) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	/** Accessor to implement de Inversion of Control
	 * @return the userDao */
	public UserDAO getUserDao() {
		return userDao;
	}

	/** Accessor to implement the Inversion of Control
	 * @param userDao the userDao to set */
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	/** Accesor to implement the Inversion of Control
	 * @return the followUpAndControlDAO */
	public FollowUpDAO getFollowUpAndControlDAO() {
		return followUpAndControlDAO;
	}

	/** Accesor to implement the Inversion of Control
	 * @param followUpAndControlDAO the followUpAndControlDAO to set */
	public void setFollowUpAndControlDAO(FollowUpDAO followUpAndControlDAO) {
		this.followUpAndControlDAO = followUpAndControlDAO;
	}

}
