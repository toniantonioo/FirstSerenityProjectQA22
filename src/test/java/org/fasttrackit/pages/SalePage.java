package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("http://testfasttrackit.info/selenium-test/sale.html")
public class SalePage extends PageObject {


@FindBy(css = "ul .actions .button")
    private WebElementFacade viewDetailsButton;

public void clickDetailsButton(){
    clickOn(viewDetailsButton);
}
}
