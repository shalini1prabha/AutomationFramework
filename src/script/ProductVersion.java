package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTTPage;
import page.LoginPage;

public class ProductVersion extends BaseTest {
	@Test(priority = 3)
	public void testProductVersion() {
		String un = Excel.getData(XL_PATH, "ProductVersion", 1, 0);
		String pw = Excel.getData(XL_PATH, "ProductVersion", 1, 1);
		String msg = Excel.getData(XL_PATH, "ProductVersion", 1, 2);
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		EnterTTPage e = new EnterTTPage(driver);
		e.clickHelp();
		e.clickAboutActiTIME();
		e.verifyVersion(msg);
		e.clickCloseButton();
		e.clickLogout();

	}
}
