package com.review;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import HatemUtils.myCommonMethods;
import HatemUtils.myContant;
import sun.nio.ch.SelChImpl;

public class DropDown extends myCommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", myContant.myLink2);
		driver.findElement(By.xpath("//a[@href='#' and text()=\"Input Forms\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Select Dropdown List")).click();
		Thread.sleep(3000);
		
		WebElement myList = driver.findElement(By.id("select-demo"));
		
		Thread.sleep(3000);
		
		Select select = new Select(myList);
		
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("Friday");
		Thread.sleep(3000);
		select.selectByVisibleText("Sunday");
		Thread.sleep(3000);
		
		List<WebElement> option = select.getOptions();
		System.out.println(option.size());
		
		WebElement myList2 = driver.findElement(By.id("multi-select"));
		
		Select select2=new Select(myList2);
		
//		select2.selectByIndex(0);
//		Thread.sleep(3000);
//		select2.selectByVisibleText("Ohio");
		
		List<WebElement> myOption = select2.getOptions();
		
//		for (WebElement element:myOption) {
//			
//			element.click();
//			Thread.sleep(3000);
//		}
		
//		for (WebElement element:myOption) {
//			
//			element.click();
//			Thread.sleep(3000);
//		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Alerts & Modals")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Javascript Alerts")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("The Displied text is "+alert.getText());
		
		
		
		
		//driver.close();

		
	}

}
