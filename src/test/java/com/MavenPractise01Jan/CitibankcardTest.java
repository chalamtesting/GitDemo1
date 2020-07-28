package com.MavenPractise01Jan;

import org.openqa.selenium.By;
/* Date: 25-12-2019 @11pm
 * This program is for verifying citibank card with both Chrome & Gecko driver
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class CitibankcardTest implements Setup {
	
		
	/*
	 * @BeforeClass public void ExtentDemo() { ExtentHtmlReporter reporter = new
	 * ExtentHtmlReporter(
	 * "C:\\Users\\smpanasa\\eclipse-workspace\\ExtentReports\\Extentreport04012020_2.html"
	 * ); ExtentReports extent = new ExtentReports();
	 * extent.attachReporter(reporter); ExtentTest logger =
	 * extent.createTest("CitibankcardTest"); logger.log(Status.INFO,
	 * "ProrityScenario testing"); logger.log(Status.PASS, "all cases passed");
	 * extent.flush(); }
	 */

	@Test(description = "clicking on apply now button")
	public void testcase() throws InterruptedException {
		// System.setProperty(CHROME_KEY, CHROME_PATH);
		System.setProperty(GECKO_KEY, GECKO_PATH);
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.online.citibank.co.in/credit-card/credit-card.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@id='applynowfilbtn']")).click();
		//String txt = driver.findElement(By.xpath("//h1[contains (text(),'Apply now for a Citi Credit card that complements your lifestyle')]")).getText();
		
		
		
		
		
		driver.close();
	}

}
