package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObject.LandingPage;

public class TestCases extends BaseClass {

	LandingPage LP;

	@BeforeClass
	public void beforeClass() {
		driver = initializeDriver();
		navigateToURL();
		LP = new LandingPage(driver);

	}

	@Test
	public void case1_validatePlansKuwait() {
		LP.getOpenCountryDropdown().click();
		LP.getKwBtn().click();
		Assert.assertEquals("LITE", LP.getPlan1Name());
		Assert.assertEquals("CLASSIC", LP.getPlan2Name());
		Assert.assertEquals("PREMIUM", LP.getPlan3Name());
		Assert.assertEquals("1.2 KWD/month", LP.getPlan1PriceCurrencyName());
		Assert.assertEquals("2.5 KWD/month", LP.getPlan2PriceCurrencyName());
		Assert.assertEquals("4.8 KWD/month", LP.getPlan3PriceCurrencyName());
	}

	@Test
	public void case2_validatePlansSaudi() {
		LP.getOpenCountryDropdown().click();
		LP.getSaBtn().click();
		Assert.assertEquals("LITE", LP.getPlan1Name());
		Assert.assertEquals("CLASSIC", LP.getPlan2Name());
		Assert.assertEquals("PREMIUM", LP.getPlan3Name());
		Assert.assertEquals("15 SAR/month", LP.getPlan1PriceCurrencyName());
		Assert.assertEquals("25 SAR/month", LP.getPlan2PriceCurrencyName());
		Assert.assertEquals("60 SAR/month", LP.getPlan3PriceCurrencyName());
	}

	@Test
	public void case3_validatePlansBahrain() {
		LP.getOpenCountryDropdown().click();
		LP.getBhBtn().click();
		Assert.assertEquals("LITE", LP.getPlan1Name());
		Assert.assertEquals("CLASSIC", LP.getPlan2Name());
		Assert.assertEquals("PREMIUM", LP.getPlan3Name());
		Assert.assertEquals("2 BHD/month", LP.getPlan1PriceCurrencyName());
		Assert.assertEquals("3 BHD/month", LP.getPlan2PriceCurrencyName());
		Assert.assertEquals("6 BHD/month", LP.getPlan3PriceCurrencyName());
	}

	@Test
	public void case4_validatePlansKuwaitWhenArabic() {
		LP.getSwitchLangBtn().click();
		LP.getOpenCountryDropdown().click();
		LP.getKwBtn().click();
		Assert.assertEquals("لايت", LP.getPlan1Name());
		Assert.assertEquals("الأساسية", LP.getPlan2Name());
		Assert.assertEquals("بريميوم", LP.getPlan3Name());
		Assert.assertEquals("1.2 دينار كويتي/شهر", LP.getPlan1PriceCurrencyNameArabic());
		Assert.assertEquals("2.5 دينار كويتي/شهر", LP.getPlan2PriceCurrencyNameArabic());
		Assert.assertEquals("4.8 دينار كويتي/شهر", LP.getPlan3PriceCurrencyNameArabic());
	}

	@AfterClass
	public void afterClass() {
		closeBrowser();

	}

}
