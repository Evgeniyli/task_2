package com.testframework;

import com.testframework.model.constants.Environments;
import com.testframework.model.providers.DataProviders;
import listeners.ApplicationTestListener;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({ApplicationTestListener.class})
public class BaseTest {

    @BeforeSuite(alwaysRun = true)
    public void initEnvironmentsLink() {
        Environments.DASHBOARD_URL = DataProviders.getEnvValue("url", "dashboard_url");
    }
}
