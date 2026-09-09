package com.sushma.base;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.sushma.framework.DriverManager;

public class BaseTest {

 String browser = "chrome";
    @BeforeMethod 
    public void setUp(){
      DriverManager.initBrowser(browser);
    }

    @AfterMethod 
    public void tearDown(){
       DriverManager.quitDriver();
    }
    
}
