package RahulShettyAcademy.ExtentReportProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

	public ExtentReports extent;
	@BeforeTest
	public void config()
	{
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Rahul Shetty");
	}
@Test
	public void initialDemo()
	{
 ExtentTest test = extent.createTest("Initial Demo");
	System.setProperty("webdriver.chrome.driver","C:/Users/96656/Documents/geetha/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	System.out.println("working on Github project");
	System.out.println("changing the code");
	System.out.println("changes made in gitdemo");
	System.out.println("changes made 2nd time");
	System.out.println("changes made and upload it");
	
	driver.quit();
	test.fail("results do not matcj");
	extent.flush();
	}







}
