package com.review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import HatemUtils.myCommonMethods;
import HatemUtils.myContant;

public class RadioButton2 extends myCommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", myContant.buttonPage);
		
		List<WebElement> age = driver.findElements(By.name("ageGroup"));
		
		for (WebElement element:age) {
			
			String rAge = element.getAttribute("value");
			
			if (rAge.equals("15 - 50")) {
				element.click();
				
				System.out.println("The selcted age groub is "+rAge );
			}
			
			
		}
		
		Thread.sleep(3000);
		driver.close();

		
		
	}

}
