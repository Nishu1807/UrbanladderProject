package com.UrbanLadder.CustomeUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Testcase execution is completed");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
	System.out.println("Testcase started to execute");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Failed Testcase name:"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {

		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
