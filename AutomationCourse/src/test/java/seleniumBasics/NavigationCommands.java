package seleniumBasics;

public class NavigationCommands extends Base {

	public void verifyNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	public static void main(String[] args) {
		NavigationCommands command=new NavigationCommands();
		command.initializeBrowser();
		command.verifyNavigationCommands();
		command.driverCloseandQuit();
	
	}

}
