package com.codes.mavenCodes;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		Instant startTime =  Instant.now();
		System.out.println(startTime);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/search?q=hdfc&rlz=1C1ONGR_enIN997IN997&oq=hdfc+&aqs=chrome..69i57j35i39j0i20i131i263i433i512j0i512j46i131i199i291i433i512j0i512j0i131i433i512j0i512j46i131i199i291i433i512j0i131i433i512.8322j0j15&sourceid=chrome&ie=UTF-8&dlnr=1&sei=wLCVYrfDMbuXseMPyZKMGA");
		Instant endTime =  Instant.now();
		System.out.println(endTime);
		Duration diff =  Duration.between(startTime, endTime);
		System.out.println("Difference is "+ diff.toMillis() +" milliSec");
		
		driver.findElement(By.linkText("Login to NetBanking")).click();
		
		driver.findElement(By.partialLinkText("CONTINUE TO THE NEW LOGIN PAGE FOR ")).click();
		 
		
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("hsgrhsg   ");
		
		
		driver.findElement(By.linkText("CONTINUE")).click();
		
		driver.quit();

	}

}
