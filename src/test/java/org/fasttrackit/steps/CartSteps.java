package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.features.BaseTest;
import org.fasttrackit.pages.*;
import org.junit.Assert;


public class CartSteps extends BaseTest {
private AccountPage accountPage;
private SalePage salePage;
private ShirtToCartPage shirtToCartPage;


@Step
public void navigateToSale(){
    accountPage.clickSaleLink();
}
@Step
    public void openProductDetails(){
    salePage.clickDetailsButton();
}
@Step
    public void clickRequiredFieldColor(){
    shirtToCartPage.clickColorOfItem();
}
@Step
    public void clickRequiredFieldSize(){
    shirtToCartPage.clickOnSizeOfItem();

}
@Step
    public void addProductToCart(){
    shirtToCartPage.clickAddToCartButton();
}
}
