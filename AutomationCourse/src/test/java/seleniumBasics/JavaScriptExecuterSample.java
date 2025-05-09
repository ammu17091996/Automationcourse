package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterSample extends Base
{
	public void javascriptExecuterSample()
	{
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor javascript=(JavascriptExecutor)driver;//casting by creating reference for the interface
		javascript.executeScript("arguments[0].click();", showmessage);
		javascript.executeScript("window.scrollBy(0,350)", "");
		javascript.executeScript("window.scrollBy(0,-350)", "");
	}

	public static void main(String[] args) 
	{
		JavaScriptExecuterSample sample=new JavaScriptExecuterSample();
		sample.initializeBrowser();
		sample.javascriptExecuterSample();
		//sample.driverCloseandQuit();

	}

}
