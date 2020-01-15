package com.class5;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task3 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

		// The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", "https://accounts.google.com/signup");
		Thread.sleep(2000);
		System.out.println("The Web Site Titel is "+driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> windowHandels=driver.getWindowHandles();
		
		System.out.println(windowHandels.size());
		Iterator<String> it=windowHandels.iterator();
		
		String parentWeb=it.next();
		String childWeb=it.next();
		
		System.out.println("Parent ID "+parentWeb);
		System.out.println("Child ID "+childWeb);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childWeb);
		
		System.out.println(driver.getTitle());
		WebElement search= driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("Hatem Numan");
		System.out.println(search.getText());
		
		
	}

}
