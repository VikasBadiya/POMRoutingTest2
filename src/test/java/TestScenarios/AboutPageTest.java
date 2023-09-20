package TestScenarios;

import ObjectPages.AboutPage;
import ObjectPages.HeaderSection;
import ObjectPages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutPageTest {
    WebDriver driver;

    HeaderSection HSPage;
    HomePage HPage;
    AboutPage APage;
    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HSPage = new HeaderSection(driver);
        HPage = new HomePage(driver);
        APage = new AboutPage(driver);

        driver.get("https://qaroutingtest.ccbp.tech/");

    }

    @AfterMethod
    public void TearDown(){
        driver.quit();
    }

    //Test the About Page UI
    @Test(priority = 6)
    public void TestAboutPageUI(){
        //Navigate to the URL https://qaroutingtest.ccbp.tech/
        //Click the Navbar "About" link.
        HSPage.ClickOnAbout();
        //Verify if the About page image is displayed - use Assertions,
        //If the image is not displayed, print "About image is not displayed"
        Assert.assertTrue(APage.findAboutImage().isDisplayed(),"About image is not displayed");

        //Verify the Heading text of the About page - use Assertions
        //Expected text: About
        //If the Heading text does not match the expected text, print "Heading text does not match"

        Assert.assertEquals(APage.getAboutText(),"About","Heading text does not match");

        //Verify the Description text of the About page - use Assertions
        //Expected text: I love to create! I am a frontend web developer
        //If the Description text does not match the expected text, print "Description text does not match"
        Assert.assertEquals(APage.getAboutDescription(),"I love to create! I am a frontend web developer","Description text does not match");
        //Close the browser window.

    }






}
