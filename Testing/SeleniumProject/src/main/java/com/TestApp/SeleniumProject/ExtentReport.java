package com.TestApp.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws InterruptedException {
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("Google Search Test -1 ", "This is a test to validate Google search Functionality");
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		test.log(Status.INFO, "Starting Test Case");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000/signup");
		test.pass("Navigated to Signup Page");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Mohamed");
		test.pass("Entered data in name");
		Thread.sleep(2000);
		driver.findElement(By.name("contact")).sendKeys("9475768493");
		test.pass("Entered data in contact");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("mohamed123@gmail.com");
		test.pass("Entered data in email");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("mohamed");
		test.pass("Entered data in username");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Mohamed@134");
		test.pass("Entered data in Password");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		test.pass("Automatically User Registerd");
		
		test.pass("Test Completed");
		extent.flush();
	}
}