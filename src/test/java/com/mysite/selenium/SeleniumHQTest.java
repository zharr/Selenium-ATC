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

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;




/*@Config(
        browser = Browser.CHROME,
        url     ="http://www.twitter.com"
)*/

public class SeleniumHQTest /*extends Locomotive*/ {

    long cur = 0;
    long drop = 1480608000000L; //1481212800000
    //long drop = 0;
    WebDriver driver;

    @Before
    public void waiting() {
        while (cur < drop - 1000)
        {
            cur = System.currentTimeMillis();

        }

        System.out.println("loading page....");
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
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.MILLISECONDS);
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
        while(!found) {
            try{

                //driver.findElement(By.linkText("Cherub Trooper"));
                driver.findElement(By.partialLinkText("Small Box"));
                try{
                    Thread.sleep(190);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                //driver.findElement(By.linkText("Cherub Trooper")).click();
                driver.findElement(By.partialLinkText("Small Box")).click();
                start = System.currentTimeMillis();
                found = true;
            }catch (NoSuchElementException error){
                driver.navigate().refresh();
                found = false;
            }
        }

        while (true) {

            color("Grey "); //grey
            try{
                size("Large");
                break;
            }catch (Exception e1){
                System.out.println("Slate");
            }
            color("Navy");
            try{
                size("Small");
                break;
            }catch (Exception e2){
                System.out.println("Navy");
            }
            color("Sage"); // white
            try{
                size("Medium");
                break;
            }catch (Exception e3) {
                System.out.println("Sage");
            }
            color("Black"); // red
            try{
                size("Large");
                break;
            }catch (Exception e4) {
                System.out.println("Black");
            }

        }
/*
        //driver.findElement(By.linkText("Mohair Hooded Work Jacket")).click();
        // select color
        found = false;
        while(!found) {
            try{
                driver.findElement(By.cssSelector("a[data-style-name=Red]"));
                driver.findElement(By.cssSelector("a[data-style-name=Red]")).click();
                //start = System.currentTimeMillis();
                found = true;
            }catch (NoSuchElementException error){
                found = false;
            }
        }


        try {
            WebElement mySelectElm = driver.findElement(By.id("size"));
            try {
                Select mySelect = new Select(mySelectElm);
                mySelect.selectByVisibleText("Large");
            } catch(StaleElementReferenceException j){
                found = true;

            }
        } catch (NoSuchElementException e) {
            try {
                WebElement mySelectElm = driver.findElement(By.id("size"));
                Select mySelect= new Select(mySelectElm);
                mySelect.selectByVisibleText("Medium");
            } catch (NoSuchElementException er) {
                try {
                    driver.findElement(By.name("commit")).click();
                } catch (NoSuchElementException eze) {
                    driver.navigate().back();
                }
            }
        }
*/
        found = false;
        while(!found) {
            try{
                driver.findElement(By.name("commit"));
                driver.findElement(By.name("commit")).click();
                start = System.currentTimeMillis();
                found = true;
            }catch (NoSuchElementException error){
                found = false;
            }
        }

        found = false;
        while(!found) {
            try{
                driver.findElement(By.linkText("checkout now"));
                driver.findElement(By.linkText("checkout now")).click();
                start = System.currentTimeMillis();
                found = true;
            }catch (NoSuchElementException error){
                found = false;
            }
        }


        found = false;
        while(!found) {
            try{
                driver.findElement(By.id("order_billing_name"));
                driver.findElement(By.id("order_billing_name")).sendKeys("Zachary Harrison");
                start = System.currentTimeMillis();
                found = true;
            }catch (NoSuchElementException error){
                found = false;
            }
        }


        driver.findElement(By.id("order_email")).sendKeys("zach.harrison55@gmail.com");

        driver.findElement(By.id("order_tl")).sendKeys("513");
        driver.findElement(By.id("order_tl")).sendKeys("763");
        driver.findElement(By.id("order_tl")).sendKeys("5190");

        driver.findElement(By.id("bo")).sendKeys("Elm Rd N");


        driver.findElement(By.id("order_billing_zip")).sendKeys("55311");

        driver.findElement(By.id("cnb")).sendKeys("9464 ");
        driver.findElement(By.id("cnb")).sendKeys("4266");
        driver.findElement(By.id("cnb")).sendKeys("9291");
        driver.findElement(By.id("cnb")).sendKeys("4192");

        WebElement mySelectElm = driver.findElement(By.id("credit_card_month"));
        Select mySelect= new Select(mySelectElm);
        mySelect.selectByVisibleText("11");

        mySelectElm = driver.findElement(By.id("credit_card_year"));
        mySelect= new Select(mySelectElm);
        mySelect.selectByVisibleText("2020");

        driver.findElement(By.id("cvw")).sendKeys("581");

        driver.findElement(By.cssSelector("label[class='has-checkbox terms']")).findElement(By.className("iCheck-helper")).click();

        //driver.findElement(By.name("commit")).click();

        end = System.currentTimeMillis() - start;
        System.out.println(end);
        driver.close();
    }


    @Test
    public void Supreme_Accessorie () {

        long start = 0;
        long end;
//ul/li



        driver.findElement(By.linkText("Visor Logo Camp Cap")).click();

        // select color
        driver.findElement(By.cssSelector("a[data-style-name=Navy]")).click();

        // check for soldout or not

        boolean found = false;
        while(!found) {
            try{
                driver.findElement(By.name("commit"));
                driver.findElement(By.name("commit")).click();
                start = System.currentTimeMillis();
                found = true;
            }catch (NoSuchElementException error){
                found = false;
            }
        }

        found = false;
        while(!found) {
            try{
                driver.findElement(By.linkText("checkout now"));
                driver.findElement(By.linkText("checkout now")).click();
                start = System.currentTimeMillis();
                found = true;
            }catch (NoSuchElementException error){
                found = false;
            }
        }

        found = false;
        while(!found) {
            try{
                driver.findElement(By.id("order_billing_name"));
                driver.findElement(By.id("order_billing_name")).sendKeys("Zachary Harrison");
                start = System.currentTimeMillis();
                found = true;
            }catch (NoSuchElementException error){
                found = false;
            }
        }

        driver.findElement(By.id("order_email")).sendKeys("zach.harrison55@gmail.com");

        driver.findElement(By.id("order_tel")).sendKeys("484");
        driver.findElement(By.id("order_tel")).sendKeys("763");
        driver.findElement(By.id("order_tel")).sendKeys("5673");

        driver.findElement(By.id("bo")).sendKeys("627 N Lake St");


        driver.findElement(By.id("order_billing_zip")).sendKeys("53703");

        driver.findElement(By.id("cnb")).sendKeys("3712 ");
        driver.findElement(By.id("cnb")).sendKeys("4761");
        driver.findElement(By.id("cnb")).sendKeys("6440");
        driver.findElement(By.id("cnb")).sendKeys("9430");

        WebElement mySelectElm = driver.findElement(By.id("credit_card_month"));
        Select mySelect= new Select(mySelectElm);
        mySelect.selectByVisibleText("08");

        mySelectElm = driver.findElement(By.id("credit_card_year"));
        mySelect= new Select(mySelectElm);
        mySelect.selectByVisibleText("2020");

        driver.findElement(By.id("vval")).sendKeys("383");

        driver.findElement(By.cssSelector("label[class='has-checkbox terms']")).findElement(By.className("iCheck-helper")).click();

        //driver.findElement(By.name("commit")).click();

        end = System.currentTimeMillis() - start;
        System.out.println(end);
        driver.close();
    }
}
