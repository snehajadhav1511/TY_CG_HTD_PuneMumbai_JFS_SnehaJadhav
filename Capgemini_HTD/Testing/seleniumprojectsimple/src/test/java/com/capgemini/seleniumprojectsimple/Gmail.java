package com.capgemini.seleniumprojectsimple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver",
				"/Training/seleniumprojectsimple/src/main/resources/chromedriver.exe");
	}

	public static void main(String[] args) {
		// open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// enter the URL
		driver.get("http://www.gmail.com/");
		// enter the valid username
		driver.findElement(By.id("identifierId")).sendKeys("snehajadhav1511@gmail.com");
		// click on next
		driver.findElement(By.id("identifierNext")).click();
		// ENter the valid password
		driver.findElement(By.name("password")).sendKeys("varshanamdev");
		// click on next
		driver.findElement(By.id("passwordNext")).click();
	}
}
