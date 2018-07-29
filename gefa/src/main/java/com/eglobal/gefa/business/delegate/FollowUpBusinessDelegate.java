package com.eglobal.gefa.business.delegate;

import java.util.List;

import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.dto.WorkOrderDTO;
import com.eglobal.gefa.exception.ViewException;

/** Defines methods for Follow Up and Control Use Case
 * 
 * @author Netas Systems / Jorge Rubio */
public interface FollowUpBusinessDelegate {
	/** Returns a list of Work orders by a criteria
	 * 
	 * @param workOrder Contains the information with filter criteria
	 * @return List with work order that match with criteria
	 * @throws ViewException In case of error it throws this kind of exception */
	List<WorkOrderDTO> getWorkOrdersDetail(WorkOrderDTO workOrder) throws ViewException;

	/** Returns a list with a summary of Work orders by a criteria
	 * 
	 * @param workOrder Contains the information with filter criteria
	 * @return List with a summary of work orders that match with criteria
	 * @throws ViewException In case of error it throws this kind of exception */
	List<WorkOrderDTO> getWorkOrdersSummary(WorkOrderDTO workOrder) throws ViewException;

	/** Returns a list with contacts that belong to a specific Factory
	 * 
	 * @param factory Factory
	 * @return List with contacts that belong to a specific Factory
	 * @throws ViewException In case of error it throws this kind of exception */
	List<UserDTO> getContactsfromFactory(FactoryDTO factory) throws ViewException;

}