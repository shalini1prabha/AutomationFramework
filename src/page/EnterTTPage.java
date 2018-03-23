package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class EnterTTPage extends BasePage{
	@FindBy(xpath="//div[contains(text(),'Help']")
	private WebElement help;
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutAT;
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(xpath="//span[@class='productVersion']")
	private WebElement version;
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closeBTN;
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	public EnterTTPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	public void clickHelp() {
		help.click();
	}
	public void clickAboutActiTIME() {
		aboutAT.click();
	}
	public void verifyVersion(String eText) {
		verifyText(version,eText);
	}
	public void clickCloseButton() {
		closeBTN.click();
	}
	public void clickLogout() {
		logoutLink.click();
	}
	
}











//<tr class="productVersionInfo">
//<td class="infoTitle">
//    Product Version:
//</td>
//<td>
//    <span class="productVersion">actiTIME 2017.3</span><br> <span>(build 38898)</span>
//    <br>
//    
//    Auto-installation package
//    
//</td>
//</tr>