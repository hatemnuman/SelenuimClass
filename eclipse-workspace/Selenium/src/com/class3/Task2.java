package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	//TC 2: HRMS Application Negative Login: 
	//Open chrome browser
	//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	//Enter valid username
	//Leave password field empty
	//Verify error message with text “Password cannot be empty” is displayed.

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("VanEarl");
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("");
		driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
		WebElement errMsg=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		System.out.println(errMsg.isDisplayed());
		
		if (errMsg.isDisplayed()) {
			String message=errMsg.getText();
			if(message.equals("Password cannot be empty")) {
				System.out.println("Correct MSG Password cannot be empty is displayed");
			}else {
				System.err.println("Worng message is displayed");
			}
			
		}
		
	}

}
