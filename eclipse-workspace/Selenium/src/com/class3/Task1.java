package com.class3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 1: HRMS Application Login: 
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username and password
//Click on login button
//Then verify Syntax Logo is displayed.
//TC 2: HRMS Application Negative Login: 
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username
//Leave password field empty
//Verify error message with text “Password cannot be empty” is displayed.


public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("VanEarl");
		WebElement myPassword= driver.findElement(By.xpath("//input[@name='txtPassword']"));
		myPassword.sendKeys("VanEarl@&12");
		String password=myPassword.getAttribute("name");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement display= driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));	
		System.out.println(display.isDisplayed());
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		int myList=linksList.size();
		System.out.println(myList);
		
		for(WebElement element:linksList) {
			String allList=element.getText();
			//System.out.println(allList);
			
			if (!allList.isEmpty()) {
				System.out.println(allList);
			}
			
		}System.out.println(myList);
		
	}
}
