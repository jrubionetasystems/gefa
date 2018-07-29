package com.eglobal.gefa.exception;

/**
 * Exception for View tier
 * @author Neta Systems / Jorge Rubio
 */
public class ViewException extends Exception {
	/**
	 * UID for serializable classes
	 */
	private static final long serialVersionUID = -8543668608672547620L;
	
    /**
     * Constructor for View tier exceptions from a message error
     * @param msg Message error
     */
    public ViewException(final String msg) {
        super("Exception in View Tier" + msg);
    }
    
    /**
     * Constructor for View tier exceptions from an exception
     * @param ex Exceotion that was raised originally
     */
    public ViewException(final Exception exception) {
        super("Exception in View Tier"+exception.getMessage());
    }
}
