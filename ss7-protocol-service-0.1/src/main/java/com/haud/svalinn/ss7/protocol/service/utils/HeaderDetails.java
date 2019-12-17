package com.haud.svalinn.ss7.protocol.service.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class HeaderDetails {

    //@Value("${haud.app.uuid}")
    private String uuidKey = "key123";

    @Autowired
    private HttpServletResponse httpServletResponse;

    @Autowired
    private HttpServletRequest httpServletRequest;

    public RequestHeaderMetadata getDetails() {
        return new RequestHeaderMetadata() {

            @Override
            public String getUUID() {
                return httpServletResponse.getHeader(uuidKey);
            }

            @Override
            public String getURI() {
                return httpServletRequest.getRequestURI();
            }

            @Override
            public String getRemoteAddress() {
                return httpServletRequest.getRemoteAddr();
            }
        };
    }

}
