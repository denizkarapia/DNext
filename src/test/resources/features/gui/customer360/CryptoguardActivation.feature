@VFALFT-22441 @cryptoguard @regression @activation
Feature: Cryptoguard Activation

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page

  Scenario:As a user, I want complete TVT Cryptoguard process successfully  on Customer360 search page
    Then User is on the Customer360 page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    When User clicks the Account tab on Customer360 search page
    When User clicks the New Order for prepaid rating type on Customer360 search page
    Then User is redirected to the  product catalog on Customer360 search page
    When User selects TV option from products on Customer360 search page
    And User clicks the search button under product list on Customer360 search page
    When User selects the Digitalb Premium Plus on Customer360 search page
    Then User is directed to the Digitalb Premium Plus page for details of equipments on Customer360 search page
    When User selects cash methods as ALL7900 3Month on Customer360 search page
    And user clicks the TVInfrusructure dropdown button  Customer360 search page
    And User selects the Cryptoguard  as TVInfrustructure on Customer360 search page
    And User clicks the Smart Card add button for cryptoguard on Customer360 search page
    And User selects the ALL0 3Month option for Smart Card Contract Duration on Customer360 search page
    And User selects Akses Fee per Dekoder Basic add button on Customer360 search page
    And User selects the ALL0 3Month option of Akses Fee per Dekoder Premium as cash option on Customer360 search page
    And User selects Tarife Instalimi from Purchasable Addons for Cryptoguard part on Customer360 search page
    And User selects ALL4000 3Month option as cash  method on Customer360 search page
    When  User enters random Cryptoguard number to Smart Card field on Product Offering Page
    And   User clicks the ADD to Cart button on Product Offering Page
    And   User checks the Cryptoguard Number is available for Sale on Product Offering Page
    Then  User should see the  Number is available for Sale on Product Offering Page
    When User clicks the Shopping Cart icon on Customer360 search page
    Then User sees the name of "Digitalb Premium Plus" which was selected product on Cryptoguard is in the Shopping Cart on Customer360 search page
    When User clicks the CHECKOUT button on Customer360 search page
    And User clicks the Collected radio button on Customer360 search page
    And User clicks the COMPLATE CHECKOUT button on Customer360 search page
    Then user sees one pop up warning as "Checkout is successfully completed" on Customer360 search page
    And User clicks the create receipt button
    When User clicks the Go Back to Customer360 button on Customer360 search page
    Then User is on the Customer360 page
    And User clicks the Order button on Customer360 search page
    And User sees the Order id of the selected product on Customer360 search page
    And User can control the Order Status of the selected product on Customer360 search page
    And User clicks the Main Page button on Customer360 search page
    When User should be  General part  under  Main page  button on Customer360 search page
    And User clicks Load Tickets button on Customer360 search page
    And User cliks three dots right of opened block on Customer360 search page
    And User clicks Dnext option from the opened dropdown on Customer360 search page
    And User enters "faveo" as Username, "wa7upRlsIpu_" as password  and clicks the login button on FAVEO login page
    And User clicks the Change Status button on FAVEO page
    And User clicks the resolve option from the opened dropdown FAVEO  page
    And User clicks the Proceed button FAVEO  page
    And User should see "Ticket status changed successfully!!" warning on FAVEO page
    And User turns back to Customer Mangement page on Customer360 search page
    And User clicks the Order button on Customer360 search page
    And User compares the AgreementId on Order with AgreementId on Fiscalization Receipts on Customer360 search page
    And User click the detail button
    Given Get Authorization for API
    When Create an endpoint component
      | Type                 | Value                                   | parameters           |
      | endpoint             | getCryptoguard_ForFiscalization         |                      |
      | requestType          | getRequestOfCryptoguardForFiscalization |                      |
      |                      |                                         |                      |
      | fiscalizationBaseURI | fiscalizationBaseURI                    | fiscalizationBaseURI |
    When Send a request
    Then Status code is 200
    And User clicks the Order button on Customer360 search page
    And User clicks Order status button on Customer360 search page
    Then User should see the Order Status  turned to completed  on Customer360 search page










