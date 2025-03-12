package com.antonja.weatherapp.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import reactor.core.publisher.Mono;
import com.antonja.weatherapp.model.Weather;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    
    @Autowired
    private WebClient webClient;

    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping("/{city}")
    public Mono<ResponseEntity<Weather>> getWeather(@PathVariable String city) {
        System.out.println(apiKey);
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;
        
        return webClient.get()
                .uri(apiUrl)
                .retrieve()
                .bodyToMono(Weather.class)
                .map(response -> ResponseEntity.ok(response));
    }
}
