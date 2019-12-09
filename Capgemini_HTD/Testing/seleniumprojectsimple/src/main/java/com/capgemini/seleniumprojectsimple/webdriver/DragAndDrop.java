package com.capgemini.seleniumprojectsimple.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "/Training/seleniumprojectsimple/src/main/resources/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com/");
	driver.findElement(By.xpath("//div[@id='sidebar']//aside[@class='widget']//ul//li//a[text()='Droppable']")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	Actions action = new Actions(driver);
	WebElement drag	= driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement drop	= driver.findElement(By.id("droppable"));
	action.dragAndDrop(drag, drop).perform();
}
}
