package com.eglobal.gefa.business;

import java.util.List;

import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.dto.WorkOrderDTO;
import com.eglobal.gefa.exception.BusinessException;

/** Defines the sign of methods used for Follow Up And Control Use Case.
 * @author Neta Systems / Jorge Rubio */
public interface FollowUpBusiness {

	/** Returns a list of Work orders by a criteria
	 * @param workOrder Contains the information with filter criteria
	 * @return List with work order that match with criteria
	 * @throws BusinessException In case of error it throws this kind of exception */
	List<WorkOrderDTO> getWorkOrdersDetail(WorkOrderDTO workOrder) throws BusinessException;

	/** Returns a list with a summary of Work orders by a criteria
	 * @param workOrder Contains the information with filter criteria
	 * @return List with a summary of work orders that match with criteria
	 * @throws BusinessException In case of error it throws this kind of exception */
	List<WorkOrderDTO> getWorkOrdersSummary(WorkOrderDTO workOrder) throws BusinessException;

	/** Returns a list with contacts that belong to a specific Factory
	 * @param factory Factory
	 * @return List with contacts that belong to a specific Factory
	 * @throws BusinessException */
	List<UserDTO> getContactsfromFactory(FactoryDTO factory) throws BusinessException;

}