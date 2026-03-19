package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("a[href='/dropdown']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@id=\"dropdown\"]")).click();
        Thread.sleep(1500);

        WebElement optn2 = driver.findElement(By.xpath("//select/option[@value=\"2\"]"));
        optn2.click();
    }
}
