package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.aetna.com/");
		Thread(2000);
		driver.findElement(By.partialLinkText("Login")).click();
		Thread(2000);
		driver.findElement(By.partialLinkText("Member")).click();
		Thread(2000);
		driver.findElement(By.partialLinkText("Login")).click();
		Thread(2000);
		driver.findElement(By.id("username")).sendKeys("hatemlina1");
		Thread(2000);
		driver.findElement(By.id("password")).sendKeys("");
		
		
		

	}

	private static void Thread(int i) {
		// TODO Auto-generated method stub
		
	}

}
