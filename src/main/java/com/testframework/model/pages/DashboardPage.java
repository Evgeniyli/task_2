package com.testframework.model.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.testframework.core.report.TestReporter;
import com.testframework.core.utils.WaitingUtils;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.testframework.model.providers.DataProviders.getValue;

public class DashboardPage extends BasePage<DashboardPage> {
    private static final String PAGE_NAME = "main_page";
    public static final SelenideElement VALUE_YOUR_PRIVACY = $(Selectors.byXpath(getValue(PAGE_NAME, "value_your_privacy_text")));
    private final SelenideElement kickAndBoomTittle = $(Selectors.byXpath(getValue(PAGE_NAME, "kick_and_boom_tittle")));
    private final SelenideElement penaltyDuels = $(Selectors.byXpath(getValue(PAGE_NAME, "penalty_duels")));
    private final SelenideElement freeNoCreditCardRequiredTittle = $(Selectors.byXpath(getValue(PAGE_NAME, "free_no_credit_card_Required_tittle")));
    private final SelenideElement noRegistrationNeededTittle = $(Selectors.byXpath(getValue(PAGE_NAME, "no_registration_needed_tittle")));
    private final SelenideElement noAppPermissionsTittle = $(Selectors.byXpath(getValue(PAGE_NAME, "no_app_permissions_tittle")));
    private final SelenideElement howToPayTittle = $(Selectors.byXpath(getValue(PAGE_NAME, "how_to_pay_tittle")));
    private final SelenideElement joinTheMillionsOfPlayersTittle = $(Selectors.byXpath(getValue(PAGE_NAME, "join_the_millions_of_players_tittle")));
    private final SelenideElement whenToPlayLickAndBoomTittle = $(Selectors.byXpath(getValue(PAGE_NAME, "when_to_play_kick_and_boom_tittle")));
    private final SelenideElement playForFreeButton = $(Selectors.byXpath(getValue(PAGE_NAME, "play_for_free_button")));
    private final SelenideElement aboutUsTittle = $(Selectors.byXpath(getValue(PAGE_NAME, "about_us_tittle")));
    private final SelenideElement acceptAllButton = $(Selectors.byXpath(getValue(PAGE_NAME, "accept_all")));
    private final SelenideElement acceptBtnButton = $(Selectors.byXpath(getValue(PAGE_NAME, "accept-btn")));
    private final SelenideElement reactUnityWebglCanvas1 = $(Selectors.byXpath(getValue(PAGE_NAME, "react-unity-webgl-canvas-1")));
    private final SelenideElement infoModalTitleButton = $(Selectors.byXpath(getValue(PAGE_NAME, "info_modal_title_button")));
    private final SelenideElement termAndConditionsApply = $(Selectors.byXpath(getValue(PAGE_NAME, "term_and_conditions_apply")));
    private final SelenideElement privacyPolicyLink = $(Selectors.byXpath(getValue(PAGE_NAME, "privacy_policy_link")));
    private final SelenideElement cookiesLink = $(Selectors.byXpath(getValue(PAGE_NAME, "cookies_link")));
    private final SelenideElement valueYourPrivacyText2 = $(Selectors.byXpath(getValue(PAGE_NAME, "value_your_privacy_text2")));
    private final SelenideElement closeLink = $(Selectors.byXpath(getValue(PAGE_NAME, "close_link")));

    public DashboardPage() {
        super(VALUE_YOUR_PRIVACY);
    }


    public DashboardPage clickAcceptAllButton() {
        acceptAllButton.shouldBe(Condition.visible).click();
        TestReporter.reportDebugStep("Click the accept all button");
        return this;
    }

    public DashboardPage clickPlayForFreeButton() {
        playForFreeButton.shouldBe(Condition.visible).click();
        TestReporter.reportDebugStep("Click the play For Free button");
        return this;
    }


    public boolean isKickAndBoomTittleExist() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, kickAndBoomTittle, Duration.ofSeconds(3));
        TestReporter.reportDebugStep("Kick And Boom tittle is displayed", titleMenuString);
        return titleMenuString;
    }

    public boolean isPenaltyDuelsTittleExist() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, penaltyDuels, Duration.ofSeconds(3));
        TestReporter.reportDebugStep("Penalty Duels Tittle is displayed", titleMenuString);
        return titleMenuString;
    }

    public boolean isFreeNoCreditCardRequiredTittleExist() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, freeNoCreditCardRequiredTittle, Duration.ofSeconds(3));
        TestReporter.reportDebugStep("Free No Credit Card Required- tittle is displayed");
        return titleMenuString;
    }


    public boolean isNoRegistrationNeededTittleExist() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, noRegistrationNeededTittle, Duration.ofSeconds(3));
        TestReporter.reportDebugStep("No Registration Needed  tittle is displayed");
        return titleMenuString;
    }

    public boolean isNoAppPermissionsTittle() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, noAppPermissionsTittle, Duration.ofSeconds(3));
        TestReporter.reportDebugStep("No App Permissions - tittle is displayed");
        return titleMenuString;
    }

    public boolean isHowToPayTittle() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, howToPayTittle, Duration.ofSeconds(3));
        TestReporter.reportDebugStep("How To Pay tittle is displayed");
        return titleMenuString;
    }

    public boolean isJoinTheMillionsOfPlayersTittle() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, joinTheMillionsOfPlayersTittle, Duration.ofSeconds(3));
        TestReporter.reportDebugStep("Join The Millions Of Players tittle is displayed");
        return titleMenuString;
    }

    public boolean isWhenToPlayLickAndBoomTittle() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, whenToPlayLickAndBoomTittle, Duration.ofSeconds(3));
        TestReporter.reportDebugStep("When To Play Lick And Boom tittle is displayed");
        return titleMenuString;
    }

    public boolean isAboutUsTittle() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, aboutUsTittle, Duration.ofSeconds(3));
        TestReporter.reportDebugStep("About Us Tittle- tittle is displayed");
        return titleMenuString;
    }

    public boolean isValueYourPrivacyTittle() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, valueYourPrivacyText2, Duration.ofSeconds(15));
        TestReporter.reportDebugStep("Value Your Privacy - tittle is displayed");
        return titleMenuString;
    }

    public boolean isReactUnityWebglCanvas1() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, reactUnityWebglCanvas1, Duration.ofSeconds(3));
        TestReporter.reportDebugStep("React Unity Webgl Canvas - tittle is displayed");
        return titleMenuString;
    }

    public void clickAgreeButton() {
        acceptBtnButton.shouldBe(Condition.visible).click();
        TestReporter.reportDebugStep("Click agree button");
    }


    public boolean isInfoModalTitle() {
        var titleMenuString = WaitingUtils.isSelenideElement(Condition.visible, infoModalTitleButton, Duration.ofSeconds(10));
        TestReporter.reportDebugStep("Info Modal - tittle is displayed");
        return titleMenuString;
    }

    public void clickTermOFConditionsLink() {
        termAndConditionsApply.shouldBe(Condition.visible).click();
        TestReporter.reportDebugStep("Term OF Conditions Apply was clicked");
    }

    public void closeLink() {
        closeLink.shouldBe(Condition.visible).click();
        TestReporter.reportDebugStep("Close link was clicked");
    }

    public void clickPrivacyLink() {
        privacyPolicyLink.shouldBe(Condition.visible).click();
        TestReporter.reportDebugStep("Privacy Policy Link was clicked");
    }

    public void clickCookieLink() {
        cookiesLink.shouldBe(Condition.visible).click();
        TestReporter.reportDebugStep("Cookies Link was clicked");
    }
}
