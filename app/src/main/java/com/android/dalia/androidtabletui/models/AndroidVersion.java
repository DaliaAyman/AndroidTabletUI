package com.android.dalia.androidtabletui.models;

import android.graphics.drawable.Drawable;

/**
 * Created by Dalia on 9/3/2016.
 */
public class AndroidVersion {
    private String name;
    private double number;
    private Drawable image;
    private double api_level;

    public AndroidVersion(String name, Drawable image, double number, double api_level) {
        this.name = name;
        this.image = image;
        this.number = number;
        this.api_level = api_level;
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

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public double getApi_level() {
        return api_level;
    }

    public void setApi_level(double api_level) {
        this.api_level = api_level;
    }
}
