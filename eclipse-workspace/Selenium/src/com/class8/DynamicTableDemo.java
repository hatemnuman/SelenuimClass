package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class DynamicTableDemo extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setUp("Chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr"));
		
		for(int i=0; i<list.size(); i++) {
			
			list.get(i)
		}
		
		
		

	}

}
