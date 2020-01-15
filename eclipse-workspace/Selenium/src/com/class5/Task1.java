package com.class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods{
	
//	TC 1: JavaScript alert text verification
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Alerts & Modals” links
//	Click on “Javascript Alerts” links
//	Click on button in “Java Script Alert Box” section
//	Verify alert box with text “I am an alert box!” is present
//	Click on button in “Java Script Confirm Box” section
//	Verify alert box with text “Press a button!” is present
//	Click on button in “Java Script Alert Box” section
//	Enter text in the alert box
//	Quit browser
		
		public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

		public static void main(String[] args) throws InterruptedException {
			
			//The method is opening syntax Practice website using chrome browser
			CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
			
			driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Javascript Alerts")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
			Thread.sleep(2000);
			Alert alert=driver.switchTo().alert();
			Thread.sleep(2000);
			String pAlert=alert.getText();
			Thread.sleep(2000);
			System.out.println(pAlert);
			if(pAlert.equalsIgnoreCase("I am an alert box!")) {
				System.out.println("The MSG has been displayed");
			}else {
				System.out.println("The MSG is wrong");
			}
			alert.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
			Thread.sleep(2000);
			Alert alert2=driver.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
			Thread.sleep(2000);
			Alert alear3 = driver.switchTo().alert();
			Thread.sleep(2000);
			alert.sendKeys("Hatem Numan");
			Thread.sleep(2000);
			alert.accept();
			
			
			
			

	}

}
