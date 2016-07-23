package com.aio.exception;

public class NullUserScoreException extends RuntimeException {
	public NullUserScoreException() {
	};

	public NullUserScoreException(String msg) {
		super(msg);
	}

}
