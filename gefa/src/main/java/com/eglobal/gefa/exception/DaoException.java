package com.eglobal.gefa.exception;

/**
 * Exception for Data Access tier
 * 
 * @author Neta Systems / Jorge Rubio
 */
public class DaoException extends Exception {
	/**
	 * UID for serializable classes
	 */
	private static final long serialVersionUID = -8543668608672547620L;

	/**
	 * Constructor for Data Access tier exceptions from a message error
	 * 
	 * @param msg
	 */
	public DaoException(final String msg) {
		super("Exception in Data Access Tier" + msg);
	}

	/**
	 * Constructor for Data Access tier exceptions from an excpetion
	 * 
	 * @param exception
	 */
	public DaoException(final Exception exception) {
		super("Exception in View Tier" + exception.getMessage());
	}

}
