package com.sample.pages;

import com.sample.core.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;

public class HomePage extends Driver {

    public HomePage()
    {
        super();
    }

    @FindBy(xpath = "//*[contains(text(), 'View')]")
    public WebElement OptionView;

    @FindBy(id = "title")
    public WebElement title;


    public void ScrollTo(String text)
    {
        OptionView.click();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UliScrollable(new UlSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" +"textMatches(\""+text + "\").instance(0))"));
        driver.findElement(By.xpath("//*[contains(@text, "+text+")]")).click();
    }

    public String GetTitletext()
    {
        return title.getText();
    }
}
