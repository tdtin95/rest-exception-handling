package com.tdtin.rest.exception.handling;

public class ExceptionResponse {
    private int status;
    private String message;
    private String serviceResponse;

    public ExceptionResponse( String message, int status, String serviceResponse) {
        setMessage(message);
        setStatus(status);
        setServiceResponse(serviceResponse);
    }

    public String getServiceResponse() {
        return serviceResponse;
    }

    public void setServiceResponse(String serviceResponse) {
        this.serviceResponse = serviceResponse;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
