package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTTPage;
import page.LoginPage;

public class ValidLogin extends BaseTest {
	@Test(priority = 1)
	public void testLValidlogin() {
		String un = Excel.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw = Excel.getData(XL_PATH, "ValidLogin", 1, 1);
		String eTitle = Excel.getData(XL_PATH, "ValidLogin", 1, 2);
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		EnterTTPage e = new EnterTTPage(driver);
		e.verifyPageDisplay(driver, eTitle);
	}

}
