package com.example.openbootcamp_spring.patterns.structural.DecoratorPattern;

public abstract class Photo {

    private Integer brightness;
    private Integer contrast;
    private Integer saturation;
    private Integer blur;


    public abstract String show();

    public abstract double cost();


    public Integer getBrightness() {
        return brightness;
    }
    public Integer getContrast() {
        return contrast;
    }
    public Integer getSaturation() {
        return saturation;
    }
    public Integer getBlur() {
        return blur;
    }
    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }
    public void setContrast(Integer contrast) {
        this.contrast = contrast;
    }
    public void setSaturation(Integer saturation) {
        this.saturation = saturation;
    }
    public void setBlur(Integer blur) {
        this.blur = blur;
    }



}
