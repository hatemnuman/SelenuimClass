package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods{
	
//	TC 1: Verify element is present

//	Open chrome browser
//	Go to “https://the-internet.herokuapp.com/”
//	Click on “Click on the “Dynamic Loading” link
//	Click on “Example 1...” and click on “Start”
//	Verify element with text “Hello World!” is displayed
//	Close the browser

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUp("chrome", "https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[contains(text(),Start)]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		boolean isDisplayed=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		
		if (isDisplayed) {
			
			System.out.println("Testing Pass");
		}else {
			
			System.out.println("Testing Faild");
		}
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
