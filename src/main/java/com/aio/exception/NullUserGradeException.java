package com.aio.exception;

public class NullUserGradeException extends RuntimeException {
	public NullUserGradeException() {
	};

	public NullUserGradeException(String msg) {
		super(msg);
	}

}
