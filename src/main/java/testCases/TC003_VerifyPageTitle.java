package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.driverSetup;

public class TC003_VerifyPageTitle extends driverSetup {
	public String baseUrl ="http://automationpractice.com/index.php";
	
	@Test(priority=1)
	public void verifyPageTitle_shouldpass() {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String foundTitleFromWebsite=driver.getTitle();
		
		SoftAssert softly = new SoftAssert();
		softly.assertEquals(foundTitleFromWebsite,"My Store");
		
		softly.assertAll();
		
	}
	@Test(priority=2)
	public static void isWebSiteSecured() {
	String url=driver.getCurrentUrl();
	if (url.contains("https")) {
		System.out.println("site is secured");
	}
	else {
		System.out.println("site is not secured");
	}
	
	
	}
	

}
