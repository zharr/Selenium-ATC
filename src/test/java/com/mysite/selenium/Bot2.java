package com.mysite.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.SystemClock;

import java.util.concurrent.TimeUnit;

/**
 * Created by Zach on 12/7/16.
 */
public class Bot_Teen {

    long cur = 0;
    long drop = 1478793600000L;
    //long drop = 0; 1478185200000
    WebDriver driver;
    @Before
    public void waiting() {
        //driver = new ChromeDriver();
        /*while (cur < drop)
        {
            cur = System.currentTimeMillis();

        }*/

        long start = System.currentTimeMillis();
        long end;
        System.setProperty("webdriver.chrome.driver", "/Users/Zach/IdeaProjects/selenium-tutorial/chromedriver");
        driver = new ChromeDriver();
        // supreme
        driver.navigate().to("http://www.supremenewyork.com/shop/all/sweatshirts");

        //adidas
        //driver.navigate().to("http://www.adidas.com/us/men-shoes");
    }

    public boolean color(String color){
        boolean found = false;
        while(!found) {
            try {
                driver.findElement(By.cssSelector("a[data-style-name="+color+"]"));
                driver.findElement(By.cssSelector("a[data-style-name="+color+"]")).click();
                found = true;
            } catch (NoSuchElementException error) {
                found = false;
            }
        }
        return true;
    }

    public void size(String size) throws Exception{
        boolean found = false;
        int c = 0;
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
        WebElement mySelectElm = driver.findElement(By.id("size"));
        boolean stale = false;
        while(!stale) {
            try {
                mySelectElm = driver.findElement(By.id("size"));
                Select mySelect = new Select(mySelectElm);
                mySelect.selectByVisibleText(size);
                stale = true;
            } catch (StaleElementReferenceException j) {
                System.out.println("look again...");
            }
        }

        return;
    }

    @Test
    public void Supreme () {
        long start = 0;
        long end;

        boolean found = false;
        while (!found) {
            try {
                driver.findElement(By.partialLinkText("Box Logo"));
                try {
                    Thread.sleep(190);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                driver.findElement(By.partialLinkText("Box Logo")).click();
                start = System.currentTimeMillis();
                found = true;
            } catch (NoSuchElementException error) {
                found = false;
                driver.navigate().refresh();
            }
        }

        while (true) {

            color("Peach");
            try{
                size("XLarge");
                break;
            }catch (Exception e1){
            }
            color("Black");
            try{
                size("XLarge");
                break;
            }catch (Exception e2){
            }
            color("Navy");
            try{
                size("XLarge");
                break;
            }catch (Exception e3) {
            }

        }

        found = false;
        while (!found) {
            try {
                driver.findElement(By.name("commit"));
                driver.findElement(By.name("commit")).click();
                start = System.currentTimeMillis();
                found = true;
            } catch (Exception error) {
                found = false;
            }
        }

        found = false;
        while (!found) {
            try {
                driver.findElement(By.linkText("checkout now"));
                driver.findElement(By.linkText("checkout now")).click();
                start = System.currentTimeMillis();
                found = true;
            } catch (NoSuchElementException error) {
                found = false;
            }
        }


        found = false;
        while (!found) {
            try {
                driver.findElement(By.id("order_billing_name"));
                driver.findElement(By.id("order_billing_name")).sendKeys("Romteen Bahramirad");
                start = System.currentTimeMillis();
                found = true;
            } catch (NoSuchElementException error) {
                found = false;
            }
        }


        driver.findElement(By.id("order_email")).sendKeys("romteenbahramirad@yahoo.com");

        driver.findElement(By.id("order_tl")).sendKeys("974");
        driver.findElement(By.id("order_tl")).sendKeys("847");
        driver.findElement(By.id("order_tl")).sendKeys("4949");

        driver.findElement(By.id("bo")).sendKeys("5520 Hunters Ridge Ct.");


        driver.findElement(By.id("order_billing_zip")).sendKeys("60192");

        driver.findElement(By.id("cnb")).sendKeys("4623 ");
        driver.findElement(By.id("cnb")).sendKeys("4262");
        driver.findElement(By.id("cnb")).sendKeys("9051");
        driver.findElement(By.id("cnb")).sendKeys("0466");

        WebElement mySelectElm = driver.findElement(By.id("credit_card_month"));
        Select mySelect = new Select(mySelectElm);
        mySelect.selectByVisibleText("12");

        mySelectElm = driver.findElement(By.id("credit_card_year"));
        mySelect = new Select(mySelectElm);
        mySelect.selectByVisibleText("2017");

        driver.findElement(By.id("cvw")).sendKeys("523");

        driver.findElement(By.cssSelector("label[class='has-checkbox terms']")).findElement(By.className("iCheck-helper")).click();

        driver.findElement(By.name("commit")).click();

        //driver.close();
    }

}
