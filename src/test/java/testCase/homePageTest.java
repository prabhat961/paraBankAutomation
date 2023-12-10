package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.homePage;

import java.io.IOException;

public class homePageTest extends baseClass{
    homePage hp = new homePage(driver);
    @Test(priority = 1)
    public void homePageLogoTest(){
        hp.logoTest();
        Assert.assertTrue(true);
        logger.info("Test Case Passed");
    }

    @Test(priority = 2)
    public  void  homePageTitleTest() throws IOException {
        hp.titleTest();
        if(hp.titleTest().equals("ParaBank | Welcome | Online Banking")){
            Assert.assertTrue(true);
            logger.info("Test case passed");

        }
        else{
            captureScreen(driver,"HomePageTest");
            Assert.assertTrue(false);
            logger.info("Login test failed");

        }
    }




}
