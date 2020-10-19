package com.Arif.SelfStudy.Tests;

import com.Arif.SelfStudy.Utilities.BrowserUtils;
import com.Arif.SelfStudy.pages.CalendarEventsPage;
import com.Arif.SelfStudy.pages.DashboardPage;
import com.Arif.SelfStudy.pages.LoginPage;
import org.testng.annotations.Test;

public class Test2 extends TestBase {

    @Test
    public void test2(){

        extentLogger = report.createTest("Test1 verify Dashboard button exists");

        extentLogger.info("login");
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();

        extentLogger.info("navigate to Dashboard Module");
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Marketing","Email Campaigns");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        calendarEventsPage.createEmailCampaign.click();
        BrowserUtils.waitFor(3);

        System.out.println("calendarEventsPage.createEmailText.getText() = " + calendarEventsPage.createEmailText.getText());


    }
}
