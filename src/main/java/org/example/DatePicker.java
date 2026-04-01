package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        driver.findElement(By.id("datepicker")).click();

        Thread.sleep(2000);

        while (true){
            String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String year =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if(month.equals("April") && year.equals("2020")){
                driver.findElement(By.xpath("//a[normalize-space()='7']")).click();
                break;
            }
            else{
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            }
        }
    }
}