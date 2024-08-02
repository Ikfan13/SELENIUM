package com.TestApp.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com/");
//		Thread.sleep(1000);
//		driver.findElement(By.id("APjFqb")).sendKeys("gmail");
//		Thread.sleep(1000);
//		driver.findElement(By.name("btnK")).click();
//        Thread.sleep(1000);
		
		driver.get("https://www.google.com/intl/en-US/gmail/about//");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ikfan1321@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        
     }

}
