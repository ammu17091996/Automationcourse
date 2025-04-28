package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base
{
public void handlingDropdown()
{
	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
WebElement java=driver.findElement(By.id("dropdowm-menu-1"));
//java.click();
Select select=new Select(java);
select.selectByIndex(2);
//select.selectByVisibleText("SQL");
//select.selectByValue("c#");
}
	public static void main(String[] args) 
	{
		HandlingDropdown handlingdropdown=new HandlingDropdown();
		handlingdropdown.initializeBrowser();
		handlingdropdown.handlingDropdown();
		//handlingdropdown.driverCloseandQuit();
	}

}
