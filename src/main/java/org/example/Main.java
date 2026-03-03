package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
       WebDriver driver = new FirefoxDriver();
       driver.get("https://ebay.com/");

       //Write something in searchbox
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Laptop");

        //Click the search button
        driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]")).click();
    }
}