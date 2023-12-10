package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.homePage;
import pageObject.registrationPage;

import java.io.IOException;

public class registrationPageTest extends baseClass {

    homePage hp = new homePage(driver);
    registrationPage rp = new registrationPage(driver);

    @Test
    public void custumerRegistration() throws InterruptedException, IOException {
        hp.registrationLinkClick();
        logger.info("Register link clicked");
        Thread.sleep(4000);

        rp.custFirstName("Rakesh");
        Thread.sleep(2000);
        rp.custLastName("Ranjan");
        Thread.sleep(2000);
        rp.fillAddress("Bhickhachak");
        Thread.sleep(2000);
        rp.custCity("Patna");
        Thread.sleep(2000);
        rp.custState("Bihar");
        Thread.sleep(2000);
        rp.custzipCode(randomNum());
        Thread.sleep(2000);
        rp.custPhoneNumber(randomPhNum());
        Thread.sleep(2000);
        rp.custSSN(randomNum());
        Thread.sleep(2000);
        rp.custUserName(setUserName());
        Thread.sleep(2000);
        rp.custCnfPassword("rahul1");
        rp.custCnfPassword("rahul1");
        Thread.sleep(2000);
        rp.clickOnRegisterBtn();
        logger.info("validation started....");

        boolean res=driver.getPageSource().contains("Your account was created successfully. You are now logged in.");

        if(res)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"addNewCustomer");
            Assert.assertTrue(false);
        }


    }
}
