package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("a[href='/upload']")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("file-upload")).sendKeys("/home/bijon/Desktop/uiv6EZPy.jpeg");
        Thread.sleep(4000);

        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);
    }
}
