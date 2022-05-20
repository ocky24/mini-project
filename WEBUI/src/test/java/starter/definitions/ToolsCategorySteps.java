package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ToolsCategoryPage;

public class ToolsCategorySteps {

    @Steps
    ToolsCategoryPage category;

    @When("user click select category")
    public void userclickselectcategory(){
        category.ClickSelectCategory();
    }

    @And("user click tools category")
    public void userchoosehealtycategory(){
        category.userclickToolsCategory();
    }

    @Then("tools category is displayed")
    public void usersuccessclickcategory(){
        category.successclickcategory();
    }
}
