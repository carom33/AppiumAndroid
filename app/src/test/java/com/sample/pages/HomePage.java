package com.sample.pages;

import com.sample.core.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(xpath = "//a[text()='Music']")
    public WebElement MusicTab;


    List<WebElement> listItems = driver.findElements(By.xpath("//*[@class='close-popup']"));


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

    public void ClosePopUps()
    {
        Boolean popUps = listItems.size()>0;
        if(popUps)
        {
            for(WebElement li:listItems)
            {
                li.click();
            }
        }
    }

    public void NavigateMusicTab()
    {
        MusicTab.click();
    }

    public String GetMusicTitle()
    {
        return MusicTab.getText();
    }
}
