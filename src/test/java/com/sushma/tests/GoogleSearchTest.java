package com.sushma.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.Test;
import com.sushma.framework.DriverManager;
import com.sushma.base.BaseTest;

public class GoogleSearchTest extends BaseTest {

    private WebDriver driver;

    @Test
    public void verifyGoogleSearch() {
        driver = DriverManager.getDriver();
        driver.get("https://www.google.com");

        

        driver.findElement(By.name("q"))
                .sendKeys("Selenium WebDriver");

        driver.findElement(By.name("btnK"))
                .click();

        Assert.assertTrue(
                driver.getPageSource().contains("Selenium"),
                "Search results do not contain Selenium");
    }
}