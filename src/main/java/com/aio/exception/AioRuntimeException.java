package com.aio.exception;

public class AioRuntimeException extends RuntimeException {

	public AioRuntimeException() {
	}

	public AioRuntimeException(String msg) {
		super(msg);
	}

	public AioRuntimeException(Exception e) {
		super(e);
	}
}
