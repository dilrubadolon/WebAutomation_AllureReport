package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.driverSetup;

public class TC007_scroll extends driverSetup {
	public static String baseurl = "https://www.w3schools.com";

	@Test(enabled = true)
	public static void scrollCheck() throws InterruptedException {
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//h1[contains(text(),'Code Editor')]"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);
		
		

}}
