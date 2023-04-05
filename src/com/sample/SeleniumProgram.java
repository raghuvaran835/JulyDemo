package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LaunchInterface lb=new LaunchCromeBrowser();
		WebDriver driver =lb.launch();
		driver.get("https://seleniumbase.io/demo_page"); //page launched
		driver.findElement(By.id("myTextInput")).sendKeys("Hello");
		driver.findElement(By.id("myTextarea")).sendKeys("Raghuvaran is good guy");
		Thread.sleep(2000);// wait 2 second
		driver.findElement(By.id("myTextInput")).clear();

	}

}
