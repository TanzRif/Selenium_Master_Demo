package com.maven.selenium4.selenium4;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDimention {
	@Test
	public void elementHight() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);

		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));

		System.out.println("height: " + logo.getRect().getDimension().height);
		System.out.println("weidth " + logo.getRect().getDimension().width);
		System.out.println("X location: " + logo.getRect().getX());
		System.out.println("Y location: " + logo.getRect().getY());
		driver.close();

	}

}
