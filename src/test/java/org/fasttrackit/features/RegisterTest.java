package org.fasttrackit.features;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerTest() {
        registerSteps.navigateToRegister();
        registerSteps.enterDataText("someone", "iUsed", "ToKnow",
                "toni.blhclabla@gamil.com", "1234567" ,"1234567");
        registerSteps.clikSubscribeImput();
        registerSteps.clickRegisterButton();
        registerSteps.checkRegisterMesage("Thank you for registering with Madison Island.");
    }

}
