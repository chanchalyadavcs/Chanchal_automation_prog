package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomconcept.BaseTest;

public class DashBoardPage extends BaseTest {
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement DashboardPage;
	
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public String titleofDashBoard() {
		return DashboardPage.getText();
	}
	

}
