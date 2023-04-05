package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCromeBrowser implements LaunchInterface {
	public WebDriver launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raghuvr\\Documents\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}

}
