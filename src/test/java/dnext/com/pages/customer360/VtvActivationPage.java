package dnext.com.pages.customer360;

import dnext.com.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Month;

public class VtvActivationPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"products\"]/div[2]/div[1]/div[1] ")
    public WebElement customerSearchIcon;
    @FindBy(xpath = "//mat-select[@panelclass=\"dropDown-overlay\"]")
    public WebElement selectSearchTypeBtn;

    @FindBy(xpath = "(//*[text()=' Customer Name '])[2]")
    public WebElement selectSearchTypeWithCostomerName;

    @FindBy(xpath = "//*[@placeholder=\"Type text..\"]")
    public WebElement enterCustomerNamefield;

    @FindBy(xpath = "//*[@class=\"mat-autocomplete-panel custom-mat-autocomplete ng-star-inserted mat-autocomplete-visible\"]")
    public WebElement searchedNameField;

    @FindBy(xpath = "//div[text()='Account']")
    public WebElement accountButton;

    @FindBy(xpath = "(//*[.=' New Order '])[6]")
    public WebElement newOrderBtnOnPrepaid;
    @FindBy(xpath = "//*[.='Products']")
    public WebElement productsText;

    @FindBy(xpath = "//*[.='Digitalb Premium Plus']")
    public WebElement digitalbPremiumPlusText;

    @FindBy(xpath = "//label[@for='mat-checkbox-23-input']//span[@class='mat-checkbox-inner-container']")
    public WebElement tvOptionOnCheckBox;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-shadow mat-flat-button mat-button-base']")
    public WebElement searchBtnForPruductOption;

    @FindBy(xpath = "//*[.=' Digitalb Premium Plus ']")
    public WebElement digitalbPremiumPlusOption;

    @FindBy(xpath = "//*[normalize-space()='ALL7900 3Month']")
    public WebElement paymentOptionALL79003Month;

    @FindBy(xpath = "//*[@id=\"mat-select-value-5\"]")
    public WebElement dropdownForVtvOptions;

    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Vtv']")
    public WebElement optionVtv;

    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[3]")
    public WebElement addIconForAkesFeePerDokoderPremium;

    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL0 3Month']")
    public WebElement all03MonnthsForAkesFeePerDokoderPremium;

    @FindBy(xpath = "//input[@id='CasId']")
    public WebElement cashIdForAkesFeePerDokoderPremium;

    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[3]")
    public WebElement addIconForTarifeInstalimi;

    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL4000 3Month']")
    public WebElement allMonthsOptionForTarifeInstalimi;

    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//*[.='Shopping cart created successfully!']")
    public WebElement shoppingCartCreatedSuccesfullyMessage;

    @FindBy(xpath = "//*[@class='mat-icon notranslate mat-badge mat-badge-warn material-icons mat-icon-no-color mat-badge-overlap mat-badge-above mat-badge-after mat-badge-small']")
    public WebElement shoppingCartIcon;

    @FindBy(xpath = "//h3[.=\"Digitalb Premium Plus \"]")
    public WebElement selectedProductInShoppingCart;
    @FindBy(xpath = "//span[normalize-space()='CHECKOUT']")
    public WebElement checkoutBtn;

    @FindBy(xpath = "//span[@class='mat-checkbox-label']")
    public WebElement collectedTickBeforeCompleteChecekout;

    @FindBy(xpath = "//span[normalize-space()='COMPLETE CHECKOUT']")
    public WebElement completeChecekoutBtn;

    @FindBy(xpath = "//h3[.='Checkout is successfully completed']")
    public WebElement checkoutIsSuccessfullyCompletedMessage;

    @FindBy(xpath = "//span[normalize-space()='Go back to Customer360']")
    public WebElement goBackToCustomer360Btn;
    @FindBy(xpath = "//*[@class=\"mat-tab-label-content\"][.='Order']")
    public WebElement orderButtonOnCustomer360Page;
     @FindBy(xpath = "//*[@id=\"mat-tab-content-0-4\"]/div/app-order-page/mat-drawer-container/mat-drawer-content/div/div/mat-table/mat-row[1]/mat-cell[1]/span")
     public WebElement orderIdField;
     @FindBy(xpath = "//mat-row[1]//mat-cell[2]//span[1]")
     public WebElement orderStatus;

    @FindBy(xpath = "//span[normalize-space()='Load Tickets']")
    public WebElement loadTicketsOnTroubleTickets;

    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='more_vert'])[4]")
    public WebElement threeDotsIconNearLoadTickets;

    @FindBy(xpath = "//*[.='DCase']")
    public WebElement dCaseButton;

//Turn back to page



}
