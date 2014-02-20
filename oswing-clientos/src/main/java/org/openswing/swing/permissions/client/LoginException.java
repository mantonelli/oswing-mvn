package org.openswing.swing.permissions.client;

public class LoginException extends Exception {

	public LoginException() {
		super();
	}

	public LoginException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public LoginException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public LoginException(String arg0) {
		super(arg0);
	}

	public LoginException(Throwable arg0) {
		super(arg0);
	}

}
