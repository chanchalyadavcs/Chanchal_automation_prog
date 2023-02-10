package mainjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomconcept.BaseTest;

public class PimPage extends BaseTest {
	@FindBy(xpath="//*[text()='PIM']")
	WebElement setPIMPage;
	
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement titleOfPimPage;
	
	@FindBy(xpath="//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	WebElement setEmpId;

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickSearch;
	
	@FindBy(xpath="//*[@class='orangehrm-container']")
	WebElement searchedRecordId;
	
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clicknPimPageLink() {
		setPIMPage.click();
	}
	public String getPimPageTitle() {
		return titleOfPimPage.getText();
	}
	public void setPimPageEmpId(String empId) {
		setEmpId.sendKeys(empId);
	}
	public void clickSearchBtn() {
		clickSearch.click();
	}
	public String getEmpIdFromSearchedResults(String empId) {
		clickSearch.click();
		return searchedRecordId.findElements(By.xpath("//div[text()='"+empId+"']")).get(0).getText();
	}

}
