package dnext.com.pages;

import com.utilities.Driver;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "username")
   public WebElement  usernameField;

    @FindBy(id = "password")
   public WebElement passwordField;

    @FindBy(id = "kc-login")
   public WebElement signInBtn;

    @FindBy(className = "kc-social-provider-name")
    public WebElement ConnectWithVodafoneAccountBtn;

    @FindBy(id = "input-error")
    public WebElement invalidUsernameOrPasswordWarning;

    @FindBy(id = "kc-header-wrapper")
    public WebElement HeaderSignOfDnext;

    @FindBy(id = "kc-page-title")
    public WebElement pageTitleOfLoginPage;
















}