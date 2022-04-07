package br.com.API.calculadora.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationExeception extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnsuportedMathOperationExeception(String exception) {
		super(exception);
	}
}
