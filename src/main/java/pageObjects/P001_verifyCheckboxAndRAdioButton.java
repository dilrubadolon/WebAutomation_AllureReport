package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P001_verifyCheckboxAndRAdioButton {
 WebDriver driver=null;
 public P001_verifyCheckboxAndRAdioButton(WebDriver driver) {
	 
	 this.driver=driver;
 }
 By radio =By.xpath("//body/div[1]/fieldset[1]/label[1]");
 By checkbox=By.xpath("//body[1]/div[1]/fieldset[2]/label[1]/span[2]");
 
 public void clickRadioButton() {
	 driver.findElement(radio).click();
	 
 }
 public void clickcheckbox() {
	 driver.findElement(checkbox).click();
	 
 }
}
