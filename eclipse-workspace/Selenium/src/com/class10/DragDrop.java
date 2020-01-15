package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class DragDrop extends CommonMethods{
	
//	TC 1: Drag and Drop verification
//	1. Open chrome browser
//	2. Go to “https://jqueryui.com/”
//	3. Click on “Droppable” link
//	4. Using mouse drag “Drag me to my target” to the “Drop Here”
//	5. Close the browser

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setUp("Chrome", "https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		

	}

}
