package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	
//	Using Xpath ONLY
//	TC 1: Facebook login: 
//	Open chrome browser
//	Go to “https://www.facebook.com/”
//	Enter valid username and valid password and click login 
//	User successfully logged in
	
//	TC 2: Mercury Tours Registration: 
//	Open chrome browser
//	Go to “http://newtours.demoaut.com/”
//	Click on Register Link
//	Fill out all required info
//	Click Submit
//	User successfully registered


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//driver.navigate().to();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("hatemnuman");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password00");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String currentUrl=driver.getCurrentUrl();
		String expectUrl="http://newtours.demoaut.com/";
		if (currentUrl.contains(expectUrl)) {
			
			System.out.println("Log in is correct");
		}else {
			System.out.println("did not login correctly");
		}
		

	}

}
