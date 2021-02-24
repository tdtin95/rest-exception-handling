package com.tdtin.rest.exception.handling;

public class ServiceCallingException extends RuntimeException {

    private ExceptionResponse exceptionResponse;

    public ServiceCallingException(String message, int status, String serviceResponse) {
        this.exceptionResponse = new ExceptionResponse(message, status, serviceResponse);
    }

    public ExceptionResponse getExceptionResponse() {
        return exceptionResponse;
    }
}
