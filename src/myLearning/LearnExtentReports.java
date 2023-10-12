package myLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReports {

	ExtentReports extent;
	
	@BeforeTest
	public void GenerateExtentReport() {
		String path =System.getProperty("user.dir")+"//Reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Grocery Mart Automation");
		reporter.config().setDocumentTitle("Test Results");
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester Name", "Sugesh");
		extent.setSystemInfo("Environment", "QA");
		
	}
	
	@Test
	public void SimpleTest() {
		extent.createTest("SimpleTest");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		driver.quit();
		extent.flush();
	}
	
	
	@Test
	public void FailedTest() {
		ExtentTest test = extent.createTest("FailedTest");
		test.fail("My failed test case");
		test.log(Status.FAIL, "Failing it deliberately");
		extent.flush();
		
	}
}
