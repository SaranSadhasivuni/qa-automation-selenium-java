package com.qa.automation.qa_framework.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.automation.qa_framework.utils.ExtentReportManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentTestListener implements ITestListener {
    
    private ExtentReports extent = ExtentReportManager.getExtentReport();
    private ExtentTest test;
    
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Extent Report started...");
    }
    
    @Override
    public void onTestStart(ITestResult result) {
        // Create test in report
        test = extent.createTest(result.getMethod().getMethodName());
    }
    
    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test passed");
    }
    
    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test failed");
        test.log(Status.FAIL, result.getThrowable());
    }
    
    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test skipped");
    }
    
    @Override
    public void onFinish(ITestContext context) {
        // Save report to file
        extent.flush();
        System.out.println("Report saved to: reports/ExtentReport.html");
    }
}