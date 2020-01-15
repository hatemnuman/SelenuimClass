package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mip.moe.gov.sa/mim/account/signin?ReturnUrl=%2fmim%2fissue%2fwsfed%3fwtrealm%3dhttps%3a%2f%2fsafeer2.moe.gov.sa%2fprweb%2f%26wctx%3d9b3acadb-f557-4ea4-bdb7-5b4c2e3d58a0%26wa%3dwsignin1.0&wtrealm=https://safeer2.moe.gov.sa/prweb/&wctx=9b3acadb-f557-4ea4-bdb7-5b4c2e3d58a0&wa=wsignin1.0");
		
		driver.findElement(By.id("UserName")).sendKeys("hnuman@sacm.org");
		driver.findElement(By.id("Password")).sendKeys("Password111");
		driver.findElement(By.id("CaptchaImage")).sendKeys("y4dc");
		driver.findElement(By.className("tetco-btn rm login-btn pull-right btn-block ")).click();

	}

}
