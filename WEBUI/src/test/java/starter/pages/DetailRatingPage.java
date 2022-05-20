package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailRatingPage extends PageObject {
    private By onhomePage(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }
    private By clickDetailTensiDarahListrik(){
        return By.xpath("(//span[text()= 'Detail']/parent::button)[1]");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public void onHomePage(){
        $(onhomePage()).isDisplayed();
    }
    @Step
    public void ClickDetailTensiDarahListrik(){
        $(clickDetailTensiDarahListrik()).click();
    }



}
