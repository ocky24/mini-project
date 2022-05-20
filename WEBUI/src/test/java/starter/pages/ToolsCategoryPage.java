package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ToolsCategoryPage extends PageObject {
    private By clickselectcategory(){
        return By.xpath("//div[contains(@class, 'v-select__selections')]");
    }
    private By clickToolsCategory(){return By.xpath("(//div[contains(@class, 'v-list-item__title')])[3]");}
    private By successClickCategory(){
        return By.xpath("//div[contains(@class, 'v-select__slot')]");
    }

    @Step
    public void ClickSelectCategory(){
        $(clickselectcategory()).click();
    }
    @Step
    public void userclickToolsCategory(){
        $(clickToolsCategory()).click();
    }
    @Step
    public void successclickcategory(){
        $(successClickCategory()).click();
    }
}
