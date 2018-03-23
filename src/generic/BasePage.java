package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {

	public void verifyPageDisplay(WebDriver driver, String eResult) {
		String sETO = AutoUtil.getProperty(IAutoConst.CONFIG_PATH, "ETO");
		long ETO = Long.parseLong(sETO);
		WebDriverWait Wait = new WebDriverWait(driver, ETO);
		try {
			Wait.until(ExpectedConditions.titleIs(eResult));
			Reporter.log("pass:Expected page is displayed", true);
		} catch (Exception e) {
			Reporter.log("fail:Expected page is not displayed", true);
			Assert.fail();
		}
	}

	public void verifyText(WebElement e, String eText) {
		String aText = e.getText();
		Assert.assertEquals(aText, eText);
	}
}
