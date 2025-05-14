package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public WebDriver driver;
public void initializeBrowser()
{
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
