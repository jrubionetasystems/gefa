package com.eglobal.gefa.assembler;

import com.eglobal.gefa.dto.FactoryDTO;
import com.eglobal.gefa.dto.RoleDTO;
import com.eglobal.gefa.dto.UserDTO;
import com.eglobal.gefa.model.GefaFactory;
import com.eglobal.gefa.model.GefaRole;
import com.eglobal.gefa.model.GefaUser;

public class Assembler {
	public static UserDTO gefaUsers2UserDTO(GefaUser gefaUser) {
		UserDTO result = new UserDTO(gefaUser.getIdUser(), 
				                     gefaUser.getUsername(), 
				                     gefaUser.getSurname(), 
				                     gefaUser.getName(), 
				                     gefaUser.getEmail(), 
				                     gefaUser.getTelephone(),
				                     ( (gefaUser.getGefaRole()== null) ? null :
				                        new RoleDTO(gefaUser.getGefaRole().getIdRole(), gefaUser.getGefaRole().getRoleName())) ,
				                     ( (gefaUser.getGefaFactory()== null) ? null :
				                     new FactoryDTO(gefaUser.getGefaFactory().getIdFactory(), gefaUser.getGefaFactory().getFactoryName())),
				                     "",
				                     "",
				                     "",
				                     null, 
				                     null);
		return result;
	}

	
	public static GefaUser userDTO2GefaUser(UserDTO userDto) {
		GefaUser result = new GefaUser();
		result.setUsername(userDto.getUsername());
		result.setSurname(userDto.getSurname());
		result.setName(userDto.getName());
		result.setEmail(userDto.getEmail());
		result.setTelephone(userDto.getTelephone());
		GefaFactory gefaFactory = new GefaFactory();
		gefaFactory.setIdFactory(userDto.getFactory().getId());
		result.setGefaFactory(gefaFactory);
		GefaRole role = new GefaRole();
		role.setIdRole(userDto.getRole().getRoleId());
		result.setGefaRole(role);
		return result;
	}

	
	public static GefaRole roleDTO2GefaRole(RoleDTO roleDto) {
		GefaRole result = new GefaRole();
		result.setIdRole(roleDto.getRoleId());  
		result.setRoleName(roleDto.getRoleName());
		return result;
	}

	
	public static RoleDTO gefaRole2RoleDTO(GefaRole gefaRole) {
		RoleDTO result = new RoleDTO(gefaRole.getIdRole(), gefaRole.getRoleName());
		return result;
	}

	
	public static GefaFactory factoryDTO2GefaFactory(FactoryDTO factoryDto) {
		GefaFactory result = new GefaFactory();
		result.setIdFactory(factoryDto.getId());  
		result.setFactoryName(factoryDto.getFactoryName());
		return result;
	}

	
	public static FactoryDTO gefaFactory2FactoryDTO(GefaFactory gefaFactory) {
		FactoryDTO result = new FactoryDTO(gefaFactory.getIdFactory(), gefaFactory.getFactoryName());
		return result;
	}
	
}
