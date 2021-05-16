package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;

    @Test
    public void addToCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
         cartSteps.navigateToSale();
         cartSteps.openProductDetails();
         cartSteps.clickRequiredFieldColor();
         cartSteps.clickRequiredFieldSize();
         cartSteps.addProductToCart();
    }
//    @Test
//    public void addMultipleItemsToCart(){
//        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
//    }
}
