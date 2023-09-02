package test1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class c2 implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");
	}

	public void onStart(ITestContext context) {
		System.out.println("Test started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test finished");
	}
	

}
