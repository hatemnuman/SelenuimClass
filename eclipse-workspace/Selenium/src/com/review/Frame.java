package com.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import HatemUtils.myCommonMethods;
import HatemUtils.myContant;

public class Frame extends myCommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUp("chrome", myContant.myLink2);
		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Iframe")).click();
		Thread.sleep(3000);
		WebElement sentence = driver.findElement(By.xpath("//h2[text()='IFrame practice']"));
		Thread.sleep(3000);
		System.out.println("The maion page sentence is "+sentence.getText());
		Thread.sleep(3000);
		driver.switchTo().frame("FrameOne");
		WebElement sentence2 = driver.findElement(By.xpath("//h4[@data-animation='animated bounceInUp']"));
		System.out.println("The inside sentence is "+sentence2.getText());
		
		

	}

}
