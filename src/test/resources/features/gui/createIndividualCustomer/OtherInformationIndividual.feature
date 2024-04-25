@VFALFT-23463 @regression @IndividualCustomer
Feature:New Individual Customer-Other Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User clicks Create Individual Customer on Home page
    Given User clicks the Other Information button for Individual
    Given User should see the "Other Information" tab is opened

  @backToPreviousPageForIndividualOtherInformation
  Scenario: As a user I want to go previous page on Other Information Page for Individual
    Given User should see the "Other Information" tab is opened
    When  User clicks Back button on Individual Other Information page
    Then  User should see the "Invoice Account" tab is opened

  @checkCheckboxSelectableForIndividualOtherInformation
  Scenario: As a user I want to check the checkbox selectable options on Individual Other Information Page
    Given User should see the "Other Information" tab is opened
    When  User selects the first checkbox about agreement on Individual Other Information Page
    Then  User should see the first checkbox is selected on Individual Other Information Page
    When  User selects the second checkbox about agreement on Individual Other Information Page
    Then  User should see the second checkbox is selected on Individual Other Information Page
    When  User selects the Message checkbox for prefer on Individual Other Information Page
    Then  User should see the Message checkbox is selected on Individual Other Information Page
    When  User selects the Telephone checkbox for prefer on Individual Other Information Page
    Then  User should see the Telephone checkbox is selected on Individual Other Information Page
    When  User selects the Email checkbox for prefer on Individual Other Information Page
    Then  User should see the Email checkbox is selected on Individual Other Information Page
    When  User selects the Post checkbox for prefer on Individual Other Information Page
    Then  User should see the Post checkbox is selected on Individual Other Information Page
    When  User selects the Facebook checkbox for prefer on Individual Other Information Page
    Then  User should see the Facebook checkbox is selected on Individual Other Information Page
    When  User selects the Jo-No checkbox on Individual Other Information Page
    Then  User should see the Jo-No checkbox is selected on Individual Other Information Page
    Then  User should see the Po-Yes checkbox is not selected on Individual Other Information Page
    When  User selects the Po-Yes checkbox on Individual Other Information Page
    Then  User should see the Po-Yes checkbox is selected on Individual Other Information Page
    Then  User should see the Jo-No checkbox is not selected on Individual Other Information Page

  @uploadFormDocumentForIndividualOtherInformation
  Scenario: As a user I want to upload Form Document on Individual Other Information Page
    Given User should see the "Other Information" tab is opened
    When  User clicks the Generate Form button on Individual Other Information Page
    Then  User should see the Generate Form open in a new window on Individual Other Information Page
    When  User go back to Individual Other Information Page
    And   User adds a valid "pdfSample.pdf" document for Consent Form on Individual Other Information Page
    Then  User should see the name of "pdfSample.pdf" added pdf document on Individual Other Information Page

  @checkAutofilledFieldsByCustomerInfoForIndividualOtherInformation
  Scenario:As a user I want to check customer data is fetched to Individual Other Information Page
    When  User clicks the Search Individual button for Individual
    Then  User should see the "Search Individual" tab is opened
    When  User enters "K12365478P" identification ID for ALBANIAN to the identification number field on Create Individual Customer page
    And   User clicks search button on Create Individual Customer page
    And   User checks the identification ID is already exists or not on Search Individual page
    Then  User should see the random identification ID is new for ALBANIAN on Search Individual page
    And   User clicks next Button in Search Individual on Create Individual Customer page
    Then  User should see the "General Information" tab is opened
    When  User wants to enter "KUCUK" as firstname on New Individual Customer page
    And   User wants to enter "PRENS" as lastname into the lastname field on New Individual Customer page
    And   User enters valid "KUCUKPRENS@ABC.COM" in to the email field on New Individual Customer page
    Then  User should see "." and "@" and "KUCUKPRENS@ABC.COM" inside of email structure on New Individual Customer page
    When  User Male option from gender on New Individual Customer page
    And   User selects of valid birth date as "06/07/2005" on New Individual Customer page
    And   User selects the country as Albania as country of birth on New Individual Customer page
    And   User selects Berat as place of birth on New Individual Customer page
    And   User adds "612312312" the Mobile Phone Number into the Mobile Phone Number on New Individual Customer page
    And   User clicks the Other Information button for Individual
    Then  User should see the "Other Information" tab is opened
    When  User clicks the General Information button for Individual
    Then  User should see the "General Information" tab is opened
    Then  User should see the random customer data is fetched to input fields on Individual Other Information Page
    Then  User should see the first checkbox is selected on Individual Other Information Page
    Then  User should see the second checkbox is selected on Individual Other Information Page
    Then  User should see the Message checkbox is selected on Individual Other Information Page
    Then  User should see the Telephone checkbox is selected on Individual Other Information Page
    Then  User should see the Email checkbox is selected on Individual Other Information Page
    Then  User should see the Post checkbox is selected on Individual Other Information Page
    Then  User should see the Facebook checkbox is selected on Individual Other Information Page
    Then  User should see the Po-Yes checkbox is selected on Individual Other Information Page
    Then  User should see the Jo-No checkbox is not selected on Individual Other Information Page