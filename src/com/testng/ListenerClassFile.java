package com.testng;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.Reporter;

public class ListenerClassFile implements ITestListener, ISuiteListener {


	public void onStart(ITestContext context) {
	ITestListener.super.onStart(context);
	Reporter.log("This is Starting Method"+context, true);	}
	
	public void onFinishing (ITestContext context) {
		ITestListener.super.onFinish(context);
		Reporter.log("This is Finishing Method"+context, true);	}


}