package seleniumBasics;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class TestngAnotations
{
@Test
	public void testcase()
	{
		
		System.out.println("testcase");//testcase
		
	}
@BeforeMethod
public void beforeMethod()
{
	System.out.println("Before method");
}
@AfterMethod
public void afterMethod()
{
System.out.println("After Method");	
}
@BeforeTest
public void beforetest()
{
System.out.println("Before Test");	
}
@AfterTest
public void afterTest()
{
System.out.println("After Test");	
}
@BeforeClass
public void beforeClass()
{
System.out.println("Before Class");	
}
@AfterClass
public void AfterClass()
{
System.out.println("After Class ");	
}
@BeforeSuite
public void beforeSuite()
{
System.out.println("Before Suite");	
}
@AfterSuite
public void afterSuite()
{
System.out.println("After Suite");	
}

}
