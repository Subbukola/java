package com.codes.mavenCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Subbu Started work");
		Thread.sleep(2000);
		
		
		driver.switchTo().frame("frm1"); //switching from default to frame1
		Select select_dropdown = new Select(driver.findElement(By.id("course")));//handlig dropdown
		select_dropdown.selectByVisibleText("Python");
		
		
		driver.switchTo().defaultContent();//switching back to main(default)
		
		driver.switchTo().frame("frm2");//switching from default to frame2
		driver.findElement(By.name("fName")).sendKeys("Subbu");
		Thread.sleep(2000);
		driver.findElement(By.name("lName")).sendKeys("Kola");
		Thread.sleep(2000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("malerb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("chinesechbx")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("chinesechbx")).click();
		
		
		
		driver.switchTo().defaultContent();//switching back to main(default)
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Now I started handling frame 3");
		driver.switchTo().frame("frm3"); //switching from default to frame3
		driver.switchTo().frame("frm1"); //switching from default to frame1 in frame3
		Select select_menu = new Select(driver.findElement(By.id("selectnav1")));
		select_menu.selectByVisibleText("-- Apache POI");
		
		
		driver.switchTo().defaultContent();//switching back to main(default)
		//driver.navigate().refresh();
		

	}

}
