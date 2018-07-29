package com.eglobal.gefa.exception;

/**
 * Exception for Business tier
 * 
 * @author Neta Systems / Jorge Rubio
 */
public class BusinessException extends Exception {
	/**
	 * UID for serializable classes
	 */
	private static final long serialVersionUID = -8543668608672547620L;

	/**
	 * Constructor for Business tier exceptions from a message error
	 * 
	 * @param msg
	 */
	public BusinessException(final String msg) {
		super("Exception in Business Tier " + msg);
	}

	/**
	 * Constructor for Business tier exceptions from an excpetion
	 * 
	 * @param exception
	 */
	public BusinessException(final Exception exception) {
		super("Exception in Bussiness Tier" + exception);
	}

}
