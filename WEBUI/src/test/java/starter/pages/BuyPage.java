package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class BuyPage extends PageObject {
    private By onhomepage(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }
    private By clickBeliTensiDarahElektrik(){
        return By.xpath("(//span[text()= 'Beli']/parent::button)[1]");
    }
    private By ClickCart(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[1]");
    }
    private By userBuyTensiDarahElektrik(){
        return By.xpath("//button[contains(@class,'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--large primary')]");
    }

    @Step
    public void openPage(){open();}

    @Step
    public void homepage(){$(onhomepage()).isDisplayed();}

    @Step
    public void clickTensiDarahListrik(){$(clickBeliTensiDarahElektrik()).click();}

    @Step
    public void userClickCart(){$(ClickCart()).click();}

    @Step
    public void buyTensiDarahElektrik(){$(userBuyTensiDarahElektrik()).click();}

}
