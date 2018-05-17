package com.deneme.twitter;

import org.openqa.selenium.WebDriver;

public class facebook {
    WebDriver driver;
    public facebook(WebDriver driver){
        this.driver = driver;
    }

    public void facebookLogin(){

        driver.get("https://facebook.com/");


    }
}
