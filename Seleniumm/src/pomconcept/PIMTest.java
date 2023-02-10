package pomconcept;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import mainjava.PimPage;

public class PIMTest extends CommonTest{
	
	@Test(priority=3,groups= {"smoke","regression"})
	public void verifyPimPageTitle() {
		pimPage.clicknPimPageLink();
		String verifyTitleOfPim = pimPage.getPimPageTitle();
		Assert.assertEquals(verifyTitleOfPim, "PIM");
	}	
	
	@Test(priority=4,groups= {"smoke","regression"})
	public void verifyEmpSearchEmpId() {
		pimPage.setPimPageEmpId("0221");
		pimPage.clickSearchBtn();
		String verifyEmpIdAppeared= pimPage.getEmpIdFromSearchedResults("0221");
		AssertJUnit.assertEquals(verifyEmpIdAppeared, "0221");
	}
	
	@Test(priority=5,groups= {"smoke","regression"})
	public void TestIngChanges() {
		AssertJUnit.assertEquals(false, false);
	}
}
