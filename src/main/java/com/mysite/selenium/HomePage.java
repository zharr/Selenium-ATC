package com.mysite.selenium;

import org.openqa.selenium.By;

public class HomePage {
    // the tabs
    public static final String LOC_LNK_PROJECTSTAB = "li#menu_projects a[href$='projects/']";
    public static final String LOC_LNK_DOWNLOADTAB = "li#menu_download a[href$='download/']";
    public static final By LOC_LNK_DOCUMENTATIONTAB = By.xpath("//li[@id='menu_documentation']/a[contains(@href, 'docs/')]");
    public static final String LOC_LNK_SUPPORTTAB = "li#menu_support a[href$='support/']";
    public static final String LOC_LNK_ABOUTTAB = "li#menu_about a[href$='about/']";
    // download link
    public static final By LOC_LNK_DOWNLOADSELENIUM = By.linkText("Download Selenium");
    public static final By LOC_LINK_SHORTS = By.xpath("//div[@class='product-info']/a[contains(@href, '/products/run-it-shell-short-grey')]");
    public static final By LOC_LINK_SIZE_ONE = By.xpath("//div[@id='product-variants']/select[@id='product-select']/option[1]");    //[@value='Large']");
    public static final By LOC_LINK_SIZE_TWO = By.xpath("//div[@id='product-variants']/select[@id='product-select']/option[2]");
    public static final By LOC_LINK_SIZE_THREE = By.xpath("//div[@id='product-variants']/select[@id='product-select']/option[3]");




    // PALACE LINKS
    public static final By LOC_LINK_ADD_P = By.xpath("//form[@action='/cart/add']/input[@class='add cart-btn clearfix']");
    public static final By LOC_LINK_CART_P = By.xpath("//div[@id='main-nav']/a[@href='/cart']");
    public static final By LOC_LINK_CHK_P = By.xpath("//div[@id='basket-right']/input[@id='checkout']");
    public static final By LOC_LINK_EMAIL_P = By.xpath("//div[@class='field__input-wrapper']/input[@placeholder='Email']");
    public static final By LOC_LINK_FIRST_P = By.xpath("//div[@class='field__input-wrapper']/input[@placeholder='First name']");
    public static final By LOC_LINK_LAST_P = By.xpath("//div[@class='field__input-wrapper']/input[@placeholder='Last name']");
    public static final By LOC_LINK_ADDY_P = By.xpath("//div[@class='field__input-wrapper']/input[@placeholder='Address']");
    public static final By LOC_LINK_CITY_P = By.xpath("//div[@class='field__input-wrapper']/input[@placeholder='City']");
    public static final By LOC_LINK_ZIP_P = By.xpath("//div[@class='field__input-wrapper']/input[@placeholder='Zip code']");
    public static final By LOC_LINK_PHONE_P = By.xpath("//div[@class='field__input-wrapper']/input[@placeholder='Phone']");
    public static final By LOC_LINK_CHK_NEXT_P = By.xpath("//div[@class='step__footer']/button[@class='step__footer__continue-btn btn ']");
    public static final By LOC_LINK_CARD_P = By.xpath("//div[@class='field__input-wrapper field__input-wrapper--icon-right']/input[@placeholder='Card number']");
    public static final By LOC_LINK_NAME_CARD_P = By.xpath("//div[@class='field__input-wrapper']/input[@placeholder='Name on card']");
    public static final By LOC_LINK_DATE_P = By.xpath("//div[@class='field__input-wrapper']/input[@placeholder='MM / YY']");
    public static final By LOC_LINK_CVV_P = By.xpath("//div[@class='field__input-wrapper field__input-wrapper--icon-right']/input[@placeholder='CVV']");
    public static final By LOC_LINK_SIZE_P = By.xpath("//div[@id='product-variants']/select[@id='product-select']");




}

