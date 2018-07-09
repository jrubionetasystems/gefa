package com.eglobal.gefa.exception;

public class BusinessException extends Exception {

	/**
	 * UID for serializable classes
	 */
	private static final long serialVersionUID = -8543668608672547620L;
	
    public BusinessException(String msg) {
        super("Exception in Database Tier");
    }
    
    public BusinessException(Exception ex) {
        super("Exception in Database Tier");
    }
    
}
