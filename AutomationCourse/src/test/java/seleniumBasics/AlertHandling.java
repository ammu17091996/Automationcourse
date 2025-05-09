package seleniumBasics;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base
{
public void simpleAlertHandling()
{
driver.navigate().to("https://demoqa.com/alerts");
WebElement simplealert=driver.findElement(By.xpath("//button[@id='alertButton']"));
simplealert.click();
Alert  alert=driver.switchTo().alert();
alert.accept();
}
public void confirmAlert()
{
	driver.navigate().to("https://demoqa.com/alerts");
WebElement confirmalert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
confirmalert.click();
Alert  alert=driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();
}
public void promptAlert()
{
	driver.navigate().to("https://demoqa.com/alerts");
WebElement promptalert=driver.findElement(By.xpath("//button[@id='promtButton']"));
promptalert.click();
Alert  alert=driver.switchTo().alert();
alert.sendKeys("nithya");
alert.accept();
}
	public static void main(String[] args) 
	{
		AlertHandling alertme=new AlertHandling();
		alertme.initializeBrowser();
		//alertme.simpleAlertHandling();
		//alertme.promptAlert();
		alertme.confirmAlert();
		//alertme.driverCloseandQuit();

	}

}
