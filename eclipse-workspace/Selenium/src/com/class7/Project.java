package com.class7;

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
		
		//driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		//Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_pim_addEmployee"))).click();
		//driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
		
		//driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.cssSelector("input[name=firstName]")).sendKeys("Hatem");
		
		driver.findElement(By.cssSelector("input[name='middleName']")).sendKeys("M");
		
		driver.findElement(By.id("lastName")).sendKeys("Numan");
		
		driver.findElement(By.id("employeeId")).sendKeys("1");
		
		driver.findElement(By.id("chkLogin")).click();
		
		driver.findElement(By.id("user_name")).sendKeys("Temnumann");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("Hawa246246!");
		driver.findElement(By.id("re_password")).sendKeys("Hawa246246!");
		
		WebElement dropList = driver.findElement(By.id("status"));
		Select select = new Select(dropList);
		
		List<WebElement> options = select.getOptions();
		
		
		for (WebElement element:options) {
			
			String dd = element.getText();
			
			if(dd.equalsIgnoreCase("Enabled")) {
				element.click();
				Thread.sleep(1000);
			}
			
		}
		
		driver.findElement(By.id("btnSave")).click();
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
