package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailRatingPage;

public class DetailSteps {
    @Steps
    DetailRatingPage detail;


    @Given("User on home page")
    public void  onHomePage(){
        detail.openPage();
        detail.onHomePage();
    }

    @When("user click detail tensi darah elektrik")
    public void clickDetailTensiDarahElektrik(){detail.ClickDetailTensiDarahListrik();}

    @And("user can see detail and rating of product")
    public void usercanseedetailandratingofproduct(){
    }

    @Then("user see detail and rating of product successfully")
    public void userseedetailandratingofproductsuccessfully(){
    }
}
