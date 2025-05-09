package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestngBase;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestngBase
{
@Test
public void verifyUserCanSuccessfullyLoginWithValidCredentssials() throws IOException
{
	String username=ExcelUtility.readStringData(0, 0, "LoginPage");
	String password=ExcelUtility.readStringData(0, 1, "LoginPage");
LoginPage loginpage=new LoginPage(driver);
loginpage.enterUesrnameOnUserNameField(username);
loginpage.enterPasswordOnPasswordField(password);
loginpage.clickLoginButtonField();

}
@Test
public void verifyUserIsNotAbleToLoginWithValidUsernameInvalidPassword() throws IOException
{
	String username=ExcelUtility.readStringData(1, 0, "LoginPage");
	String password=ExcelUtility.readStringData(1, 1, "LoginPage");
LoginPage loginpage=new LoginPage(driver);
loginpage.enterUesrnameOnUserNameField(username);
loginpage.enterPasswordOnPasswordField(password);
loginpage.clickLoginButtonField();
}
@Test
public void verifyUserIsNotAbleToLoginWithInvalidUsernameValidPassword() throws IOException
{
	String username=ExcelUtility.readStringData(2, 0, "LoginPage");
	String password=ExcelUtility.readStringData(2, 1, "LoginPage");
LoginPage loginpage=new LoginPage(driver);
loginpage.enterUesrnameOnUserNameField(username);
loginpage.enterPasswordOnPasswordField(password);
loginpage.clickLoginButtonField();
}
@Test
public void verifyUserIsNotAbleToLoginWithInvalidUsernameInValidPassword() throws IOException
{
	String username=ExcelUtility.readStringData(3, 0, "LoginPage");
	String password=ExcelUtility.readStringData(3, 1, "LoginPage");
LoginPage loginpage=new LoginPage(driver);
loginpage.enterUesrnameOnUserNameField(username);
loginpage.enterPasswordOnPasswordField(password);
loginpage.clickLoginButtonField();

}
}
