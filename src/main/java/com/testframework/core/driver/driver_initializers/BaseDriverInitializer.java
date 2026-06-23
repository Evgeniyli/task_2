package com.testframework.core.driver.driver_initializers;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public abstract class BaseDriverInitializer {
    protected ITestResult testResult;

    public BaseDriverInitializer(ITestResult testResult) {
        this.testResult = testResult;
    }

    public abstract WebDriver initDriver();
}
