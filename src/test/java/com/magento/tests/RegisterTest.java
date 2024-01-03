package com.magento.tests;

import com.magento.utils.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerWithEmail (){
        driver.findElement(By.linkText("Create an Account")).click();
        driver.findElement(By.id("firstname")).sendKeys("Melany01");
        driver.findElement(By.id("lastname")).sendKeys("Rios01");
        driver.findElement(By.id("email_address")).sendKeys("kq4753709@gmail.com");
        driver.findElement(By.id("password")).sendKeys("2]H9N%S9q[Dk");
        driver.findElement(By.id("password-confirmation")).sendKeys("2]H9N%S9q[Dk");
        driver.findElement(By.className("submit")).submit();
    }
}
