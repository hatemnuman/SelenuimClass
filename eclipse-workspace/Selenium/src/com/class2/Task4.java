package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.partialLinkText("registration form")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("bbbbb");
		driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("1234567899");
		driver.findElement(By.xpath("//input[contains(@id,'userName')]")).sendKeys("xxxxx@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@name,'address1')]")).sendKeys("2908 xxxxx");
		driver.findElement(By.xpath("//input[starts-with(@name,'city')]")).sendKeys("Fairfax");
		
		
	}

}
