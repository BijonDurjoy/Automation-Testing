package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SearchSuggetion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        //Find the search box
        driver.findElement(By.name("q")).sendKeys("Software Testing");
        Thread.sleep(2000);

        //Find Suggesion box
        List <WebElement> suggession_list = driver.findElements(By.xpath("//ul/li[@class=\"sbct PZPZlf\"]"));
        System.out.println(suggession_list.size());

        Thread.sleep(3000);

        //Click the perticular one
        for(WebElement suggession_name : suggession_list){
            String suggession_value = suggession_name.getText();
            System.out.println(suggession_value);

            //Click One suggession
            if(suggession_value.equalsIgnoreCase("software testing course in bangladesh")){
                suggession_name.click();
            }
        }
    }
}
