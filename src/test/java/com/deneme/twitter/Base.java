package com.deneme.twitter;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public abstract class Base {
    WebDriver driver;

    @Before
    public void beforeCreateDriver(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ahmet\\IdeaProjects\\seleniumdemo1\\driver\\chromedriver.exe"); // chromedriver.exe nin yolunu belirttik


        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS); // 60 saniye siteye girmezse timeout ver demek
        driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }



    @After
    public void afterCreateDriver(){

        //driver.quit();
    }
}
