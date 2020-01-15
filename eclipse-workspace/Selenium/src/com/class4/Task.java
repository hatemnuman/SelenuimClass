package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	
//	TC 2: Radio Buttons Practice  
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Input Forms” links
//	Click on “Radio Buttons Demo” links
//	Click on any radio button in “Radio Button Demo” section.
//	Verify correct checkbox is clicked
//	Click on any radio button in “Group Radio Buttons Demo” section.
//	Verify correct checkbox is clicked
//	Quit browser
//	Collapse

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		WebElement rbd=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
		
		if (!rbd.isSelected()) {
			rbd.click();
		}if (rbd.isSelected()) {
			System.out.println("The button is selected");
		}else {
			System.out.println("The button  is not selected");
		}
		
	}

	

}
