package TestScenarios;

import ObjectPages.HeaderSection;
import ObjectPages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
    WebDriver driver;

    HeaderSection HSPage;
    HomePage HPage;
    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HSPage = new HeaderSection(driver);
        HPage = new HomePage(driver);

        driver.get("https://qaroutingtest.ccbp.tech/");

    }

    @AfterMethod
    public void TearDown(){
        driver.quit();
    }

    //Test the Home Page UI
    @Test(priority = 5)
    public void TestHomePageUI(){
        //Navigate to the URL https://qaroutingtest.ccbp.tech/
        //Verify if the Home page image is displayed - use Assertions,
        //If the image is not displayed, print "Home image is not displayed"
        Assert.assertTrue(HPage.findHomeImage().isDisplayed(),"Home image is not displayed");
        //Verify the Heading text of the Home page - use Assertions
        //Expected text: Home
        //If the Heading text does not match the expected text, print "Heading text does not match"
        Assert.assertEquals(HPage.getHomeText(),"Home","Heading text does not match");
        //Close the browser window.

    }



}
