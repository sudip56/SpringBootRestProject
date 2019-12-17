package com.haud.svalinn.ss7.protocol.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.modelmapper.ModelMapper;

@Configuration
public class WebConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }

   /* @Bean
    AuditorAwareImpl auditorAwareImpl()
    {
        return new AuditorAwareImpl();
    }
    @Bean
    public AuditorAware<String> auditorAware() {
        return auditorAwareImpl();
    }*/

}
