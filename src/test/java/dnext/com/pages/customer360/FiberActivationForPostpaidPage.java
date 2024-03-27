package dnext.com.pages.customer360;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static dnext.com.pages.customer360.FiberActivationForPrepaidPage.*;
import static dnext.com.pages.customer360.VtvActivationPage.addToCartBtn;

@Log4j2
public class FiberActivationForPostpaidPage extends BasePage {
    @FindBy(xpath = "(//span[.=' New Order '])[4]")
    public WebElement newOrderBtnOnPostpaidOnFiber;
    @FindBy(xpath = "//mat-table[@role='table']//mat-row[1]//mat-cell[1]")
     public WebElement vodafoneGigaFibra200MbpsOptionForPostpaid;
    @FindBy(xpath = "//*[@id=\"mat-radio-3\"]")
    public WebElement RecurringProductsOnFiber;
    @FindBy(xpath = "/html/body/app/app-sales-layout/div[2]/div/app-catalog/div/app-catalog-filters/mat-card/app-catalog-filters-category/div[2]/mat-tree/mat-nested-tree-node/div/mat-checkbox/label/span[1]")
    public WebElement internetOptionOnFiberForPostpaid;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL2000']")
    public WebElement contractDurationOf12XALL2000ForVodafoneGigaFibra200Mbps;

    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL0']")
    public WebElement contractDurationOf12XALLForBasicEnterpriseModem;
    @FindBy(xpath = "//h3[.=\"Vodafone GigaFibra 200 Mbps \"]")
    public WebElement selectedProductInShoppingCart;


    public FiberActivationForPostpaidPage numbersCreationForSerialNumbers() {
        String[] numbers =
                {"485754436BCC071F", "485754436BCC7F1F", "485754436BCCBB1F", "485754436BCD5832",
                        "485754436BCDB51F", "485754436BCE691F", "485754436BCE911F", "485754436BCF951F",
                        "485754436BCFBD1F", "485754436BD02B1F", "485754436BD0711F", "485754436BD16B1F",
                        "485754436BD1BB1F", "485754436BD1F71F", "485754436BD2331F", "485754436BD2511F",
                        "485754436BD28D1F", "485754436BD2E71F", "485754436BD44E32", "485754436BD4631F",
                        "485754436BD48B1F", "485754436BD49F1F", "485754436BD55583", "4485754431F02C9A",
                        "448575443A2F0F9B", "4854544351AD279B", "485754430003CE76", "485754430009099A",
                        "4857544300091D76", "485754430009608F", "48575443000F7A76", "485754430037B242",
                        "48575443003A9642", "48575443003DCA42", "48575443003E5660", "48575443003a3242",
                        "48575443003ee242", "485754430047AB9A", "48575443004A878F", "48575443004EF042",
                        "485754430052449A", "485754430055EE42", "485754430057F29A", "485754430058899A",
                        "48575443005D029A", "48575443005E6F60", "48575443005EE042", "48575443005a1242",
                        "48575443005e0442"};
        for (String number : numbers) {
            pPPoEUserInputField.clear();
            oNTSerialNumberInputField.clear();
            pPPoEUserInputField.sendKeys(number);
            pPPoEUserInputField.sendKeys(Keys.RETURN);
            oNTSerialNumberInputField.sendKeys(number);
            oNTSerialNumberInputField.sendKeys(Keys.RETURN);
            addToCartBtn.click();
            Utils.waitFor(2);
            boolean isWarningVisible = false;
            try {
                Utils.waitForVisibility(warningForAlreadyUsedSerialNumber, 15);
                isWarningVisible = true;
            } catch (Exception e) {
                isWarningVisible = false;
            }
            if (isWarningVisible) {
                System.out.println(number + "number has already been used.");
                continue;
            } else {
                System.out.println(number + " number has accepted successfully.");
                break;
            }
        }
        return this;
    }


}
