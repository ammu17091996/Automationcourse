package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base
{
	public void verifyRightclick()
	{
		WebElement homeicon=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions actions=new Actions(driver);
		actions.contextClick(homeicon).build().perform();
		
	}
	public void verifyMouseHover()
	{
		
		WebElement progressbarmenu=driver.findElement(By.xpath("//a[@id='progress-bars']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(progressbarmenu).build().perform();

	}
	public void verifyDragandDrop()
	{
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragme=driver.findElement(By.id("draggable"));
		WebElement drophere=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(dragme, drophere).build().perform();
		
	}
	public void verifyKeyboardAction() throws AWTException
	{
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);//keypress and keyrelese are methods in robot class
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);//virtual key
		robot.keyRelease(KeyEvent.VK_T);
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HandlingActions action=new HandlingActions();
		action.initializeBrowser();
		//action.verifyRightclick();
		//action.verifyMouseHover();
		//action.verifyDragandDrop();
		try {
			action.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//action.driverCloseandQuit();

	}

}
