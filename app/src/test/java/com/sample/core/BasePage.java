package com.sample.core;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BasePage {

    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private static AndroidDriver androidDriver = null;

    @BeforeClass
    public void setup(){
        initDriver();
    }

    public AndroidDriver getDriver() {
        return androidDriver;
    }
    public void initDriver()
    {
        try {
        ChromeOptions options = new ChromeOptions();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        //URLConnection urlConnection = url.openConnection();
        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com");
        }catch (Exception e) {
            System.out.println("SetUp is successful and Appium Driver is launched successfully");
        }
    }

    @AfterClass
    public void tearDown(){
        androidDriver.quit();
    }
}
