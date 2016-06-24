package com.aio.exception;

import com.sun.tools.internal.ws.wsdl.document.jaxws.CustomName;
import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

public class NullUserScoreException extends Throwable {
	public NullUserScoreException() {
	};

	public NullUserScoreException(String msg) {
		super(msg);
	}

}
