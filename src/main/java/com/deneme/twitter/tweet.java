package com.deneme.twitter;

import org.openqa.selenium.WebDriver;

public class tweet {
    WebDriver driver;

    public tweet(WebDriver driver){
        this.driver = driver;

    }

    public void tweet(){

        driver.get("https://twitter.com/");



    }
}
