package org.example;

import org.example.BrowserPages.DdgPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
    WebDriver driver = null;

    @BeforeTest
    public void browserSetup(){
        driver = new FirefoxDriver();
    }

    @Test
    public void search(){
        driver.get("https://www.duckduckgo.com/");

        DdgPage.textBox(driver).sendKeys("Readmi note 13" + Keys.ENTER);
    }

    @AfterTest
    public void output(){
        System.out.println("Testing Complete!");
    }
}
