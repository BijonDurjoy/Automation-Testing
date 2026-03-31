package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebsiteAlart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@onclick= 'jsAlert()']")).click();
        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@onclick= 'jsConfirm()']")).click();
        driver.switchTo().alert().accept();

        Thread.sleep(4000);

        driver.findElement(By.xpath("//button[@onclick= 'jsPrompt()']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().sendKeys("Bijon + Prionty");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();


    }
}
