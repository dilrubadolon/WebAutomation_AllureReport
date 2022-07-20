package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.driverSetup;

public class TC006_Refresh extends driverSetup {
	public static String baseurl = "https://www.w3schools.com";

	@Test(enabled = true)
	public static void refreshPage() throws InterruptedException {
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.gogle.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		

}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
