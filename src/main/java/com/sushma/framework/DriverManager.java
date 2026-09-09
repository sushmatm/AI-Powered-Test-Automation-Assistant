package com.sushma.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
    
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initBrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver.set(new ChromeDriver());
        
        }else if (browser.equalsIgnoreCase("safari")){
            driver.set(new SafariDriver());
        
        }
    }

    public static  WebDriver getDriver(){
        return driver.get();
    }

    public  static void quitDriver(){
        if(driver!=null){
            driver.get().quit();
            driver.remove();
        }
    }
}
 
