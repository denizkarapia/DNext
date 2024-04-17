package dnext.com.step_definitions.gui.activation;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.AbelActivationPage;
import dnext.com.pages.activationPages.VtvActivationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class AbelActivationStepDefinition extends BasePage {
    AbelActivationPage abelActivationPage;
    VtvActivationPage vtvActivationPage;

    @When("User clicks the New Order for postpaid rating type on Customer{int} search page")
    public void userClicksTheNewOrderForPostpaidRatingTypeOnCustomerSearchPage(int arg0) {
        clickField(vtvActivationPage.newOrderBtnOnPostpaid);
    }

    @When("User selects cash methods as {int} X ALL{int} for Digitalb Premium Plus on Customer{int} search page")
    public void userSelectsCashMethodsAsXALLForDigitalbPremiumPlusOnCustomerSearchPage(int arg0, int arg1, int arg2) {
        clickField(abelActivationPage.contract12XALL2550ForDigitalbPremiumPlus);
    }

    @When("User selects the Abel as TVInfrustructure on Customer360 search page")
    public void user_selects_the_abel_as_tv_infrustructure_on_customer360_search_page() {
        clickField(abelActivationPage.optionAbel);
    }

    @When("User clicks the Smart Card add button on Customer360 search page")
    public void user_clicks_the_smart_card_add_button_on_customer360_search_page() {
        clickField(abelActivationPage.smartCardAddSign);
    }

    @When("User slelects the {int}*ALLO option for Smart Card Contract Duration on Customer360 search page")
    public void user_slelects_the_allo_option_for_smart_card_contract_duration_on_customer360_search_page(Integer int1) {
        clickField(abelActivationPage.contract12XALL0ForSmartCard);
    }

    @When("User selects Akses Fee per Dekoder Basic on Customer360 search page")
    public void user_selects_akses_fee_per_dekoder_basic_on_customer360_search_page() {
        clickField(abelActivationPage.aksesFeePerDekoderBasicAddSign);
    }

    @When("User selects the {int}*ALLO option for Akses Fee per Dekoder Basic Contract Duration on Customer360 search page")
    public void user_selects_the_allo_option_for_akses_fee_per_dekoder_basic_contract_duration_on_customer360_search_page(Integer int1) {
        clickField(abelActivationPage.contract12XALL0ForAksesFeePerDekoderBasic);
    }

    @When("User selects Tarife Instalimi from Purchasable Addons for Abel part on Customer360 search page")
    public void user_selects_tarife_instalimi_from_purchasable_addons_for_abel_part_on_customer360_search_page() {
        clickField(abelActivationPage.addIconForTarifeInstalimi);
    }

    @When("User selects ALL1500 12Month option as cash  method for Tarife Instalimi Contract Duration on Customer360 search page")
    public void user_selects_all1500_12month_option_as_cash_method_for_tarife_instalimi_contract_duration_on_customer360_search_page() {
        clickField(abelActivationPage.contractALL150012MonthForTarifeInstalimi);
    }

    @Then("User sees the name of {string} which was selected product on Abel is in the Shopping Cart on Customer{int} search page")
    public void userSeesTheNameOfWhichWasSelectedProductOnAbelIsInTheShoppingCartOnCustomerSearchPage(String text, int arg1) {
        Utils.waitFor(3);
        warningMessage(text, abelActivationPage.selectedProductInShoppingCart);

    }

    @When("User enters random Abel number to Smart Card field on Product Offering Page")
    public void userEntersRandomAbelNumberToSmartCardFieldOnProductOfferingPage() {
        abelActivationPage.fillAbelSmartCardNumber();
    }

    @And("User clicks the ADD to Cart button on Product Offering Page")
    public void userClicksTheADDToCartButtonOnProductOfferingPage() {
        clickField(abelActivationPage.addToCartBtn);
    }

    @And("User checks the Abel Number is available for Sale on Product Offering Page")
    public void userChecksTheAbelNumberIsAvailableForSaleOnProductOfferingPage() {
        abelActivationPage.checkAbelNumberIsAvailableOrNot();
    }

    @Then("User should see the  Number is available for Sale on Product Offering Page")
    public void userShouldSeeTheAbelNumberIsAvailableForSaleOnProductOfferingPage() {
        abelActivationPage.verifyShoppingCartIsCreated();
    }
}
