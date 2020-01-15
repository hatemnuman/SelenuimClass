package com.class7;

import java.util.concurrent.TimeUnit;

import com.utils.CommonMethods;

public class PageLoadImplicitWait extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setUp("Chrome", "https://www.cnn.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

}
