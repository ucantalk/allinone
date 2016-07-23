package com.aio.exception;

public class ConnectDBException extends RuntimeException {
	public ConnectDBException() {
	}

	public ConnectDBException(String msg) {
		super(msg);
	}

}
