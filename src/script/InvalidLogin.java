package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest {
	@Test(priority=2)
	public void testInvalidlogin() {
		String un=Excel.getData(XL_PATH, "InValidLogin", 1, 0);
		String pw=Excel.getData(XL_PATH, "InValidLogin", 1, 1);
		String msg=Excel.getData(XL_PATH, "InValidLogin", 1, 2);
		
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		l.verifyErrMsg(msg);



	}

}
