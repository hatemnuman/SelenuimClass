package com.review;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

import HatemUtils.myContant;

public class TableDEmo extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
setUp("chrome", myContant.HRMS_URL);
		
		String userNmae="admin";
		String passWord="Hum@nhrm123";
		
		driver.findElement(By.id("txtUsername")).sendKeys(userNmae);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td"));
		int rowNumber = row.size();
		System.out.println(rowNumber);
		
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td"));
		Iterator<WebElement> it = row1.iterator();
		while(it.hasNext()) {
			String text = it.next().getText();
			System.out.println(text);
		}
		
		
		
		

	}

}
