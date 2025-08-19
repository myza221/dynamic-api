package com.example.dynamic_api.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.coyote.BadRequestException;

public class ClientErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {

        switch (response.status()){
            case 400:
                return new BadRequestException();
            case 404:
                return new Exception("Data not found");
            default:
                return new Exception("Generic error");
        }
    }
}
