package com.tdtin.rest.exception.handling;

import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionFilter implements ResponseExceptionMapper<RuntimeException> {

    @Override
    public RuntimeException toThrowable(Response response) {
        int status = response.getStatus();
        String msg = null;
        try {
            msg = getBody(response);
        } catch (IOException e) {
            System.out.println("Cannot extract body");
        }

        return new ServiceCallingException("Cannot call service", status, msg);
    }

    private String getBody(Response response) throws IOException {
        InputStream is = (InputStream) response.getEntity();
        byte[] bytes = new byte[is.available()];
        is.read(bytes, 0, is.available());
        String body = new String(bytes);
        return body;
    }
}

