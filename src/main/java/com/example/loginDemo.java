package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginDemo {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //ful screnn

        driver.get("https://practicetestautomation.com/practice-test-login/?utm_source=chatgpt.com");

        driver.findElement(By.id("username")).sendKeys("student");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Password123");
        Thread.sleep(2000);
        driver.findElement(By.id("submit")).click();

        String successMsg = driver.findElement(By.tagName("h1")).getText();
        if(successMsg.equals("Logged In Successfully")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();

    }
}