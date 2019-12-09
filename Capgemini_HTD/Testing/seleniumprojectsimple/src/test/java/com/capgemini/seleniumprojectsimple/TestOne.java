package com.capgemini.seleniumprojectsimple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']"));
		//Thread.sleep(5000);

	/*	String expected = "actiTIME - Enter Time-Track";
		String actual = driver.getTitle();*/

	}
}
