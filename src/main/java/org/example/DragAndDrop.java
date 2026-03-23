package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("a[href='/drag_and_drop']")).click();

        WebElement drag = driver.findElement(By.id("column-a"));
        WebElement drop = driver.findElement(By.id("column-b"));

        Thread.sleep(Long.parseLong("4000"));

        Actions action = new Actions(driver);
        //action.dragAndDrop(drag,drop).release().build().perform();
        action.clickAndHold(drag).moveToElement(drop).release().build().perform();
        System.out.println("Drag and drop done");
    }
}
