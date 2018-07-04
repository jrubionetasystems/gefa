package com.eglobal.gefa.exception;

public class DaoException extends Exception {

	/**
	 * UID for serializable classes
	 */
	private static final long serialVersionUID = -8543668608672547620L;
	
    public DaoException(String msg) {
        super("Exception in Database Tier");
    }
    
    public DaoException(Exception ex) {
        super("Exception in Database Tier");
    }
    
}
