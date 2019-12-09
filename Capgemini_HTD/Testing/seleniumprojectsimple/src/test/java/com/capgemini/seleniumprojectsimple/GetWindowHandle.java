package com.capgemini.seleniumprojectsimple;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	static {
		System.setProperty("webdriver.chrome.driver", "/Training/seleniumprojectsimple/src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		String wh = driver.getWindowHandle();
		System.out.println(wh);

		driver.get("http://www.naukri.com/");
		Set<String> whs = driver.getWindowHandles();
		System.out.println("number of windows : "+whs.size());
		driver.quit();
	}

}
