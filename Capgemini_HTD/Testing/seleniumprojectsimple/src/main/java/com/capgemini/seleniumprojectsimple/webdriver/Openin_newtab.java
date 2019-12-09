package com.capgemini.seleniumprojectsimple.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Openin_newtab {
	static {
		System.setProperty("webdriver.chrome.driver",
				"/Training/seleniumprojectsimple/src/main/resources/chromedriver.exe");
	} public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions act = new Actions(driver); // used to perform mouse actions
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		act.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
	}
}
