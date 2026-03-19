package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
        Thread.sleep(3000);

        //Tik checkbox
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]"));
        checkbox1.click();
        Thread.sleep(2000);

        //Untik Checkbox
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]"));
        checkbox2.click();
    }
}
