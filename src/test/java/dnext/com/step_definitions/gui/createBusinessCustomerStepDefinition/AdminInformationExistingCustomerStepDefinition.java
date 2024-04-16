package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinessCustomerPages.AdminInformationBusinessPage;
import dnext.com.pages.createBusinessCustomerPages.SearchOrganizationBusinessPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Map;

@AllArgsConstructor
@Log4j2
public class AdminInformationExistingCustomerStepDefinition extends BasePage {
    AdminInformationBusinessPage adminInformationBusinessPage;
    SearchOrganizationBusinessPage searchOrganizationBusinessPage;

    @Given("User clicks the Admin Information button")
    public void userClicksTheAdminInformationButton() {
        Utils.click(adminInformationBusinessPage.adminInformationButton);
    }

    @And("User clicks on the Identification Number field on Admin Information Page")
    public void userClicksOnTheIdentificationNumberField() {
        adminInformationBusinessPage.clickIdentificationNumberField();
    }

    @When("User enters one existing {string} ID number into the Identification Number field on Admin Information page")
    public void user_enters_one_existing_id_number_into_the_identification_number_field_on_admin_information_page(String existingNumber) {
        adminInformationBusinessPage.inputExistingNumberToIdentificationNumberField(existingNumber);
    }

    @Then("User should see {string} warning under the Identification Number field on Admin Information Page")
    public void user_should_see_warning_under_the_identification_number_field(String warningMessage) {
        adminInformationBusinessPage.warningMessageForSearchIcon(warningMessage);
    }

    @Then("User clicks the search icon in Identification Number field on Admin Information page")
    public void user_clicks_the_search_icon_in_identification_number_field_on_admin_information_page() {
        Utils.click(adminInformationBusinessPage.searchIconInIdentificationField);
    }

    @Given("User sees some ID related information were fetched on Admin Information Page")
    public void user_sees_some_id_related_information_were_fetched(Map<String, String> table) {
        elementDisplayed(adminInformationBusinessPage.cancelIconInIdentificationFieldAfterOrganizationSearch);
        adminInformationBusinessPage.verifyFetchedPersonData(table);
    }

    @Then("User should see the {string}warning message  under number field on Admin Information Page")
    public void userShouldSeeTheWarningMessageUnderNumberField(String warningMsg) {
        warningMessage(warningMsg, adminInformationBusinessPage.warningOfMobilePhoneNumber);
    }

    @Given("User should see this {string} warning message near to add button on Admin Information Page")
    public void userShouldSeeThisWarningMessageNearToAddButtonOnAdminInformationPage(String warningMsg) {
        warningMessage(warningMsg, adminInformationBusinessPage.warningOfDocCustomerIdDocument);
    }

    @And("User tries to add {string} of which format is out of image or pdf that connat be uploded on Admin Information Page")
    public void userTriesToAddOfWhichFormatIsOutOfImageOrPdfThatConnatBeUplodedOnAdminInformationPage(String fileName) {
        adminInformationBusinessPage.verifyUploadingFilesWithDifferentFormats(fileName);
    }

    @And("User adds {string}  which are image or pdf  which is bigger than five MB and should see {string} warning on Admin Information Page")
    public void userAddsWhichAreImageOrPdfWhichIsBiggerThanFiveMBAndShouldSeeWarningOnAdminInformationPage(String fileName, String warning) {
        adminInformationBusinessPage.verifyTheUploadedBigger5MbSizeFile(fileName, warning);
    }

    @And("User add {string} document file on Admin Information Page")
    public void userAddAndShouldSeeTheNameOfFileOnTheScreenOnAdminInformationPage(String file) {
        adminInformationBusinessPage.verifyUploadingFilesWithDifferentFormats(file);
    }

    @And("User deletes already added valid pdf documentation Admin Information Page")
    public void userDeletesAlreadyAddedValidPrfDocumentationAdminInformationPage() {
        adminInformationBusinessPage.cancelButton.click();
    }

    @And("User enters {string} on email field  and {string} to the phone number field")
    public void userEntersOnEmailFieldAndTothePhoneNumberField(String email, String number) {
        adminInformationBusinessPage.inputEmailAndMobilePhoneNumberOnAdminInfoPage(email, number);
    }

    @And("User clicks next Button on Admin Information Page")
    public void userClicksNextButtonOnAdminInformationPage() {
        clickField(adminInformationBusinessPage.nextButtonOnAdminInfoPage);
    }

    @And("User enters random email on Business Admin Information page")
    public void userEntersRandomEmailOnBusinessAdminInformationPage() {
        adminInformationBusinessPage.fillEmailWithRandomEmail();
    }

    @And("User enters random mobile phone number on Business Admin Information page")
    public void userEntersRandomMobilePhoneNumberOnBusinessAdminInformationPage() {
        adminInformationBusinessPage.fillPhoneNumberWithRandomNumber();
    }

    @Then("User should see the name of {string} added jpg document on the screen on Admin Information Page")
    public void userShouldSeeTheNameOfAddedJpgDocumentOnTheScreenOnAdminInformationPage(String fileName) {
        adminInformationBusinessPage.verifyUploadedAdminDocument(fileName);
    }
}