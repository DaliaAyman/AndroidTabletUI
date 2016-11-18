package com.android.dalia.androidtabletui.models;

import java.io.Serializable;

/**
 * Created by Dalia on 9/3/2016.
 */
public class AndroidVersion implements Serializable{
    private String name;
    private double number;
    private int image;
    private double api_level;
    private String description;

    public AndroidVersion(String name, int image, double number, double api_level, String description) {
        this.name = name;
        this.image = image;
        this.number = number;
        this.api_level = api_level;
        this.description = description;
    }

    public AndroidVersion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getApi_level() {
        return api_level;
    }

    public void setApi_level(double api_level) {
        this.api_level = api_level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
