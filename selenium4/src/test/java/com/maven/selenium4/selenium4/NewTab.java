package com.maven.selenium4.selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab {

	@Test
	public void openNewTab() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		// driver.switchTo().newWindow(WindowType.TAB);
		// driver.navigate().to("http:/goolge.com/");
		driver.close();

	}

}
