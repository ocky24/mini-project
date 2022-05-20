package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By nameField(){
        return By.xpath("//label[contains(text(),'Nama Lengkap')]/following-sibling::input");
    }
    private By emailField() {
        return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");
    }

    private By passwordField(){
        return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
    }

    private By IconArrowLogin(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[2]");
    }

    private By RegisterButtonText(){
        return By.xpath("//a[contains(text(),'Register')]");
    }

    private By RegisterIcon(){
        return By.xpath("//button[contains(@class,'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary')]");
    }

    @Step
    public void openPage(){open();}

    @Step
    public void clickArrowIcon(){
        $(IconArrowLogin()).click();
    }
    @Step
    public void onLoginPage(){
        $(RegisterButtonText()).isDisplayed();
    }

    @Step
    public void inputName(String name){
        $(nameField()).type(name);
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickRegister(){$(RegisterIcon()).click();}
    @Step
    public void clickRegisterButtonText(){$(RegisterButtonText()).click();}

}
