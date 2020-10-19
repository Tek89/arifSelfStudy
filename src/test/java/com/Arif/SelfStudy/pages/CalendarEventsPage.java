package com.Arif.SelfStudy.pages;

import com.Arif.SelfStudy.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath =  "//div[@href='#']" )
    public WebElement optionBtn;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement valueOne;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[1]")
    public WebElement viewsPerPage;

    @FindBy(xpath = ".fa-chevron-right.hide-text")
    public WebElement pageForward;

    @FindBy (css = ".fa-chevron-right.hide-text")
    public WebElement pagesforward;

    @FindBy (xpath = "//tr[@class='grid-row']")
    public List<WebElement> rowSum;

    @FindBy ( xpath = "(//label[@class='dib'])[3]")
    public WebElement record;

    @FindBy (xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1")
    public WebElement DasboardText;

    @FindBy (xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a")
    public WebElement createEmailCampaign;

    @FindBy(xpath = "//*[@id=\"oro_email_campaign-uid-5f7f24ade774f\"]/div[1]/div/div/div[1]/div/h1")
    public WebElement createEmailText;




}