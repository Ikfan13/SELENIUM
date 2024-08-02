package com.TestApp.SeleniumProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestRegistrationPage {
     @Test
	 public void testRegistrationpage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/signup");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Mohamed");
		Thread.sleep(2000);
		driver.findElement(By.name("contact")).sendKeys("9475768493");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("mohamed123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("mohamed");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Mohamed@134");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
	}

}
