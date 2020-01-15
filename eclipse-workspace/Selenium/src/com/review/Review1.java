package com.review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import HatemUtils.myCommonMethods;
import HatemUtils.myContant;

public class Review1 extends myCommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCommonMethods.setUp("chrome", myContant.myLink);
		List<WebElement>  links=driver.findElements(By.tagName("a"));
		int acualLiksNumber=links.size();
		System.out.println(acualLiksNumber);
		int expectedLinksNumber=46;
		
		if (acualLiksNumber==expectedLinksNumber) {
			System.out.println("The Number of Links  are Correct");
		}else {
			System.err.println("The Number of Links are wrong ");
		}
		
		for (WebElement printLins:links) {
			
			System.out.println(printLins.getText()+"=="+printLins.getAttribute("href"));
		}
		

	}

}
