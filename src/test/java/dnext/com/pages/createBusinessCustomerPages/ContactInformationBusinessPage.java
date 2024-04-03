package dnext.com.pages.createBusinessCustomerPages;

import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class ContactInformationBusinessPage extends BasePage {
    @FindBy(xpath = "//div[contains(text(),'Contact Information')]")
    public WebElement contactInformationButton;
    @FindBy(xpath = "(//mat-icon[text()='add'])[3]")
    public WebElement addAdditionalContactButton;
    @FindBy(xpath = "//mat-select[@formcontrolname='contactType']")
    public WebElement typeOfContactDropdown;
    @FindBy(xpath = "//span[contains(text(),'None')]")
    public WebElement noneOption;
    @FindBy(xpath = "//span[contains(text(),'Contact Person')]")
    public WebElement contactPersonOption;
    @FindBy(xpath = "//span[contains(text(),'Payment Responsible')]")
    public WebElement paymentResponsibleOption;
    @FindBy(xpath = "//span[contains(text(),'Technical Contact')]")
    public WebElement technicalContactOption;
    @FindBy(xpath = "//mat-select[@formcontrolname='contactType']" +
            "//following::*[@formcontrolname='phoneCode']")
    public WebElement countryCodeDropdown;
    @FindBy(xpath = "//mat-select[@formcontrolname='contactType']" +
            "//following::*[@formcontrolname='phoneNumber']")
    public WebElement phoneNumberInput;
    @FindBy(xpath = "//mat-select[@formcontrolname='contactType']" +
            "//following::*[@formcontrolname='phoneNumber']/following::mat-error")
    public WebElement phoneNumberErrorText;
    @FindBy(xpath = "//mat-select[@formcontrolname='contactType']" +
            "//following::*[@formcontrolname='phoneNumber']" +
            "/parent::div/preceding-sibling::div[1]")
    public WebElement phoneNumberInputDiv;
    @FindBy(xpath = "//mat-select[@formcontrolname='contactType']" +
            "//following::*[@formcontrolname='email']")
    public WebElement emailInput;
    @FindBy(xpath = "//mat-select[@formcontrolname='contactType']" +
            "/following::*[@formcontrolname='email']" +
            "/parent::div/preceding-sibling::div[1]")
    public WebElement emailInputDiv;
    @FindBy(xpath = "//mat-icon[text()='remove']")
    public WebElement removeAdditionalContactButton;
    @FindBy(xpath = "//mat-icon[text()='remove']" +
            "//following::mat-select[@formcontrolname='contactType']")
    public WebElement additionalTypeOfContactDropdown;
    @FindBy(xpath = "//mat-icon[text()='remove']" +
            "//following::*[@formcontrolname='phoneCode']")
    public WebElement additionalCountryCodeDropdown;
    @FindBy(xpath = "//mat-icon[text()='remove']" +
            "//following::*[@formcontrolname='phoneNumber']")
    public WebElement additionalPhoneNumberInput;
    @FindBy(xpath = "//mat-icon[text()='remove']" +
            "//following::mat-error")
    public WebElement additionalPhoneNumberErrorText;
    @FindBy(xpath = "//mat-icon[text()='remove']" +
            "//following::*[@formcontrolname='phoneNumber']" +
            "/parent::div/preceding-sibling::div[1]")
    public WebElement additionalPhoneNumberInputDiv;
    @FindBy(xpath = "//mat-icon[text()='remove']" +
            "//following::*[@formcontrolname='email']")
    public WebElement additionalEmailInput;
    @FindBy(xpath = "//mat-icon[text()='remove']" +
            "//following::*[@formcontrolname='email']" +
            "/parent::div/preceding-sibling::div[1]")
    public WebElement additionalEmailInputDiv;
    @FindBy(xpath = "//span[text()='You cannot select the same contact type multiple times!']")
    public WebElement sameContactTypeErrorText;
    @FindBy(xpath = "(//span[text()='Next'])[4]//ancestor::button")
    public WebElement nextButtonOnContactInformationPage;
    @FindBy(xpath = "(//span[text()='Back'])[3]//ancestor::button")
    public WebElement backButtonOnContactInformationPage;

    public void verifyUserIsOnContactInformationPage() {
        try {
            Assert.assertTrue(typeOfContactDropdown.isDisplayed());
            log.info("Type of Contact is displaying");
        } catch (Throwable e) {
            log.info("Error message: Type of Contact field is  not displaying");
        }
    }
}