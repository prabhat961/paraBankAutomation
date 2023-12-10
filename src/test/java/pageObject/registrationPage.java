package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationPage {
    WebDriver ldriver;

    public registrationPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//input[@id='customer.firstName']")
    @CacheLookup
    WebElement fNameTextBox;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    @CacheLookup
    WebElement LNameTextBox;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    @CacheLookup
    WebElement addressTextBox;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    @CacheLookup
    WebElement cityTextBox;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    @CacheLookup
    WebElement stateTextBox;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    @CacheLookup
    WebElement zipCodeTextBox;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    @CacheLookup
    WebElement phoneTextBox;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    @CacheLookup
    WebElement SSNTextBox;

    @FindBy(xpath = "//input[@id='customer.username']")
    @CacheLookup
    WebElement userNameTextBox;
    @FindBy(xpath = "//input[@id='customer.password']")
    @CacheLookup
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    @CacheLookup
    WebElement confirmTextBox;

    @FindBy(xpath = "//input[@class='button'and @value='Register']")
    @CacheLookup
    WebElement RegisterBtn;

    public void custFirstName(String fname) {
        fNameTextBox.sendKeys(fname);
    }

    public void custLastName(String LName){
        LNameTextBox.sendKeys(LName);
    }

    public void fillAddress(String add){
        addressTextBox.sendKeys(add);
    }

    public void custCity(String city){
        cityTextBox.sendKeys(city);
    }

    public void custState(String state){
        stateTextBox.sendKeys(state);
    }

    public void custzipCode(String zip){
        zipCodeTextBox.sendKeys(zip);
    }

    public void custPhoneNumber(String phno){
        phoneTextBox.sendKeys(phno);
    }

    public void custSSN(String SSN){
        SSNTextBox.sendKeys(SSN);
    }

    public void custUserName(String UN){
        userNameTextBox.sendKeys(UN);
    }

    public void custPassword(String pwd){
        passwordTextBox.sendKeys(pwd);
    }

    public void custCnfPassword(String  pwd){
        confirmTextBox.sendKeys(pwd);
    }

    public void clickOnRegisterBtn(){
        RegisterBtn.click();
    }
}
