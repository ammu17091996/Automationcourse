package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base
{
public void FileuploadUsingsendkey()
{
	driver.navigate().to("https://demo.guru99.com/test/upload/");
	WebElement fileupload=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
fileupload.sendKeys("C:\\Users\\NITHYA R NAIR\\git\\Automationcourse\\AutomationCourse\\src\\test\\resources\\Seleniumnote.pdf");
		WebElement terms=driver.findElement(By.xpath("//input[@id='terms']"));
	terms.click();
	WebElement submit=driver.findElement(By.xpath("//button[@id='submitbutton']"));
	submit.click();
}
public void fileUploadUsingRobot() throws AWTException
{
	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
	selectpdf.click();
	StringSelection s=new StringSelection("C:\\Users\\NITHYA R NAIR\\git\\Automationcourse\\AutomationCourse\\src\\test\\resources\\Seleniumnote.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	Robot robot=new Robot();
	robot.delay(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
    
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);//two
    
    
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyPress(KeyEvent.VK_ENTER);
    
   
    robot.keyRelease(KeyEvent.VK_ENTER);
}
	public static void main(String[] args)  
	{
		
		HandlingFileUpload upload=new HandlingFileUpload();
		upload.initializeBrowser();
		try {
			upload.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//upload.FileuploadUsingsendkey();
		
		//upload.driverCloseandQuit();
		
	
	}

}
