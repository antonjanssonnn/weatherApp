package com.antonja.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Weather {
    @JsonProperty("name")
    private String cityName;
    @JsonProperty("main")
    private WeatherDetails weatherDetails;
    @JsonProperty("coord")
    private Coordinates coord;
    @JsonProperty("wind")
    private Wind wind;

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public WeatherDetails getWeatherDetails() {
        return weatherDetails;
    }
    public void setWeatherDetails(WeatherDetails weatherDetails) {
        this.weatherDetails = weatherDetails;
    }
    public Coordinates getCoord() {
        return coord;
    }
    public void setCoord(Coordinates coord) {
        this.coord = coord;
    }
    public Wind getWind() {
        return wind;
    }
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public static Weather fromJson(String json) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, Weather.class);

    }
}
