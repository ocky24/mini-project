package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage register;

    @Given("user on register page")
    public void ontheRegisterPage(){
        register.openPage();
        register.clickArrowIcon();
        register.clickRegisterButtonText();
    }

    @When("user input name")
    public void InputName(){
        register.inputName("Ocky Princella");
    }

    @And("user input email")
    public void inputEmail(){
        register.inputEmail("ockyprincella23@gmail.com");
    }

    @And("user input password")
    public void ValidPassword(){register.inputPassword("123456789000");}

    @And("user click register button")
    public void RegisterButton(){register.clickRegister();}

    @Then("user is redirected to login page")
    public void LoginPage(){
       register.onLoginPage();
    }
}
