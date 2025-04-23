package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
public void initializeBrowser()
{
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
}
public void driverCloseandQuit()
{
  driver.close(); //to close the current window
	//driver.quit();//to close multiple windows at a time
}
	public static void main(String[] args) 
	{
Base base=new Base();
base.initializeBrowser();
base.driverCloseandQuit();
	}

}
