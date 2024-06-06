package pages;
//basheer
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

                @FindBy(id = "login")
                private WebElement login;

                @FindBy(id = "password")
                private WebElement password;

                @FindBy(className = "button-1")
                private  WebElement clickone;

    public WebElement getClickone() {
        return clickone;
    }

    public void setClickone(WebElement clickone) {
        this.clickone = clickone;
    }

    public LoginPage(WebDriver driver){

                PageFactory.initElements(driver , this);
            }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
        password.clear();
    }

    public WebElement getLogin() {
        return login;
    }

    public void setLogin(WebElement login) {
        this.login = login;
        login.clear();
    }


    public  void enteruserName(String name){
             login.clear();
                login.sendKeys(name);

    }

    public void enterPassword(String pass){

        password.clear();
        password.sendKeys(pass);
    }

    public void clickbuttom(){
        clickone.click();

    }



}
