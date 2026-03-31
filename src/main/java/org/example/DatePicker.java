package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(0);

        // Open date picker
        driver.findElement(By.id("datepicker")).click();

        String targetMonth = "April";
        String targetYear = "2020";
        //String targetDate = "7";

        while (true) {
            String month = driver.findElement(By.className("ui-datepicker-month")).getText();
            String year = driver.findElement(By.className("ui-datepicker-year")).getText();

            if (month.equals(targetMonth) && year.equals(targetYear)) {
                //driver.findElement(By.xpath("//a[text()='" + targetDate + "']")).click();
                driver.findElement(By.xpath("//a[normalize-space()='7']")).click();
                break;
            } else {
                // Click previous button
                driver.findElement(By.xpath("//span[contains(@class,'ui-icon-circle-triangle-w')]")).click();
            }
        }
    }
}
