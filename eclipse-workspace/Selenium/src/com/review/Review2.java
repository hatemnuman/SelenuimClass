package com.review;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import HatemUtils.myCommonMethods;
import HatemUtils.myContant;

public class Review2 extends myCommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setUp("chrome", myContant.myLink);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			WebElement theLink = it.next();
			System.out.println(theLink.getText()+"=========>"+theLink.getAttribute("href"));
		}

	}

}
