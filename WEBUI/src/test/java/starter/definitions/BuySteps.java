package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BuyPage;

public class BuySteps {
    @Steps

    BuyPage buy;
    @Given("User on Home page")
    public void onHomePage(){
        buy.openPage();
        buy.homepage();
    }
    @When("user click beli tensi darah elektrik")
    public void clickBeliTensiDarahElektrik(){
        buy.clickTensiDarahListrik();
    }

    @Then("user click cart")
    public void clickCart(){buy.userClickCart();}

    @And("user buy tensi darah elektrik")
    public void userBuyTensiDarahElektrik() {
        buy.buyTensiDarahElektrik();
    }
}


