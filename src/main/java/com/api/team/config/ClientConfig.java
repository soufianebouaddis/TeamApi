package com.api.team.config;

import com.squareup.okhttp.OkHttpClient;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {


    @Bean
    public OkHttpClient okHttpClient(){
        return new OkHttpClient();
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
