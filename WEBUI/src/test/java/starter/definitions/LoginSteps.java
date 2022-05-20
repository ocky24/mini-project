package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    HomePage home;

    @Steps
    LoginPage login;

    @Given("user on login page")
    public void ontheLoginPage(){
        login.openPage();
        login.clickIconArrow();
        login.userOnLoginPage();
    }
    @When("user input valid email")
    public void ValidEmail(){
        login.inputEmail("ockyprincella09@gmail.com");
    }

    @And("user input valid password")
    public void ValidPassword(){
        login.inputPassword("ayambakarenak");
    }

    @And("click login button")
    public void LoginButton(){
        login.clickButtonLogin();
    }

    @Then("user on the home page")
    public void onHomePage(){
        home.onHomePage();
    }
}
