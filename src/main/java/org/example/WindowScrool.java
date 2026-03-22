package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowScrool {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(3000);

        //Scrool to find the option
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        Thread.sleep(3000);

        WebElement firstElement = driver.findElement(By.cssSelector("a[href='/infinite_scroll']"));
        Thread.sleep(1000);
        js1.executeScript("arguments[0].scrollIntoView()", firstElement);
        Thread.sleep(3000);
        firstElement.click();
    }
}
