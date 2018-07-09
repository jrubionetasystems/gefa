package com.eglobal.gefa.exception;

public class ViewException extends Exception {

	/**
	 * UID for serializable classes
	 */
	private static final long serialVersionUID = -8543668608672547620L;
	
    public ViewException(String msg) {
        super("Exception in Database Tier");
    }
    
    public ViewException(Exception ex) {
        super("Exception in Database Tier");
    }
    
}
