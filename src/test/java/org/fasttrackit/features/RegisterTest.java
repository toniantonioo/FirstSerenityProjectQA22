package org.fasttrackit.features;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.steps.RegisterSteps;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerTest() {
        String random= RandomStringUtils.randomAlphabetic(10)+"@gamil.com";
        registerSteps.navigateToRegister();
        registerSteps.enterDataText("someone", "iUsed", "ToKnow",random
                , "1234567" ,"1234567");
        registerSteps.clikSubscribeImput();
        registerSteps.clickRegisterButton();
        registerSteps.checkRegisterMesage("Thank you for registering with Madison Island.");
    }

}
