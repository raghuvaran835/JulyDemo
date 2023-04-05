package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LaunchInterface lb=new LaunchCromeBrowser();
		WebDriver driver=lb.launch();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("raghuvaranvit@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("asfahjvahsvvhj");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/div[2]")).getText());
		driver.navigate().to("https://salesforce.com");
		driver.wait(5000);
		driver.navigate().back();
	}

}
