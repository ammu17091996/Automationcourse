package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementsCommands extends Base 
{
public void handlingWebelementsCommands()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	messagebox.sendKeys("hello");//to send or enter values 
	WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
	showmessagebutton.click();//to click button
	WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
	System.out.println(yourmessage.getText());//to get the text from the field
	messagebox.clear();//clearing text
	WebElement entervaluea=driver.findElement(By.id("value-a"));
	System.out.println(entervaluea.getTagName());// to get the tag name
	System.out.println(showmessagebutton.getCssValue("background-color"));//to get css values

}
	public static void main(String[] args) 
	{
WebElementsCommands elements=new WebElementsCommands();
elements.initializeBrowser();
elements.handlingWebelementsCommands();
//elements.driverCloseandQuit();
	}

}
