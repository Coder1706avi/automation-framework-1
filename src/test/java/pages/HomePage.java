package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utiltities.WaitUtility;


public class HomePage {

    WebDriver driver;
    WaitUtility wait;

    public HomePage(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WaitUtility(driver);
    }

    // Locators using PageFactory
    
    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(xpath = "(//div[@class='_4rR01T'])[1]")
    WebElement firstProduct;

    // Actions
    public void searchProduct(String product) {
        wait.waitForElement(searchBox);
        searchBox.sendKeys(product);
        searchBox.submit();
    }

    public void clickFirstProduct() {
        wait.waitForElement(firstProduct);
        firstProduct.click();
    }
}
