package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.driverSetup;
import pageObjects.P001_verifyCheckboxAndRAdioButton;

public class TC004_checkBoxAndRadioButtonadvance extends driverSetup {
	public static String baseurl = "https://jqueryui.com/checkboxradio";

	@Test
	public static void checkBoxRadioButtonInIframe() throws InterruptedException {
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		P001_verifyCheckboxAndRAdioButton clicking =new P001_verifyCheckboxAndRAdioButton(driver);
		
		clicking.clickRadioButton();
		Thread.sleep(1000);
		clicking.clickcheckbox();
		Thread.sleep(1000);
		
		
		
		//driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[1]")).click();

		//driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[1]/span[2]")).click();
		//Thread.sleep(1000);

		//Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.close();

	}
}
