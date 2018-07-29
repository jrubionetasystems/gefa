package com.eglobal.gefa.assembler;

import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.model.GefaFactory;
import com.eglobal.gefa.model.GefaRole;
import com.eglobal.gefa.model.GefaUser;

/**
 * This class is used to convert objects from source type to target type.
 * 
 * @author Neta Systems / Jorge Rubio.
 */
public class Assembler {
	/**
	 * Converts a GefaUser Object to a UserDTO object
	 * 
	 * @param gefaUser
	 *            Object to convert
	 * @return DTO object gotten.
	 */
	public static UserDTO gefaUsers2UserDTO(final GefaUser gefaUser) {
		return new UserDTO(gefaUser.getUserId(), gefaUser.getName(), gefaUser.getSurname(), gefaUser.getName(),
				gefaUser.getEmail(), gefaUser.getTelephone(), gefaRole2RoleDTONameEmpty(gefaUser.getGefaRole()),
				gefaFactory2FactoryDTONameEmpty(gefaUser.getGefaFactory()), gefaUser.getStatus(),
				gefaUser.getPassword(), "", gefaUser.getCreationDate(), gefaUser.getLastUpdateDate());
	}

	/**
	 * Converts a UserDto Object to a GefaUser object
	 * 
	 * @param userDto
	 *            Object to Convert
	 * @return GefaUser object gotten.
	 */
	public static GefaUser userDTO2GefaUser(final UserDTO userDto) {
		final GefaUser result = new GefaUser();
		result.setUserId(userDto.getUsername());
		result.setSurname(userDto.getSurname());
		result.setName(userDto.getName());
		result.setEmail(userDto.getEmail());
		result.setTelephone(userDto.getTelephone());
		result.setGefaFactory(factoryDTO2GefaFactory(userDto.getFactory()));
		result.setGefaRole(roleDTO2GefaRole(userDto.getRole()));
		return result;
	}

	/**
	 * Converts a RoleDto Object to a GefaRole object
	 * 
	 * @param roleDto
	 *            Object to Convert
	 * @return object gotten.
	 */
	public static GefaRole roleDTO2GefaRole(final RoleDTO roleDto) {
		final GefaRole result = new GefaRole();
		result.setRoleId(roleDto.getRoleId());
		result.setName(roleDto.getRoleName());
		return result;
	}

	/**
	 * Converts a GefaRole Object to a RoleDTO object
	 * 
	 * @param gefaRole
	 *            Object to convert
	 * @return object gotten.
	 */
	public static RoleDTO gefaRole2RoleDTO(final GefaRole gefaRole) {
		return new RoleDTO(gefaRole.getRoleId(), gefaRole.getName());
	}

	/**
	 * Converts a GefaRole Object to a RoleDTO object setting the name value to
	 * blanks
	 * 
	 * @param gefaRole
	 *            Object to convert
	 * @return Object gotten
	 */
	public static RoleDTO gefaRole2RoleDTONameEmpty(final GefaRole gefaRole) {
		RoleDTO result;
		if (gefaRole == null) {
			result = new RoleDTO();
		} else {
			result = new RoleDTO(gefaRole.getRoleId(), "");
		}
		return result;
	}

	/**
	 * Converts a FactoryDTO Object to a GefaFactory object
	 * 
	 * @param factoryDto
	 *            Object to convert
	 * @return Object gotten
	 */
	public static GefaFactory factoryDTO2GefaFactory(final FactoryDTO factoryDto) {
		final GefaFactory result = new GefaFactory();
		result.setFactoryId(factoryDto.getId());
		result.setName(factoryDto.getFactoryName());
		return result;
	}

	/**
	 * Converts a GefaFactory Object to a FactoryDTO object
	 * 
	 * @param gefaFactory
	 *            Object to Convert
	 * @return object gotten
	 */
	public static FactoryDTO gefaFactory2FactoryDTO(final GefaFactory gefaFactory) {
		return new FactoryDTO(gefaFactory.getFactoryId(), gefaFactory.getName());
	}

	/**
	 * Converts a GefaFactory Object to a FactoryDTO object setting the name value
	 * to blanks
	 * 
	 * @param gefaFactory
	 * @return
	 */
	public static FactoryDTO gefaFactory2FactoryDTONameEmpty(final GefaFactory gefaFactory) {
		FactoryDTO result;
		if (gefaFactory == null) {
			result = new FactoryDTO();
		} else {
			result = new FactoryDTO(gefaFactory.getFactoryId(), "");
		}
		return result;
	}

}
