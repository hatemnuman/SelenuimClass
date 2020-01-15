package com.review;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import HatemUtils.myCommonMethods;

public class MulltiWindow extends myCommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUp("chrome", "https://accounts.google.com/signup");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
		
		Set<String> allWndows = driver.getWindowHandles();
		System.out.println(allWndows.size());
		
		Iterator<String> it = allWndows.iterator();
		String parentW = it.next();
		String childW = it.next();
		
		System.out.println(parentW);
		System.out.println(childW);
		
		driver.switchTo().window(parentW);
		driver.switchTo().window(childW);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@placeholder='Describe your issue']")).sendKeys("Hatem numan made it");
		
		
		

	}

}
