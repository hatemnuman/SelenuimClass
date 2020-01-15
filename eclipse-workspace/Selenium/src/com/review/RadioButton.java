package com.review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import HatemUtils.myCommonMethods;
import HatemUtils.myContant;

public class RadioButton extends myCommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUp("chrome", myContant.buttonPage);
//		driver.findElement(By.xpath("//a[@href='#' and text()='Input Forms']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[3]/a")).click();
//		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
		button.click();
		Thread.sleep(3000);
		
		if (button.isSelected()) {
			System.out.println("the Button is selccted");
		}else {
			System.out.println("The button is not selcted");
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
