package testngs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Loginss {
	public static WebDriver driver;
	static String url ="https://www.saucedemo.com/";
	
	@BeforeTest
	public void initiBrower() {
		System.setProperty("Webdriver.chrome.driver", "D:\\sele\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
		@Test(priority = 0)
		void verifyUrl() {
			MethodsforLoginClass ob = new MethodsforLoginClass();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(ob.getPageUrl(), url,"verifying url");
			System.out.println(" verify url of page");
			sa.assertAll();	
	}
		@Test(priority = 1)
		void  verifyTitle() {
			MethodsforLoginClass ob = new MethodsforLoginClass();	
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(ob.gePagetTitle(), "Swag Labs","Verifying title");
			System.out.println(" verify title of page");
			sa.assertAll();
		}
		
		
		@Test(priority = 2)
		void verifylogin() {
			MethodsforLoginClass ob = new MethodsforLoginClass();	
			ob.loginoOrangehrm("standard_user","secret_sauce");
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(ob.getPageText("Products"), "PRODUCTS","verifying page text");
			System.out.println("verifying next page open after login");
			sa.assertAll();
		}
		@Test (priority = 3, dependsOnMethods="verifylogin")
		void verifypageitems() {
			MethodsforLoginClass ob = new MethodsforLoginClass();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(ob.getPageItems("Sauce Labs Backpack"), "Sauce Labs Backpack", "verifying page items");
			sa.assertEquals(ob.getPageItems("Sauce Labs Bolt T-Shirt"), "Sauce Labs Bolt T-Shirt", "verifying page items");
			sa.assertEquals(ob.getPageItems("Sauce Labs Onesie"), "Sauce Labs Onesie", "verifying page items");
			sa.assertEquals(ob.getPageItems("Sauce Labs Bike Light"), "Sauce Labs Bike Light", "verifying page items");
			System.out.println("verifying next page items");
			sa.assertAll();
		}
}
