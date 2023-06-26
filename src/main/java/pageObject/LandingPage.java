package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {

	public ChromeDriver driver;

	By switchLangBtn = By.id("translation-btn");
	
	By countryBtn = By.xpath("//div[@class = 'country-current']");
	By kwBtn = By.id("kw");
	By bhBtn = By.id("bh");
	By saBtn = By.id("sa");
	By Plan1 = By.xpath("//div[@class='plan-names']//div[1]//strong");
	By Plan2 = By.xpath("//div[@class='plan-names']//div[2]//strong");
	By Plan3 = By.xpath("//div[@class='plan-names']//div[3]//strong");
	By plan1PriceCurrency = By.id("currency-lite");
	By plan2PriceCurrency = By.id("currency-classic");
	By plan3PriceCurrency = By.id("currency-premium");
	By plan1PriceCurrencyArabic = By.id("currency-لايت");
	By plan2PriceCurrencyArabic = By.id("currency-الأساسية");
	By plan3PriceCurrencyArabic = By.id("currency-بريميوم");

	public LandingPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public WebElement getOpenCountryDropdown() {
		return driver.findElement(countryBtn);
	}

	public WebElement getSwitchLangBtn() {
		return driver.findElement(switchLangBtn);
	}

	public WebElement getSaBtn() {
		return driver.findElement(saBtn);
	}

	public WebElement getKwBtn() {
		return driver.findElement(kwBtn);
	}

	public WebElement getBhBtn() {
		return driver.findElement(bhBtn);
	}

	public WebElement getPlan1() {
		return driver.findElement(Plan1);
	}

	public String getPlan1Name() {
		return getPlan1().getText();
	}

	public WebElement getPlan2() {
		return driver.findElement(Plan2);
	}

	public String getPlan2Name() {
		return getPlan2().getText();
	}

	public WebElement getPlan3() {
		return driver.findElement(Plan3);
	}

	public String getPlan3Name() {
		return getPlan3().getText();
	}

	public WebElement getPlan1PriceCurrency() {
		return driver.findElement(plan1PriceCurrency);
	}

	public String getPlan1PriceCurrencyName() {
		return getPlan1PriceCurrency().getText();
	}

	public WebElement getPlan2PriceCurrency() {
		return driver.findElement(plan2PriceCurrency);
	}

	public String getPlan2PriceCurrencyName() {
		return getPlan2PriceCurrency().getText();
	}

	public WebElement getPlan3PriceCurrency() {
		return driver.findElement(plan3PriceCurrency);
	}

	public String getPlan3PriceCurrencyName() {
		return getPlan3PriceCurrency().getText();
	}

	public WebElement getPlan1PriceCurrencyArabic() {
		return driver.findElement(plan1PriceCurrencyArabic);
	}

	public String getPlan1PriceCurrencyNameArabic() {
		return getPlan1PriceCurrencyArabic().getText();
	}

	public WebElement getPlan2PriceCurrencyArabic() {
		return driver.findElement(plan2PriceCurrencyArabic);
	}

	public String getPlan2PriceCurrencyNameArabic() {
		return getPlan2PriceCurrencyArabic().getText();
	}

	public WebElement getPlan3PriceCurrencyArabic() {
		return driver.findElement(plan3PriceCurrencyArabic);
	}

	public String getPlan3PriceCurrencyNameArabic() {
		return getPlan3PriceCurrencyArabic().getText();
	}

}
