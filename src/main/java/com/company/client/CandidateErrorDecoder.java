package com.company.client;

import com.company.model.ClientException;
import com.company.model.ExceptionResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;

import java.io.IOException;

public class CandidateErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        ExceptionResponse exceptionResponse;

        try {
            exceptionResponse = new ObjectMapper().readValue(response.body().asInputStream(), ExceptionResponse.class);
        } catch (IOException e) {
            throw new ClientException("UNEXPECTED_EXCEPTION", 500);
        }

        return new ClientException(exceptionResponse.getCode(), response.status());
    }
}
