package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Webtables {
    WebDriver driver = new FirefoxDriver();

    @Test
    public void webtables() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com//tables");
        Thread.sleep(3000);
        List<Float>sl = new ArrayList<>();
        List<WebElement> table = driver.findElements(By.xpath("//td[4]"));

        for(int i=0; i<table.size(); i++){
            String s = table.get(i).getText().replace("$","");
            //System.out.println(table.get(i).getText());
            sl.add(Float.parseFloat(s));
        }
        Collections.sort(sl);
        System.out.println(sl);
    }
}
