package com.codes.mavenCodes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureSS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./SS/img1.jpg");
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("ScreenShot catured");
		
//		byte [] byteArr =driver.getScreenshotAs(OutputType.BYTES);
//		File destFile = new File("./SS/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("ScreenShot catured");
		
//		TakesScreenshot takeSS = (TakesScreenshot) driver;
		
		
		driver.quit();

	}

}
