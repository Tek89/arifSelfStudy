package com.Arif.SelfStudy.Tests;

import com.Arif.SelfStudy.pages.CalendarEventsPage;
import com.Arif.SelfStudy.pages.DashboardPage;
import com.Arif.SelfStudy.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends TestBase {

    @Test
    public void testDasboardBtn(){


        extentLogger = report.createTest("Test1 verify Dashboard button exists");

        extentLogger.info("login");
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();

        extentLogger.info("navigate to Dashboard Module");
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Dashboards","Dashboard");

        extentLogger.info("Get Dashboard text");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        System.out.println("calendarEventsPage.DasboardText.getText() = " + calendarEventsPage.DasboardText.getText());

        String expected = "Mashboard";
        String actual = calendarEventsPage.DasboardText.getText();

        extentLogger.pass("Test Passed");

        Assert.assertEquals(actual,expected, "Dashbard text exists");

    }


}
