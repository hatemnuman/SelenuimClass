package com.class5;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

//TC 1: Syntax Frame verification
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Others” link
//Click on “Iframe” link
//Click on the “Home” link inside the 1 frame
//Verify “Syntax logo” is displayed in another frame
//Quit browser

public class Task2 extends CommonMethods {

	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		// The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe")).click();
		Thread.sleep(2000);
//		driver.findElement(By.linkText("Home")).click();
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
		String mainPageText = driver.findElement(By.xpath("//h2[text()='IFrame practice']")).getText();
		Thread.sleep(2000);
		System.out.println(mainPageText);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		String insidePageMsg = driver.findElement(By.xpath("//h4[text()='Practice Selenium Automation Testing Online']")).getText();
		Thread.sleep(2000);
		System.out.println(insidePageMsg);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("FrameTwo");
		Thread.sleep(2000);
		String secondInsideMasg=driver.findElement(By.xpath("//p[text()='New SDET Automation Session starts on January 18th, 2020.']")).getText();
		Thread.sleep(2000);
		System.out.println(secondInsideMasg);

	}

}
