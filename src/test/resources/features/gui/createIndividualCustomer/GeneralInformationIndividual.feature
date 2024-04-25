@VFALFT-18396 @regression @IndividualCustomer
Feature:New Individual Customer - General Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User clicks Create Individual Customer on Home page
    Given User enters "K12345678R" identification ID for ALBANIAN to the identification number field on Create Individual Customer page
    And   User clicks search button on Create Individual Customer page
    And   User clicks next Button in Search Individual on Create Individual Customer page

  Scenario: As a user, I want to check invalid inputs for Firstname and Lastname fields
    Given User wants to enter "1235Ali" as firstname on New Individual Customer page
    Then  User should see that the entered  numbers  are not seen on  firstname field on New Individual Customer page
    And   User wants to enter "Sunal25" as lastname into the lastname field on New Individual Customer page
    Then  User should see that the entered  numbers  are not seen  in the lastname field on New Individual Customer page
    When  User wants to enter "**,#Ali#" as firstname on New Individual Customer page
    Then  User should see that background is red of the firstname picture on New Individual Customer page
    And   User wants to enter "Suna/.%" as lastname into the lastname field on New Individual Customer page
    Then  User should see that background is red of the lastname picture on New Individual Customer page
    When  User wants to enter " Ali" as firstname on New Individual Customer page
    Then  User should see the left space at the beginning of firstname is eliminated on New Individual Customer page
    And   User wants to enter " Sunal" as lastname into the lastname field on New Individual Customer page
    Then  User should see the left space at the beginning of  lastname is eliminated on New Individual Customer page
    When  User wants to enter "Ali  Kemal" as firstname on New Individual Customer page
    Then  User should not be allowed to write more than one spaced firstname nouns into the firstname field on New Individual Customer page
    When  User wants to enter "Komik  Sunal" as lastname into the lastname field on New Individual Customer page
    Then  User should not be allowed to write more than one spaced lastname nouns into the lastname field on New Individual Customer page

  Scenario: As a user, I want to write middle name into the middle name field on New Individual Customer page
    And    User enters "123BILGE" as middle name into the middle name field on New Individual Customer page
    Then   User should see that the entered  numbers  are not seen on middle name field on New Individual Customer page
    When   User enters "*.,BILGE(/" as middle name into the middle name field on New Individual Customer page
    Then   User should see that background is red of middle name  picture on New Individual Customer page
    When   User enters " BILGE" as middle name into the middle name field on New Individual Customer page
    Then   User should see the left space at the beginning of middle name is eliminated on New Individual Customer page

  Scenario: As a user I want to select one option from Segment and Communication dropdowns on New Individual Customer page
    Given User clicks Segment dropdown on New Individual Customer page
    And   User should ensure each options in Segment dropdown are selectable on New Individual Customer page
    Then  User should selects any options in the Segment dropdown on New Individual Customer page
    Given User clicks Communication Method dropdown on New Individual Customer page
    And   User should ensure each options in Communication Method dropdown ara selectable on New Individual Customer page
    Then  User selects random Communication Method on Individual General Information page

  Scenario Outline: As a user I want to enter invalid and valid characters based email into email field on New Individual Customer page
    Given User clicks email field on New Individual Customer page
    And   User enters "<emails>" on New Individual Customer page
    And   User should see that background is red on email field on New Individual Customer page
    Given User enters valid "abc123@gmail.com" in to the email field on New Individual Customer page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on New Individual Customer page

    Examples:
      | emails       |
      | abcgmailcom  |
      | emails@com   |
      | emails@123.c |

  Scenario: As a user I want to fill the gender, birth date, citizenship, country, place of birth fields and work phone number into the related fields on New Individual Customer page
    Given User Male option from gender on New Individual Customer page
    And   User selects of invalid birth date as "15/05/2020" on New Individual Customer page
    And   User should see that background is red on birth date on New Individual Customer page
    And   User deletes the already entered invalid date of birth on New Individual Customer page
    And   User selects of valid birth date as "15/05/2000" on New Individual Customer page
    And   User clicks Citizenship dropdown on Create Individual Customer page
    And   User selects ALBANIAN citizenship from dropdown on Create Individual Customer page
    #And   User adds "623456789" the Mobile Phone Number into the Mobile Phone Number on New Individual Customer page

  Scenario: As a user I want to fill the Country of Birth fields and Place of Birth into the related fields on New Individual Customer page
    And   User selects "ALBANIA" as country of birth on Individual General Information page
    And   User selects random place of birth on Individual General Information page
    #And   User selects the country as Albania as country of birth on New Individual Customer page
    #And   User selects Berat as place of birth on New Individual Customer page
    And   User selects "TURKEY" as country of birth on Individual General Information page
    And   User enters "ISTANBUL" place of birth on Individual General Information page

  Scenario: As a user I want to fill the work phone number into the related fields on New Individual Customer page
    Given  User should see Mobile Phone Number textbox on Individual General Information page
    When  User clicks Country Code dropdown on Individual General Information page
    And   User selects "+355" option in the Country Code dropdown on Individual General Information page
    And   User clicks mobile phone number field on Individual General Information page
    And   User enters random mobile phone number on Individual General Information page
    When  User clicks Country Code dropdown on Individual General Information page
    And   User selects "+90" option in the Country Code dropdown on Individual General Information page
    And   User clicks mobile phone number field on Individual General Information page
    And   User enters random mobile phone number on Individual General Information page