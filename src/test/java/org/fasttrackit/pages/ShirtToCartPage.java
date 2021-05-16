package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShirtToCartPage extends PageObject {

    @FindBy(css = "[title='Blue']")
    private WebElementFacade colorOfTheItem;
    @FindBy(css = " [title='XS'] ")
    private WebElementFacade sizeOfTheItem;

    @FindBy(css = "#product_addtocart_form > div.product-shop > div.product-options-bottom >" +
            " div.add-to-cart > div.add-to-cart-buttons > button")
    private WebElementFacade addToCartButton;


    public void clickColorOfItem() {
        clickOn(colorOfTheItem);
    }

    public void clickOnSizeOfItem() {
        clickOn(sizeOfTheItem);
    }

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }
}
