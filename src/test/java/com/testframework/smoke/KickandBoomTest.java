package com.testframework.smoke;

import com.testframework.BaseTest;
import com.testframework.model.annotation.BrowserSession;
import com.testframework.model.pages.DashboardPage;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.testframework.model.constants.Environments.*;
import static org.testng.AssertJUnit.assertTrue;

public class KickandBoomTest extends BaseTest {


    @BeforeClass(alwaysRun = true)
    public void setUp() {

    }

    @Test(groups = "test_ui")
    @BrowserSession
    @TmsLink("TC-001" + "TC-021" + "TC-003")
    @Description("Verify Dashboard functionality is working")
    public void testCase_verifyDashboardFunctionalityIsWorking() {
        DashboardPage dashboardPage = new DashboardPage().openWindow(DASHBOARD_URL)
                .waitPageLoading(Duration.ofSeconds(5))
                .clickAcceptAllButton();

        assertTrue(dashboardPage.isKickAndBoomTittleExist());
        assertTrue(dashboardPage.isPenaltyDuelsTittleExist());
        assertTrue(dashboardPage.isFreeNoCreditCardRequiredTittleExist());
        assertTrue(dashboardPage.isNoRegistrationNeededTittleExist());
        assertTrue(dashboardPage.isNoAppPermissionsTittle());
        assertTrue(dashboardPage.isHowToPayTittle());
        assertTrue(dashboardPage.isJoinTheMillionsOfPlayersTittle());
        assertTrue(dashboardPage.isWhenToPlayLickAndBoomTittle());
        assertTrue(dashboardPage.isAboutUsTittle());

        dashboardPage.clickTermOFConditionsLink();
        assertTrue(dashboardPage.isInfoModalTitle());
        dashboardPage.closeLink();

        dashboardPage.clickPrivacyLink();
        assertTrue(dashboardPage.isInfoModalTitle());
        dashboardPage.closeLink();

        dashboardPage.clickCookieLink();
        assertTrue(dashboardPage.isInfoModalTitle());
        dashboardPage.closeLink();

        dashboardPage.clickPlayForFreeButton();
        assertTrue(dashboardPage.isValueYourPrivacyTittle());
        dashboardPage.clickAgreeButton();
        assertTrue(dashboardPage.isReactUnityWebglCanvas1());
    }
}
