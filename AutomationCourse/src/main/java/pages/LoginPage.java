package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
public WebDriver driver;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);//intialize elements
}
@FindBy(id="user-name")private WebElement usernamefield;
@FindBy(id="password")private WebElement passwordfield;
@FindBy(id="login-button")private WebElement login;


public void enterUesrnameOnUserNameField(String username)
{
	usernamefield.sendKeys(username);


}
public void enterPasswordOnPasswordField(String password)
{
	passwordfield.sendKeys(password);


}
public void clickLoginButtonField()
{
	login.click();


}

}
