package com.tdtin.rest.exception.handling;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionHandling implements ExceptionMapper<ServiceCallingException> {

    @Override
    public Response toResponse(ServiceCallingException e) {
        return Response.status(e.getExceptionResponse().getStatus()).entity(e.getExceptionResponse()).type(MediaType.APPLICATION_JSON).build();
    }
}
