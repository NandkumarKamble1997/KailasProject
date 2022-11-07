package test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import utility.BaseClass;
import utility.Reports;

@Listeners(utility.Listener.class)
public class SamlpleTest extends BaseClass {
	
	
		ExtentReports report;
		ExtentTest test;
		
		@BeforeMethod
		
		  public void launchBrowser()
		{
			driver=Browser.openBrowser();
		  
		 }
		 
		
		@BeforeTest
		public void configure()
		{
			report=Reports.addReports();
		}
		
		

	@Test
	public void Test1()
	{
		
		test=report.createTest("Test1");
		System.out.println("Test 1 is executed");
	}

	@Test(timeOut = 1000)
	public void Test5() throws InterruptedException
	{
	
		Thread.sleep(2000);
		//LogInPage lp = new LogInPage(driver);
		//lp.clickOnLogIn();
		Object test = report.createTest("Test5");
		System.out.println("Test 3 is executed");
	}

	@Test()
	public void Test3()
	{
		test=report.createTest("Test3");
		System.out.println("Test 3 is executed");
	}
	
	

	
	  @AfterMethod 
	  public void logResult(ITestResult result) {
	  if(result.getStatus()==ITestResult.SUCCESS)
	  { test.log(Status.PASS, result.getTestName());
	  }
	  else if(result.getStatus()==ITestResult.FAILURE) 
	  {
			test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
	  
	  
	   }
         @AfterTest
         public void clearData()
         {
        	 report.flush();
         }

	
		
}
