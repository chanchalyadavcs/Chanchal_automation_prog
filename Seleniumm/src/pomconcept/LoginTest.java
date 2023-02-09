package pomconcept;

import static org.testng.Assert.assertEquals;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class LoginTest extends BaseTest{
	
	@Test(priority = 1)
	public void verifyTitleOfLoginPage() {
		String verifyTitlepg = loginPage.titleOfLoginPage();
		AssertJUnit.assertEquals(verifyTitlepg,"Login");
	}
	@Test(priority = 2)
	public void verifyUrl() {
		String verifyUrl = loginPage.urlOfPage();
		AssertJUnit.assertEquals(verifyUrl ,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
	}
	@Test(priority = 3)
	public void verifyLogin() {
		loginPage.addusrnm("Admin");
		loginPage.addpass("admin123");
		loginPage.logintoPage();
		String dashtitle = dashboardPage.titleofDashBoard();
		AssertJUnit.assertEquals(dashtitle, "Dashboard");
		
	}
	@Test(priority = 4)
	public void verifyBuildname() {
		String verifyTitleOfBuild = loginPage.Buildtitle();
		AssertJUnit.assertEquals(verifyTitleOfBuild, "OrangeHRM");
	}
	

}
