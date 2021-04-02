package nameLocator;
import org.openqa.selenium.WebDriver;

import baseFile.DriverSetup;

import org.openqa.selenium.By;

public class NameLocator extends DriverSetup
{
	String fName;  
	static WebDriver driver;  
	
	public static WebDriver setupDriver()
	{
	    /*Invoke the getWebDriver method from the DriverSetup File*/
	    getWebDriver();
	    return driver;
	}
	public String getNameLocator()
	{
       /*Identify the Firstname
	     Get the placeholder value
         Store the placeholder value in the static variable fName.*/
         String fName=driver.findElement(By.name("name")).getAttribute("placeholder");
       return fName;
	}
	
	public static void main(String[] args)
	{
	    NameLocator namLocator=new NameLocator();
	    NameLocator.setupDriver();
	    String name=namLocator.getNameLocator();
	    System.out.println("The name is "+name);
	}

}

