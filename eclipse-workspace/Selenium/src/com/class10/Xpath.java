package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Xpath extends CommonMethods{
	
//	TC 1: HRMS Login
//
//	Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//	Login to the application by writing xpath based on “parent and child relation”
//
//	TC 2: HRMS Login
//
//	Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//	Login to the application by writing xpath based on “following and preceding siblings”


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		//from the parent to the child
		
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("");
		//driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input")).sendKeys("");
		

	}

}
