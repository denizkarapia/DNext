package dnext.com.pages.activationPages;

import com.github.javafaker.Faker;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;
import static dnext.com.pages.camundaPage.HomePageCamunda.*;

@Log4j2
public class VtvActivationPage extends BasePage {
    Faker faker = new Faker();


    @FindBy(xpath = "//input[@id='CasId']")
    public WebElement cashIdForAkesFeePerDokoderPremium;

    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;


    public void casIdFromFaker() {
        sendKeys(cashIdForAkesFeePerDokoderPremium, faker.numerify("############"));
    }

    public void checkVtvNumberIsAvailableOrNot() {
        String successMessageXpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']";
        boolean isNumberAvailable = false;
        do {
            if (Driver.getDriver().findElements(By.xpath(successMessageXpath)).isEmpty()) {
                cashIdForAkesFeePerDokoderPremium.clear();
                casIdFromFaker();
                clickField(addToCartBtn);
            } else {
                isNumberAvailable = true;
            }
        } while (!isNumberAvailable);
    }

}