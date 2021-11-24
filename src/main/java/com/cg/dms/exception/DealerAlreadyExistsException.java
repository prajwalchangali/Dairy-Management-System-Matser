package com.cg.dms.exception;

public class DealerAlreadyExistsException extends RuntimeException {

 static final long serialVersionUID = 1L;

	public DealerAlreadyExistsException() {
		super();
	}
	
	public DealerAlreadyExistsException(String msg) {
		super(msg);
	}
	
	

}
