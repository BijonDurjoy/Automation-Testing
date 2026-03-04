package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.example.BrowserPages.DdgPage;

public class DuckDuckGo {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://duckduckgo.com/");

        //Find element by name
        //driver.findElement(By.name("q")).sendKeys("Iphone 17 pro max" + Keys.ENTER);
        //driver.findElement(By.name("btnK")).click();

        //From using page object model
        DdgPage.textBox(driver).sendKeys("Samsung galaxy s25 ultra" + Keys.ENTER);

    }
}
