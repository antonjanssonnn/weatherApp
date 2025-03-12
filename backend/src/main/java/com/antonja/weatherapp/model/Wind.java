package com.antonja.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {
    @JsonProperty("speed")
    private double windSpeed;
    @JsonProperty("deg")
    private double windDeg;
    @JsonProperty("gust")
    private double windGust;

    public double getWindSpeed() {
        return windSpeed;
    }
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
    public double getWindDeg() {
        return windDeg;
    }
    public void setWindDeg(double windDeg) {
        this.windDeg = windDeg;
    }
    public double getWindGust() {
        return windGust;
    }
    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

}
