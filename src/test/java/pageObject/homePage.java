package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static testCase.baseClass.driver;

public class homePage {
    WebDriver ldriver;

    public homePage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//img[@title='ParaBank']")
    @CacheLookup
    WebElement HomePageLogo;

    @FindBy(xpath = "//ul[@class='leftmenu']//a[contains(text(),'About Us')]")
    @CacheLookup
    WebElement aboutUsLogo;

    @FindBy(xpath = "//ul[@class='leftmenu']//a[contains(text(),'Services')]")
    @CacheLookup
    WebElement servicesLogo;

    @FindBy(xpath = "//ul[@class='leftmenu']//a[normalize-space()='Products']")
    @CacheLookup
    WebElement productLogo;

    @FindBy(xpath = "//ul[@class='leftmenu']//a[normalize-space()='Locations']")
    @CacheLookup
    WebElement locationLogo;

    @FindBy(xpath = "//a[normalize-space()='Admin Page']")
    @CacheLookup
    WebElement adminPageLogo;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    @CacheLookup
    WebElement registrationLink;

    public void logoTest(){
        HomePageLogo.isDisplayed();
    }

    public void aboutUsLogoTest(){
        aboutUsLogo.isDisplayed();
    }

    public void servicesogoTest(){
        servicesLogo.isDisplayed();
    }

    public void productlogoTest(){
        productLogo.isDisplayed();
    }

    public void locationLogoTest(){
        locationLogo.isDisplayed();
    }

    public void adminPageLogoTest(){
        adminPageLogo.isDisplayed();
    }

    public void registrationLinkTest(){
        registrationLink.isDisplayed();
    }

    public void registrationLinkClick(){
        registrationLink.click();
    }

    public String titleTest(){
        return driver.getTitle();
    }







}
