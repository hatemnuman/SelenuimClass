package com.class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//system is a class   setproperty(); is static method.

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//http--->hypertext transfer protocol
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		
		//browser navigation commands
		//it will navigate to a given Url
		
		driver.navigate().to("http://www.syntaxtechs.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		
		String actualTitel =driver.getTitle();
		
		
		
		driver.close();

	}

}
