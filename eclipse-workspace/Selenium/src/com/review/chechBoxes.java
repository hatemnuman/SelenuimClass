package com.review;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sun.org.apache.bcel.internal.Constants;
import com.utils.CommonMethods;

import HatemUtils.myContant;

public class chechBoxes extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		CommonMethods.setUp("chrome",myContant.myLink2 );
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='#' and text()='Input Forms']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Checkbox Demo")).click();
		Thread.sleep(3000);
		WebElement age = driver.findElement(By.xpath("//input[@type='checkbox' and @id='isAgeSelected']"));
		//age.click();
		
		if (age.isSelected()) {
			
			System.out.println("button is selcted");
			
		}else {
			
			System.out.println("Button is not selcted");
		}
		
		List<WebElement> myObtion = driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		if (!myObtion.isEmpty()) {
		
		Iterator<WebElement> it = myObtion.iterator();
		while (it.hasNext()) {
			it.next().click();
			Thread.sleep(2000);
		}
		
		}else {
			
			System.out.println("My List is empty");
		}

	}

}
