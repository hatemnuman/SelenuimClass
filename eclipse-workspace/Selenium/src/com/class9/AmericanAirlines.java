package com.class9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import com.utils.CommonMethods;

public class AmericanAirlines extends CommonMethods {

//	TC 1: Table headers and rows verification
//	1. Open chrome browser
//	2. Go to “https://www.aa.com/homePage.do”
//	3. Enter From and To
//	4. Select departure as May 14 of 2020
//	5. Select arrival as November 8 of 2020
//	6. Verify “Choose flights” text is displayed
//	7. Close browser

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setUp("chrome", "https://www.aa.com/homePage.do");

		String flightFrom = "MSP";
		String flightTo = "FLL";

		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys(flightFrom);
		Thread.sleep(3000);
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys(flightTo);
		Thread.sleep(3000);
		WebElement list = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));

		Select select = new Select(list);
		select.selectByVisibleText("3");
		Thread.sleep(5000);
		driver.findElement(By.id("aa-leavingOn")).click();

		Thread.sleep(3000);

		String xpath = "//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]";
		String month = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(month);

		if (month.contains("February")) {

			List<WebElement> table1 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

			for (WebElement element : table1) {
				String day = element.getText();
				if (day.contains("14")) {
					element.click();
				}
			}
		} else {
			
			Thread.sleep(3000);

			String xpath2 = "//*[@id=\"ui-datepicker-div\"]/div[2]/div/div/span[1]";
			String month2 = driver.findElement(By.xpath(xpath2)).getText();
			System.out.println(month2);

			if (month2.equals("February")) {

				List<WebElement> table2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

				for (WebElement element2 : table2) {
					Thread.sleep(3000);
					String day2 = element2.getText();
					if (day2.contains("14")) {
						element2.click();
					}
				}
			}

		}

	}

	// String xpath2="//*[@id=\"ui-datepicker-div\"]/div[2]/div/div/span[1]";

}
