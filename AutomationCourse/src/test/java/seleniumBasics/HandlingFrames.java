package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class HandlingFrames extends Base
{
public void handlingFrames()
{
	driver.navigate().to("https://demoqa.com/frames");
	List<WebElement> iframe=driver.findElements(By.tagName("iframe"));
	int totalframe=iframe.size();
	System.out.println(totalframe);
	WebElement frame1=driver.findElement(By.id("frame1"));
	driver.switchTo().frame(frame1);
	WebElement heading=driver.findElement(By.id("sampleHeading"));
System.out.println(heading.getText());
driver.switchTo().defaultContent();
}
	public static void main(String[] args)
	{
HandlingFrames frame=new HandlingFrames();
frame.initializeBrowser();
frame.handlingFrames();
	}

}
