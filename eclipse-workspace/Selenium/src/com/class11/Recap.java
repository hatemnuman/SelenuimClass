package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.utils.CommonMethods;

public class Recap extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setUp("Chrome", "https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone 11 pro");
		
		Actions act=new Actions(driver);
		
		WebElement button = driver.findElement(By.name("btnk"));
		
		act.moveToElement(button).click().perform();
		
		

	}

}
