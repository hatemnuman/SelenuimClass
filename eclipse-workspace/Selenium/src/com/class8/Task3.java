package com.class8;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.bcel.internal.Constants;
import com.utils.CommonMethods;

import HatemUtils.myContant;

public class Task3 extends CommonMethods {

//	TC 1: Leave List Search Validation
//
//	Open chrome browser
//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//	Login into the application
//	Select Leave List
//	Select from December 1, 2019 until January 31, 2020
//	Check only Pending approval
//	Click on Search
//	Validate “No Records Found” is displayed
//	Quit the browser

	public static void main(String[] args) throws InterruptedException {

		setUp("Chrome", myContant.HRMS_URL);
		
		
		Thread.sleep(1000);

		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_leave_viewLeaveList")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("calFromDate")).click();

		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		Select select = new Select(month);
		List<WebElement> option = select.getOptions();

		for (WebElement element : option) {

			String months = element.getText();
			if (months.equals("Dec")) {

				element.click();
			}
		}

		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

		Select select1 = new Select(year);
		select1.selectByVisibleText("2019");
		
		Thread.sleep(3000);

		List<WebElement> table = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td"));
		
		for (int i=1;i<table.size();i++) {
			String date = table.get(i).getText();
			 if (date.equals("1")) {
				 table.get(i).click();
				 
				 Thread.sleep(3000);
			 }
		}
		
		driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[2]/img")).click();
		WebElement month2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select select3 = new Select(month2);
		select3.selectByVisibleText("Jan");
		Thread.sleep(3000);
		
		WebElement year2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select4 = new Select(year2);
		
		select4.selectByVisibleText("2020");
		Thread.sleep(3000);
		
		List<WebElement> tabel2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for (int i=0;i<tabel2.size();i++) {
			
			String date2 = tabel2.get(i).getText();
			
			if (date2.equals("31")) {
				tabel2.get(i).click();
			}
		}
		
		driver.findElement(By.id("leaveList_chkSearchFilter_1")).click();
		Thread.sleep(9000);
		driver.findElement(By.id("leaveList_chkSearchFilter_1")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("btnSearch")).click();
		
//		WebDriverWait wait=new WebDriverWait(driver, 40);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class='table hover']/tbody/tr/td\"")));
		
		String text = driver.findElement(By.xpath("//td[text()='No Records Found']")).getText();
		
		if (text.equals("No Records Found")) {
			
			System.out.println("No Records Found is Displayed");
		}else
		{System.out.println("recored faild");}
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/AdminLogin.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		

		Thread.sleep(9000);
		driver.close();
	}

}

//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import com.utils.CommonMethods;
//public class HW1 extends CommonMethods {
//    public static void main(String[] args) throws InterruptedException {
//        setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
//        driver.findElement(By.id("txtUsername")).sendKeys("Syntax");
//        driver.findElement(By.id("txtPassword")).sendKeys("Syntax123!");
//        driver.findElement(By.id("btnLogin")).submit();
//        driver.findElement(By.xpath("//b[text()='PIM']")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("menu_pim_addEmployee"))));
//        
//        //Adding a new Employee
//        driver.findElement(By.id("menu_pim_addEmployee")).click();
//        driver.findElement(By.id("firstName")).sendKeys("Ali");
//        driver.findElement(By.id("lastName")).sendKeys("Veli");
//        String eID = driver.findElement(By.id("employeeId")).getAttribute("value");
//        System.out.println("An employee with id " + eID + " is added.");
//        driver.findElement(By.id("btnSave")).click();
//        
//        //Deleting the employee     
//        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
//        boolean isFound = false;
//        while(!isFound) {
//            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']//tbody/tr"));
//            
//            for(int i=1;i<rows.size();i++) {
//                WebElement row = driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+(i)+"]/td[2]"));
//            
//                String eIDRow = row.getText();
//                
//                if(eIDRow.equals(eID)) {
//                    
//                    driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+i+"]/td[1]")).click();
//                    driver.findElement(By.id("btnDelete")).submit();
//                    System.out.println("The employee with id " + eIDRow + " is deleted.");
//                    isFound = true;
//                    break;
//                }
//            }
//            
//            driver.findElement(By.xpath("//a[text()='Next']")).click();
//        }
//        
//        driver.quit();
//        
//    }
//}
