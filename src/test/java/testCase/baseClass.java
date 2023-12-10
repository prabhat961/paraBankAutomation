package testCase;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.readConfig;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class baseClass {


    readConfig rc = new readConfig();
    public String baseURL = rc.getApplicationURL();


    public static WebDriver driver;
    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br){
        logger = Logger.getLogger("ParaBankAutomation");
        PropertyConfigurator.configure("log4j.properties");

        if (br.equals("chrome")) {
            driver = new ChromeDriver();
        }
        else if (br.equals("Firefox")) {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(baseURL);
        logger.info("URL entered");
    }

    @AfterClass
    public void teerDown() {
        driver.quit();
    }

    public void captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/screenShot/" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }

    public static String randomNum(){
        String generteString = RandomStringUtils.randomNumeric(6);
        return generteString;
    }

    public static String randomPhNum(){
        String generteString2 = RandomStringUtils.randomNumeric(10);
        return generteString2;
    }

    public static String setUserName(){
        String generteString3 = RandomStringUtils.randomAlphanumeric(6);
        return generteString3;
    }

}
