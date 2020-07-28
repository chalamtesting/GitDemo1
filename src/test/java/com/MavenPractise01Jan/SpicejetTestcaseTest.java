package com.MavenPractise01Jan;
/*
 * This program is for mouseovering and performing actions on a website
 * 02/01/2020 @10pm
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SpicejetTestcaseTest implements Setup {

	@Test
	public void Spicejetautomation() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/Default.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		Actions actions = new Actions(driver);
		WebElement loginmenu = driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		actions.moveToElement(loginmenu).perform();
		System.out.println("Moved to signup");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement submenu = driver.findElement(By.xpath("//a[contains (text(),'SpiceClub Members')]"));
		actions.moveToElement(submenu).perform();
		System.out.println("Moved to submenu");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//actions.moveToElement(signup).perform();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(signup));
		signup.click();
		System.out.println("Signup clicked");
		driver.close();
		

	}

}
