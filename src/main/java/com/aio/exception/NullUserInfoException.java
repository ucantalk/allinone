package com.aio.exception;

public class NullUserInfoException extends RuntimeException {
	public NullUserInfoException() {
	};

	public NullUserInfoException(String msg) {
		super(msg);
	}

}
