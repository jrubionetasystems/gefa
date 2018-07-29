package com.eglobal.gefa.business.delegate.impl;

import java.io.Serializable;
import java.util.List;

import com.eglobal.gefa.business.FollowUpBusiness;
import com.eglobal.gefa.business.delegate.FollowUpBusinessDelegate;
import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.dto.WorkOrderDTO;
import com.eglobal.gefa.exception.ViewException;

/** Implements the business delegate pattern for Follow Up nas Control USe case
 * @author Neta Systems / Jorge Rubio */
public class FollowUpBusinessDelegateImpl implements FollowUpBusinessDelegate, Serializable {
	/** UID for serialziable classes */
	private static final long serialVersionUID = 966357008267999710L;
	/** Reference for a business class */
	private FollowUpBusiness followUpAndControlBusiness;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.eglobal.gefa.business.delegate.FollowUpAndControlBusinessDelegate#getWorkOrdersDetail(com.eglobal.gefa.dto.
	 * WorkOrderDTO)
	 */
	@Override
	public List<WorkOrderDTO> getWorkOrdersDetail(WorkOrderDTO workOrder) throws ViewException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.eglobal.gefa.business.delegate.FollowUpAndControlBusinessDelegate#getWorkOrdersSummary(com.eglobal.gefa.dto.
	 * WorkOrderDTO)
	 */
	@Override
	public List<WorkOrderDTO> getWorkOrdersSummary(WorkOrderDTO workOrder) throws ViewException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.eglobal.gefa.business.delegate.FollowUpAndControlBusinessDelegate#getContactsfromFactory(com.eglobal.gefa.dto.
	 * FactoryDTO)
	 */
	@Override
	public List<UserDTO> getContactsfromFactory(FactoryDTO factory) throws ViewException {
		// TODO Auto-generated method stub
		return null;
	}

	/** @return the followUpAndControlBusiness */
	public FollowUpBusiness getFollowUpAndControlBusiness() {
		return followUpAndControlBusiness;
	}

	/** @param followUpAndControlBusiness the followUpAndControlBusiness to set */
	public void setFollowUpAndControlBusiness(FollowUpBusiness followUpAndControlBusiness) {
		this.followUpAndControlBusiness = followUpAndControlBusiness;
	}

}
