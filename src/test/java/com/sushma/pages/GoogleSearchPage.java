package com.sushma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sushma.base.BasePage;

public class GoogleSearchPage extends BasePage {

    private By searchbox = By.name("q");
    private By searchbtn = By.name("btnK");

    public GoogleSearchPage(WebDriver driver){
        super();
    }

    public void googleSearchFor(String word) {

        type(searchbox, word);
        click(searchbtn);

    }

}
