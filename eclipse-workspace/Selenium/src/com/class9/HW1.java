package com.class9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.bcel.internal.Constants;
import com.utils.CommonMethods;

import HatemUtils.myContant;

public class HW1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * TC 1: Delete Employee Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/au Login into
		 * the application Add Employee Verify Employee has been added Go to Employee
		 * List Delete added Employee Quit the browser
		 */
		
		setUp("chrome", myContant.HRMS_URL);
		
		String userNmae="admin";
		String passWord="Hum@nhrm123";
		
		driver.findElement(By.id("txtUsername")).sendKeys(userNmae);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Employee"))).click();
		
		String firstName="aaa";
		String lastNmae="AAA";
		
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys(lastNmae);
		
		String emoId = driver.findElement(By.id("employeeId")).getAttribute("value");
		
		driver.findElement(By.id("btnSave")).click();
		String idEmp = driver.findElement(By.id("profile-pic")).getText();
		
		if (idEmp.equals(firstName+" "+lastNmae)) {
			System.out.println("Name is displayed Corretly "+firstName+" "+lastNmae);
		}else {
			System.out.println("Adding emolyee Faild");
		}
		
		WebDriverWait wait1=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Employee List']"))).click();
		
		boolean found=false;
		
		while (!found) {
		
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='resultTable']/tbody//tr"));
		
		for (int i=1; i<row.size();i++) {
			
			String text = row.get(i-1).getText();
			
			if (text.contains("Qais")) {
				
				found=true;
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody//tr["+i+"]/td[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("btnDelete")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("dialogDeleteBtn")).click();
				
				Thread.sleep(3000);
				break;
			}
			
			
			
		}
		
		driver.findElement(By.xpath("//a[text()='Next']")).click();		
		
		}
		
		
		
		
		
		
		driver.quit();		
		
		

	}

}
