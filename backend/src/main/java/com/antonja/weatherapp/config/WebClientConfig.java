package com.antonja.weatherapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    
    //Skapa en Bean, alltså en modul, eller instans som går att återanvända, och injicera där det önskas.
    @Bean
    public WebClient WebClient(){
        return WebClient.builder().build();
    }
}
