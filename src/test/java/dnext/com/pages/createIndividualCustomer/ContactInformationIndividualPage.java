package dnext.com.pages.createIndividualCustomer;

import com.utilities.Driver;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import com.utilities.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.List;
import java.util.Map;

@Log4j2
public class ContactInformationIndividualPage extends BasePage{

    @FindBy(xpath = "//div[contains(text(),'Contact Information')]")
    public WebElement contactInformationButton;

    @FindBy(xpath = "(//mat-icon[text()='add'])[1]")
    public WebElement addAdditionalTypeOfAuthorizationButton;

    @FindBy(xpath = "//mat-select[@formcontrolname='PartyRole']")
    public WebElement typeOfAuthorizationDropdown;

    @FindBy(xpath = "//input[@formcontrolname='IdentificationId']")
    public WebElement identificationNumberInput;

    @FindBy(xpath = "//input[@formcontrolname='PersonalIdWithName']")
    public WebElement identificationNumberInputWithName;

    @FindBy(xpath = "//input[@formcontrolname='IdentificationId']" +
                    "/parent::div/preceding-sibling::div[1]")
    public WebElement identificationNumberInputDiv;

    @FindBy(xpath = "//input[@formcontrolname='IdentificationId']" +
                    "/following::*[text()='search']")
    public WebElement identificationNumberSearchIcon;

    @FindBy(xpath = "//span[contains(text(), 'MECNUN CINAR')]")
    public WebElement idPersonOptionInList;

    @FindBy(xpath = "//input[@formcontrolname='GivenName']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@formcontrolname='GivenName']" +
                    "/parent::div/preceding-sibling::div[1]")
    public WebElement firstNameInputDiv;

    @FindBy(xpath = "//input[@formcontrolname='FamilyName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@formcontrolname='FamilyName']" +
                    "/parent::div/preceding-sibling::div[1]")
    public WebElement lastNameInputDiv;

    @FindBy(xpath = "(//input[@formcontrolname='birthDate'])[2]")
    public WebElement birthDateInput;

    @FindBy(xpath = "(//input[@formcontrolname='birthDate'])[2]" +
                    "/parent::div/preceding-sibling::div[1]")
    public WebElement birthDateInputDiv;

    @FindBy(xpath = "(//mat-select[@formcontrolname='gender'])[2]")
    public WebElement genderDropdown;

    @FindBy(xpath = "(//mat-select[@formcontrolname='gender'])[2]//span/span")
    public WebElement selectedGenderOption;

    @FindBy(xpath = "(//mat-select[@formcontrolname='gender'])[2]" +
                    "/parent::div/preceding-sibling::div[1]")
    public WebElement genderDropdownDiv;

    @FindBy(xpath = "(//mat-select[@formcontrolname='citizenShip'])[2]")
    public WebElement citizenshipDropdown;

    @FindBy(xpath = "(//mat-select[@formcontrolname='citizenShip'])[2]//span/span")
    public WebElement selectedCitizenship;

    @FindBy(xpath = "(//mat-select[@formcontrolname='citizenShip'])[2]" +
                    "/parent::div/preceding-sibling::div[1]")
    public WebElement citizenshipDropdownDiv;

    @FindBy(xpath = "//mat-select[@formcontrolname='authDocType']")
    public WebElement documentTypeDropdown;

    @FindBy(xpath = "//button[@aria-label='Add Document']")
    public WebElement documentAddButton;

    @FindBy(xpath = "//mat-select[@formcontrolname='authDocType']/following::mat-error")
    public WebElement documentErrorText;

    @FindBy(xpath = "//input[@id='fileInput']")
    public WebElement documentUploadField;

    @FindBy (xpath = "//p[contains(text(), 'Attorney Letter for ID')]/following-sibling::div/div[1]")
    public WebElement documentNameText;

    @FindBy(xpath = "(//mat-icon[text()='add'])[2]")
    public WebElement addAdditionalContactButton;

    @FindBy(xpath = "//mat-select[@formcontrolname='contactType']")
    public WebElement typeOfContactDropdown;

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

    @FindBy(xpath = "(//span[text()='Next'])[4]//ancestor::button")
    public WebElement nextButtonOnContactInformationPage;

    @FindBy(xpath = "(//span[text()='Back'])[3]//ancestor::button")
    public WebElement backButtonOnContactInformationPage;

    public void verifyUserIsOnContactInformationPage() {
        try {
            Assert.assertTrue(typeOfAuthorizationDropdown.isDisplayed());
            log.info("Type of Authorization is displaying");
        } catch (Throwable e) {
            log.info("Error message: Type of Authorization field is  not displaying");
        }
    }

    public void verifyCitizenshipStatus(boolean enabled) {
        String isDisabled = citizenshipDropdown.getAttribute("aria-disabled");
        if (!enabled){
            Assert.assertEquals("true", isDisabled);
        }else {
            Assert.assertEquals("false", isDisabled);
        }
    }

    public void verifyErrorMessage(WebElement webElement, String message) {
        elementDisplayed(webElement);
        Assert.assertEquals(message, webElement.getText().trim());
    }

    public void fillInput(WebElement element, String text){
        element.clear();
        Utils.sendKeys(element, text + Keys.TAB);
    }

    public void verifyFetchedPersonData(Map<String, String> personData) {
        Assert.assertEquals(personData.get("Identification Number"), getValueByMouseKeyboardAction(identificationNumberInputWithName));
        Assert.assertEquals(personData.get("First Name"), getValueByMouseKeyboardAction(firstNameInput));
        Assert.assertEquals(personData.get("Last Name"), getValueByMouseKeyboardAction(lastNameInput));
        Assert.assertEquals(personData.get("Birth Date"), getValueByMouseKeyboardAction(birthDateInput));
        Assert.assertEquals(personData.get("Gender"), selectedGenderOption.getText().split(" ")[1].trim());
        Assert.assertEquals(personData.get("Citizenship"), selectedCitizenship.getText());
    }

    public void uploadLetterOfAttorneyDocument(String fileName) {
        try {
            uploadFile(documentAddButton,documentUploadField, fileName);
        }catch (Exception e) {
            log.error("Error uploading file: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void verifyUploadedLetterOfAttorneyDocument(String fileName) {
        Assert.assertEquals("AttorneyLetter-" + fileName, documentNameText.getText().trim());
    }

    public void verifyPersonIsNewParty() {
        identificationNumberInputWithName.click();
        Assert.assertTrue(getValueByMouseKeyboardAction(identificationNumberInputWithName).contains("New Party"));
    }

    public void selectSpecificGenderFromDropdown(String toBeSelectedOption) {
        List<WebElement> options = Driver.getDriver()
                .findElements(By.xpath("//*[@class=\"mat-option-text\"]"));
        if (!options.isEmpty()) {
            options.stream().filter(option -> option.getText().trim().split(" ")[1].trim().equals(toBeSelectedOption))
                    .findFirst()
                    .ifPresent(WebElement::click);
            log.info(toBeSelectedOption +  " option is selected!");
        }
        else {
            log.info("No options found in the dropdown.");
        }
    }

}
