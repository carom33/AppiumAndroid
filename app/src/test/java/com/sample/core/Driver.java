package com.sample.core;

import io.appium.java_client.android.AndroidDriver;

public class Driver extends BasePage{

    protected AndroidDriver driver;

    public Driver() {
        this.driver = super.getDriver();
    }
}
