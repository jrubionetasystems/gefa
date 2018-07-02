package com.eglobal.gefa.dto;

import java.io.Serializable;
import java.util.Date;


/**
 * This class abstracts tyhe information of user in the system
 * @author Jorge Rubio 
 */
public class UserDTO implements Serializable {
	/**
	 * UID for serializable classes.
	 */
	private static final long serialVersionUID = 3460708380755144634L;
	/**
	 * Username to login
	 */
	private String username;
	/**
	 * Surname of user
	 */
	private String surname;
	/**
	 * Name of user
	 */
	private String name;
	/**
	 * email of user
	 */
	private String email;
	/**
	 * Telephone of user
	 */
	private String telephone;
	/**
	 * Role of user
	 */
	private RoleDTO role;
	/**
	 * Factory of user
	 */
	private FactoryDTO factory;
	/**
	 * Status of user
	 */
	private String status;
	/**
	 * Password of user
	 */
	private String password;
	/**
	 * Password confirmation of user
	 */
	private String confirmPassword;
	/**
	 * Join date of user in the system
	 */
	private Date joinDate;
	/**
	 * Last update date of modification for user information
	 */
	private Date lastUpdateDate;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username
	 * @param surname
	 * @param name
	 * @param email
	 * @param telephone
	 * @param role
	 * @param factory
	 * @param status
	 * @param password
	 * @param confirmPassword
	 * @param joinDate
	 * @param lastUpdateDate
	 */
	public UserDTO(String username, String surname, String name, String email, String telephone, RoleDTO role,
			FactoryDTO factory, String status, String password, String confirmPassword, Date joinDate,
			Date lastUpdateDate) {
		this.username = username;
		this.surname = surname;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.role = role;
		this.factory = factory;
		this.status = status;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.joinDate = joinDate;
		this.lastUpdateDate = lastUpdateDate;
	}

	
	
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the role
	 */
	public RoleDTO getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(RoleDTO role) {
		this.role = role;
	}
	/**
	 * @return the factory
	 */
	public FactoryDTO getFactory() {
		return factory;
	}
	/**
	 * @param factory the factory to set
	 */
	public void setFactory(FactoryDTO factory) {
		this.factory = factory;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}
	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	/**
	 * @return the joinDate
	 */
	public Date getJoinDate() {
		return joinDate;
	}
	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	/**
	 * @return the lastUpdateDate
	 */
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	/**
	 * @param lastUpdateDate the lastUpdateDate to set
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
}
