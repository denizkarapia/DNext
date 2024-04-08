@VFALFT-22330 @coaxialForPrepaid @regression
Feature: Verify Coaxial Activation for Prepaid

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page

  Scenario:As a user, I want complete Coaxial Prepaid Activation process successfully  on Customer360 search page
    Then User is on the Customer360 page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KUHN GROUP"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    When User clicks the Account tab on Customer360 search page
    When User clicks the New Order for prepaid rating for the customer type on Customer360 search page
    Then User is redirected to the  product catalog on Customer360 search page
    When User selects Internet option from products for caoxial prepaid on Customer360 search page
    And  User clicks the search button under product list on Customer360 search page
    When User selects the first option from products  on Customer360 search page
    Then User is directed to the Vodafone "GigaFibra Pro 50-20 Mbps" page for details of equipments on Customer360 search page
    And User selects first option as cash method on Customer360 search page
    And User clicks the Infrusructure dropdown button  Customer360 search page
    And User selects the Coaxial as Infrustructure on Customer360 search page
    And User selects Basic Enterprise Modem on Customer360 search page
    And User selects first option from Basic Enterprise Modem for cash on Customer360 search page
    When  User enters random Coaxial Mac number for prepaid to Smart Card field on Product Offering Page
    And   User clicks the ADD to Cart button on Product Offering Page
    And   User checks the  Coaxial Mac Number for prepaid is available for Sale on Product Offering Page
    Then  User should see the  Number is available for Sale on Product Offering Page
    When User clicks the Shopping Cart icon on Customer360 search page
    Then User sees the name of "Basic Enterprise Modem" which was selected product on Fiber is in the Shopping Cart on Customer360 search page
    When User clicks the CHECKOUT button on Customer360 search page
    And User clicks the save button after checkout action on Customer360 search page
    And User clicks the activation form on top of the opened screen on Customer360 search page
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
    And User clicks Order status button on Customer360 search page
    Then User should see the Order Status  turned to completed  on Customer360 search page
    And User turns back to customer main page on Customer360 search page
    And User clicks the Order button on Customer360 search page
    And User compares the AgreementId on Order with AgreementId on Fiscalization Receipts on Customer360 search page
    And User click the detail button
    Given Get Authorization for API
    When Create an endpoint component
      | Type                 | Value                                      | parameters           |
      | endpoint             | getCoaxialPrepaid_ForFiscalization         |                      |
      | requestType          | getRequestOfCoaxialPrepaidForFiscalization |                      |
      |                      |                                            |                      |
      | fiscalizationBaseURI | fiscalizationBaseURI                       | fiscalizationBaseURI |
    When Send a request
    Then Status code is 200




















