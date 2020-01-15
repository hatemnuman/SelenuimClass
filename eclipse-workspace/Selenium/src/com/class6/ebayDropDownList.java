package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import HatemUtils.myCommonMethods;

public class ebayDropDownList extends myCommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp("Chrome", "https://www.ebay.com/");
		WebElement searchList = driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));

		Select select = new Select(searchList);

//		List<WebElement> options = select.getOptions();
//		for (WebElement element : options) {
//
//			element.click();
//			Thread.sleep(1000);
//
//		}
		
		List<WebElement> option = select.getOptions();
		
		boolean isSelected = false;
		for (WebElement elemnet:option) {
			
		}

		Thread.sleep(2000);
		driver.close();

	}

}
