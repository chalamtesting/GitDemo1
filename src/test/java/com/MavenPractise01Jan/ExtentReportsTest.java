package com.MavenPractise01Jan;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsTest {
	
	@Test
	public void ExtentDemo()
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Users\\smpanasa\\eclipse-workspace\\ExtentReports\\Extentreport04012020_total.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("PriorityScenarioTest");
		ExtentTest logger2 = extent.createTest("CitibankcardTest");
		ExtentTest logger3 = extent.createTest("ExtentReportsTest");
		ExtentTest logger4 = extent.createTest("SpicejetTestcaseTest");
		ExtentTest logger5 = extent.createTest("CaptureScreenshotTest");
		
		logger.log(Status.INFO, "ProrityScenario case executed");
		logger.log(Status.PASS, "PriorityScneario cases passed");
		logger2.log(Status.INFO, "CitibankcardTest case executed");
		logger2.log(Status.PASS, "CitibankcardTest cases passed");
		logger3.log(Status.INFO, "ExtentReportsTest case executed");
		logger3.log(Status.PASS, "ExtentReportsTest cases passed");
		logger4.log(Status.INFO, "SpiceJetTestcaseTest case executed");
		logger4.log(Status.PASS, "SpiceJetTestcaseTest cases passed");
		logger5.log(Status.INFO, "CaptureScreenshotTest case executed");
		logger5.log(Status.PASS, "CaptureScreenshotTest cases passed");
		extent.flush();
	}

}
