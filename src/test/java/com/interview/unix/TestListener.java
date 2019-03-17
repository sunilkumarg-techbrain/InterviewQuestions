package src.test.java.com.interview.unix;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {

	protected WebDriver driver;
	
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");
	       System.out.println("Capturing screenshot of failure.");
	       System.out.println("Captured screenshot of failure and embedded in allure report.");

	}

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

}
