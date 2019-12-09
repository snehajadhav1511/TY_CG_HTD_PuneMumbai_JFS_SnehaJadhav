package com.capgemini.seleniumprojectsimple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ListBox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new  ChromeDriver();
driver.get("file:///D:/dropdown.html");
WebElement listBox = driver.findElement(By.id("slv"));
Select select = new Select(listBox);
Thread .sleep(1000);
select.deselectAll();
Thread .sleep(1000);
select.selectByIndex(0);
Thread .sleep(1000);
select.selectByValue("vada");

}
}
