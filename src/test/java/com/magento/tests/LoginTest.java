package com.magento.tests;

import com.magento.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends BaseTest {

    public void accesLogin(){
        driver.findElement(By.linkText("Sign In")).click();
    }
    public void clickLogin(){
        driver.findElement(By.id("send2")).submit();
    }

    @Test
    public void loginCorrect (){
        accesLogin();
        driver.findElement(By.id("email")).sendKeys("kq4753709@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("2]H9N%S9q[Dk");
        clickLogin();

    }
    @Test
    public void loginIncorrect (){
        accesLogin();
        driver.findElement(By.id("email")).sendKeys("kq4753709@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("incorrectPas5");
        clickLogin();
    }
}
