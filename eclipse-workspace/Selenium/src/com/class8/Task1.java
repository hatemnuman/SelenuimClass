package com.class8;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods{
	
	
//	TC 1: Table headers and rows verification
//
//	Open chrome browser
//	Go to “http://166.62.36.207/syntaxpractice/”
//	Click on “Table” link
//	Click on “ITable Data Search” link
//	Verify second table consist of 4 rows and 5 columns
//	Print name of all column headers 
//	Print data of all rows
//	Quit Browser

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUp("chrome", "http://166.62.36.207/syntaxpractice/");
		driver.findElement(By.xpath("//a[text()='Table']")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		
		System.out.println("*****Find Row*****");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		int rowSize = row.size();
		System.out.println("Number of the rows= "+rowSize);
		
		for (WebElement element:row) {
			String rowText = element.getText();
			System.out.println(rowText);
		}
		
		System.out.println("*****Find Column*****");
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		
		int colSize = col.size();
		System.out.println("The number of column= "+colSize);
		
		Iterator<WebElement> it = col.iterator();
		
		while (it.hasNext()) {
			
			String colText = it.next().getText();
			
			System.out.println(colText);
			
		}
		
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
