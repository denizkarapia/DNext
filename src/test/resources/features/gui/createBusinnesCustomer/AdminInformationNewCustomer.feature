@VFALFT-22629 @regression @BusinessCustomer
Feature:Admin Information-New Customer Creation

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given User clicks the Admin Information button
    Given User should see the "Admin Information" tab is opened

  @fillingNamesForBusinessAdmin
  Scenario:As a user,I want to enter new-not existing ID number and fill the First Name and Last Name fields into the required fields on Admin Information Page
    And  User  clicks the First Name field and enters the  first name as "Kemal" into the First Name field on Admin Information Page
    And  User  clicks the Last Name field and enters the  first name as "Sunal" into the First Name field on Admin Information Page
    Then User cannot see the red warning background colour after entering the the name into the name field on Admin Information Page

  @fillingEmailsForBusinessAdmin
  Scenario: As a user I want to enter invalid and valid characters based email into email field on Admin Information Page
    Given User clicks email field on  Admin Information Page
    And   User enters "abcgmailcom" on on Admin Information Page
    And   User should see that background is red on on Admin Information Page
    And   User enters "emails@com" on on Admin Information Page
    And   User should see that background is red on on Admin Information Page
    And   User enters "emails@123.c" on on Admin Information Page
    And   User should see that background is red on on Admin Information Page
    Given User enters valid "abc123@gmail.com" in to the email field on  Admin Information Page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Admin Information Page


  @fillingOtherFieldsForBusinessAdmin
  Scenario:As a user I want to fill the gender,birth date ,citizenship, country ,place of birth fields and work phone number into the related fields on Admin Information Page
    Given User Male option from gender on Admin Information Page
    And   User selects of invalid birth date as "15/05/2020" on Admin Information Page
    And   User should see that background is red on on Admin Information Page
    And   User deletes the already entered invalid date of birth on Admin Information Page
    And   User selects of valid birth date as "15/05/2000" on Admin Information Page
    And   User selects the country as Albania as country of birth on Admin Information Page
    And   User selects Berat as place of birth on Admin Information Page
    And   User fills "12345678" the work number into the work phone number on Admin Information Page
    And   User adds "623456789" the Mobile Phone  Number into the Mobile Phone Number on Admin Information Page

  @fillinngNIPTnumberForBusinessAdmin
  Scenario: As a user,I want to enter valid  new - not existing NIPT number into  the Identification Number fiel don Admin Information Page
    And   User clicks on the Identification Number field on Admin Information Page
    When  User enters one non existing valid "A19898589T" ID number into the Identification Number field on Admin Information page
    Then  User should see "Please click search icon!" warning under the Identification Number field on Admin Information Page
    And   User clicks the search icon in Identification Number field on Admin Information page
    Then  User sees the search icon turns into the cancel icon