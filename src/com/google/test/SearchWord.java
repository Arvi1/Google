package com.google.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SearchWord {
	
	WebDriver driver;
	@Test
	public void searchWord(){
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com.au/");
		
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("selenium webdriver");
		driver.findElement(By.id("sblsbb")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
