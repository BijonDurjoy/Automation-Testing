package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.myntra.com/men-sports-shoes");

        //Click to open new Window
        driver.findElement(By.xpath("//img[@title='SG SCORER 6 0 Unisex Cricket Shoes']")).click();
        Thread.sleep(3000);

        Set<String>handler = driver.getWindowHandles();
        Iterator<String>it = handler.iterator();

        String parentWindow = it.next();
        System.out.println("Your Parent window id is: " +parentWindow);

        String childWindow = it.next();
        System.out.println("Your Child window id is: " +childWindow);

        driver.switchTo().window(childWindow);

    }
}
