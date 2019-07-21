package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCase FAILED and Details are: "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCase Skipped and Details are: "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCase Stared and Details are: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCase Success and Details are: "+result.getName());
	}
	
	

}
