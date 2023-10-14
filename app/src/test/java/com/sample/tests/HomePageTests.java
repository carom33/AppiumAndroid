package com.sample.tests;

import com.sample.pages.HomePage;
import com.sample.pages.LoginPage;

import org.junit.Assert;
import org.junit.Test;

public class HomePageTests {

    @Test
    public void ScrollTest()
    {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.LoginToApp("test@gmail.com", "Pass123");
        homePage.ScrollTo("TextClock");
        String titleResult = homePage.GetTitletext();
        Assert.assertEquals("Clock", titleResult);
    }
}
