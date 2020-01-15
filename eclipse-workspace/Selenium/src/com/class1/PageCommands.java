package com.class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//http--->hypertext transfer protocol
		driver.get("https://www.google.com");
		final String expectedTitel="Google";
		String acualTitell=driver.getTitle();
		
		if (expectedTitel.equals(acualTitell)) {
			
			System.out.println("Correct");
		}else {
			System.out.println("wrong web browser");
		}
		
		System.out.println("*************************");
		
		 String expectedUrl="https://www.google.com/?gws_rd=ssl";
	        String actualUrl=driver.getCurrentUrl();
	        
	        
	        if(expectedUrl.equals(actualUrl)) {
	            System.out.println("Both URL matched");
	        }else {
	            System.err.println("Actual and Expected did not match");
	        }
	        
	        
	        
	        driver.close();
	        
	    }
	}
