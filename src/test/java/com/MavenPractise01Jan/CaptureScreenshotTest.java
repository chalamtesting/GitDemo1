package com.MavenPractise01Jan;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Testcases.Webautomation.Setup;

public class CaptureScreenshotTest implements Setup {

	@Test
	public void Screenshot() throws IOException {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		WebDriver driver = new ChromeDriver();
		driver.get("test");
	
	}

}
