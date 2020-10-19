package com.Arif.SelfStudy.pages;

import com.Arif.SelfStudy.Utilities.ConfigurationReader;
import com.Arif.SelfStudy.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //driver.findElement(By.id("prependedInput"));
    @FindBy(id = "prependedInput")
    public WebElement usernameInput;


    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;


    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login (String username, String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsStoreManager(){

        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsDriver(){

        String username1 = ConfigurationReader.get("driver_username");
        String password1 = ConfigurationReader.get("driver_password");

        usernameInput.sendKeys(username1);
        passwordInput.sendKeys(password1);
        loginBtn.click();

    }

    public void loginAsSalesManager(){

        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

}