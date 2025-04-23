package seleniumBasics;

public class BrowserCommands extends Base {
	public void verifyBrowserCommands()
	{
		
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String handleid=driver.getWindowHandle();
		System.out.println(handleid);
		String source=driver.getPageSource();
		System.out.println(source);
		
	}

	public static void main(String[] args)
	
	{
		BrowserCommands browser=new BrowserCommands();
		browser.initializeBrowser();
		browser.verifyBrowserCommands();
		browser.driverCloseandQuit();

	}

}
