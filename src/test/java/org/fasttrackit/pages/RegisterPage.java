package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.RandomStringUtils;

public class RegisterPage extends PageObject {
    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "middlename")
    private WebElementFacade middleNameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmPassField;

    @FindBy(css = "input#is_subscribed")
    private WebElementFacade signToNewslaterInput;

    @FindBy(css = "button[title='Register']")
    private WebElementFacade registerButton;

    public void setFirstNameField(String username) {
        typeInto(firstNameField, username);
    }
    public void setMiddleNameField(String middlename) {
        typeInto(middleNameField, middlename);
    }
    public void setLastNameField(String lastname) {
        typeInto(lastNameField, lastname);
    }
    public void setEmailField(String email) {
        typeInto(emailField, email);
    }
    public void setPasswordField(String password) {
        typeInto(passwordField,password );
    }
    public void setConfirmPassField(String confirmPass) {
        typeInto(confirmPassField, confirmPass);
    }
    public void clickSubbscribeImput(){
        clickOn(signToNewslaterInput);
    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }
    public void randomStringGenerator(){
        String random= RandomStringUtils.randomAlphabetic(10)+"@gamil.com";
    }
}