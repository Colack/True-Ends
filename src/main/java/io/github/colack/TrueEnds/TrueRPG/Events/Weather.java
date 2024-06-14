package io.github.colack.TrueEnds.TrueRPG.Events;

public class Weather {
    public String weatherType;
    public int weatherIntensity;
    public int weatherDuration;
    public boolean hasEffect;

    private final String RAIN = "rain";             // Enemies have a chance to slip
    private final String SNOW = "snow";             // Enemies have a chance to begin battle with freeze
    private final String SUNNY = "sunny";           // No effect
    private final String CLOUDY = "cloudy";         // No effect
    private final String FOGGY = "foggy";           // Enemies have a chance to begin battle with blind
    private final String WINDY = "windy";           // Enemies have a chance to begin battle with silence
    private final String STORMY = "stormy";         // Enemies have a chance to begin battle with paralysis
    private final String HAIL = "hail";             // Enemies have a chance to begin battle with stun
    private final String SANDSTORM = "sandstorm";   // Enemies have a chance to begin battle with confusion
    private final String ACIDRAIN = "acidrain";     // Enemies have a chance to begin battle with poison

    public Weather(String weatherType, int weatherIntensity, int weatherDuration, boolean hasEffect) {
        this.weatherType = weatherType;
        this.weatherIntensity = weatherIntensity;
        this.weatherDuration = weatherDuration;
        this.hasEffect = hasEffect;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public void setWeatherIntensity(int weatherIntensity) {
        this.weatherIntensity = weatherIntensity;
    }

    public void setWeatherDuration(int weatherDuration) {
        this.weatherDuration = weatherDuration;
    }

    public void setHasEffect(boolean hasEffect) {
        this.hasEffect = hasEffect;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public int getWeatherIntensity() {
        return weatherIntensity;
    }

    public int getWeatherDuration() {
        return weatherDuration;
    }

    public boolean getHasEffect() {
        return hasEffect;
    }
}
