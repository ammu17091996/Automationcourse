package seleniumBasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base
{
public void handlingLocators()
{
	driver.findElement(By.id("button-one"));
	driver.findElement(By.className("btn btn-primary"));
	driver.findElement(By.tagName("button"));
    driver.findElement(By.name("Obsqura Testing"));
    driver.findElement(By.linkText("Simple Form Demo"));
    driver.findElement(By.partialLinkText("Simple"));
    driver.findElement(By.cssSelector("button[id='button-one']"));
    driver.findElement(By.cssSelector("button[class='btn btn-primary']"));//tag name tagname[attribute=’value’]
driver.findElement(By.xpath("//button[@id='button-two']")); //xpath 
driver.findElement(By.xpath("//input[@id='value-a']"));
driver.findElement(By.xpath("//label[text()='Enter Message']"));//by using the text
driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));//by using the starting text
driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));//using and operator
driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));//using or operator
driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));//parent
driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));//child
driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));//following
driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));//preceeding
driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));//ancestor,parent and grand parents
driver.findElement(By.xpath("//div[@class='card']//descendant::div"));//descendant child and grand childs
}
	public static void main(String[] args) 
	{
HandlingLocators handle=new HandlingLocators();
handle.initializeBrowser();
handle.handlingLocators();
handle.driverCloseandQuit();
	}

}
