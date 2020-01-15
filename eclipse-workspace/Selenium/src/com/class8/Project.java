package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import HatemUtils.myCommonMethods;
import HatemUtils.myContant;

public class Project extends myCommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUp("Chrome", myContant.HRMS_URL);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Syntax");
		driver.findElement(By.id("txtPassword")).sendKeys("Syntax123!");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		
		String expectedValue="Tem M";
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
		
		for (int i=1; i<row.size();i++) {
			
			String textRow = row.get(i-1).getText();
			
			if (expectedValue.contains(textRow)) {
				
				driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+i+"]/td[1]")).click();
				
				Thread.sleep(3000);
				
			}else {
				
				driver.findElement(By.xpath("//a[@class='tiptip' and text()='Next']")).click();
			}
			
		}
		
		


		
	}

}
