package com.maven.selenium4.selenium4;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screanshot {

	@Test
	public void screnshottest() throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));

		File file = logo.getScreenshotAs(OutputType.FILE);

		File destifile = new File("logo.png");

		FileUtils.copyFile(file, destifile);

		driver.close();

	}

}
