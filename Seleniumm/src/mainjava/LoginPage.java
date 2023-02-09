package mainjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomconcept.BaseTest;

public class LoginPage extends BaseTest{
	@FindBy(xpath = "//*[text()=' Login ']")
	WebElement txtLoginPage;
	
	@FindBy(name = "username")
	WebElement usernm;
	
	@FindBy(name = "password")
	WebElement pswrd;
	
	@FindBy(tagName ="button")
	WebElement lgn;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String Buildtitle() {
		String bt = driver.getTitle();
		return bt;
	}
	
	public String titleOfLoginPage() {
		String ttl= txtLoginPage.getText();
		return ttl;
	}
	public String urlOfPage()
	{
		String urll= driver.getCurrentUrl();
		return urll;
	}
	
	public void addusrnm(String usnm) {
		usernm.sendKeys(usnm);
	}
	
	public void addpass(String pass) {
		pswrd.sendKeys(pass);
	}
	public void logintoPage() {
		lgn.click();
		
	}
	
}
