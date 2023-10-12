package myLearning;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class LearnListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		//result.getMethod().getMethodName();
		System.out.println("i am inside on test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I am inside on test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(" I am inside on test failure");
	}



	
	
}
