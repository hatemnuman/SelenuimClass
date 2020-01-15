package com.class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		String actualTiel=driver.getTitle();
		
		final String expectedTitelURL="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if (actualTiel.equals(expectedTitelURL)) {
			
			System.out.println("Correct");
			
		}else {
			System.out.println("Wrong");
		}
		
	

	}

}
