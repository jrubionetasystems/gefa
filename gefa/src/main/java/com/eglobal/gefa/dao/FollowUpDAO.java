package com.eglobal.gefa.dao;

import java.util.List;

import com.eglobal.gefa.dto.WorkOrderDTO;
import com.eglobal.gefa.exception.DaoException;
import com.eglobal.gefa.model.GefaWorkOrder;

/** Defines Data Access method for Follow Up and Control Use Case
 * @author Neta Systems / Jorge Rubio */
public interface FollowUpDAO {
	/** Returns a list of Work orders by a criteria
	 * @param workOrder Contains the information with filter criteria
	 * @return List with work order that match with criteria
	 * @throws DaoException In case of error it throws this kind of exception */
	List<GefaWorkOrder> getWorkOrdersDetail(WorkOrderDTO workOrder) throws DaoException;

	/** Returns a list with a summary of Work orders by a criteria
	 * @param workOrder Contains the information with filter criteria
	 * @return List with a summary of Work orders by a criteria
	 * @throws DaoException In case of error it throws this kind of exception */
	List<GefaWorkOrder> getWorkOrdersSummary(WorkOrderDTO workOrder) throws DaoException;

}