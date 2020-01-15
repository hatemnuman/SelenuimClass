package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task2 extends CommonMethods {

//	TC 1: Table headers and rows verification
//
//	Open chrome browser
//	Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//	Login to the application
//	Verify customer “Susan McLaren” is present in the table
//	Click on customer details
//	Update customers last name and credit card info
//	Verify updated customers name and credit card number is displayed in table
//	Close browser

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setUp("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		String expectedName = "Susan McLaren";

		List<WebElement> row = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for (int i = 1; i < row.size(); i++) {

			String rowText = row.get(i - 1).getText();

			if (rowText.contains(expectedName)) {
				driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + i + "]/td[13]")).click();

				break;

			}

		}

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).clear();

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Susan Hawa");

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("112233445566");

		driver.findElement(By.linkText("Update")).click();
		
		row.clear();
		Thread.sleep(3000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));

		//String newExpectedName = "Susan Hawa";

		for (int i = 1; i < rows.size(); i++) {
			Thread.sleep(3000);

			String newRowText = rows.get(i - 1).getText();
			

			if (newRowText.contains("Susan Hawa")) {
				Thread.sleep(3000);

				System.out.println("Passed");
				System.out.println(newRowText);
				
				break;
			}

		}

		Thread.sleep(5000);
		 driver.close();

	}

}
