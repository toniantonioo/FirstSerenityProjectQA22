package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;
    @Step
    public void navigateToRegister(){
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }
    @Step
    public void enterDataText(String firstName, String middleName,String lastName,
                              String email, String pass, String confirmPass){
        registerPage.setFirstNameField(firstName);
        registerPage.setMiddleNameField(middleName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailField(email);
        registerPage.setPasswordField(pass);
        registerPage.setConfirmPassField(confirmPass);
    }
    @Step
    public void clikSubscribeImput(){
        registerPage.clickSubbscribeImput();
    }
    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }
    @Step
    public void checkRegisterMesage(String mesage){
        accountPage.verifyRegistrMessage(mesage);

    }
}
