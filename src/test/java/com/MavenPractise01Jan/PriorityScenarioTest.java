package com.MavenPractise01Jan;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.logging.Logger;

import org.testng.annotations.Test;
/* Date: 26-12-2019 @8:30am
 * This Program is for checking priority concept in TestNG
 * Enabling & disabling Testcase and with description
 */

public class PriorityScenarioTest {

	/*
	 * @BeforeClass public void ExtentDemo() { ExtentHtmlReporter reporter = new
	 * ExtentHtmlReporter(
	 * "C:\\Users\\smpanasa\\eclipse-workspace\\ExtentReports\\Extentreport04012020_1.html"
	 * ); ExtentReports extent = new ExtentReports();
	 * extent.attachReporter(reporter); ExtentTest logger =
	 * extent.createTest("PriorityScenarioTest"); logger.log(Status.INFO,
	 * "ProrityScenario testing"); logger.log(Status.PASS, "all cases passed");
	 * extent.flush(); }
	 */
	private final boolean run = false;
	

	@Test(description = "this is sample first testcase", priority = 3)
	public void test1() {
		System.out.println("This is First Testcase part-1");
		System.out.println("This is First Testcase part-2");
		System.out.println("This is First Testcase part-3");
	}

	@Test(description = "this is sample second testcase", priority = 4)
	public void test2() {
		Logger.getLogger("this is second case");
		System.out.println("This is Second Testcase");
	}

	@Test(description = "this is sample Thrid testcase", priority = 1)
	public void test3() {
		System.out.println("This is Thrid Testcase");
	}

	@Test(priority = 2, description = "this is sample fourth testcase")
	public void test4() {
		System.out.println("This is Fourth Testcase");
	}

	@Test(enabled = run, priority = 2, description = "this is sample Fifth testcase")
	public void test5() {
		System.out.println("This is Fifth Testcase");
	}

	@Test(enabled = true, priority = 3, description = "this is sample Sixth testcase")
	public void test6() {
		System.out.println("This is Sixth Testcase");
	}

}
