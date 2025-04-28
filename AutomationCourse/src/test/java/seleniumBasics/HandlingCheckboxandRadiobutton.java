package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckboxandRadiobutton extends Base
{
	public void handlingCheckboxandRadiobutton()
	{
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
	}
	public void handlingRadiobutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement radio=driver.findElement(By.xpath("//input[@value='blue']"));
		radio.click();
	}

	public static void main(String[] args)
	{

HandlingCheckboxandRadiobutton handle=new HandlingCheckboxandRadiobutton();
handle.initializeBrowser();
handle.handlingCheckboxandRadiobutton();
//handle.handlingRadiobutton();
//handle.driverCloseandQuit();

	}

}
