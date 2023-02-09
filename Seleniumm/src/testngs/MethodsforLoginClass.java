package testngs;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class MethodsforLoginClass extends Loginss{
	 
	public String getPageUrl() {
		String urll = driver.getCurrentUrl();
		return urll;
	}
	
	public String gePagetTitle() {
		String ttl = driver.getTitle();
		return ttl;
	}
	
	public void loginoOrangehrm(String usnm , String pass) {
		driver.findElement(By.id("user-name")).sendKeys(usnm);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
	}
	public String getPageText(String texts) {
		String txt = driver.findElement(By.xpath("//span[text()='"+ texts +"']")).getText();
		//System.out.println(txt);
		return txt;
	}
	public String getPageItems(String texts) {
		String txt = driver.findElement(By.xpath("//*[text()='"+ texts +"']")).getText();
		System.out.println(txt);
		return txt;
	
	}
}
