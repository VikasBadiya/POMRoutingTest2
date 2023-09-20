package TestScenarios;

import ObjectPages.AboutPage;
import ObjectPages.ContactPage;
import ObjectPages.HeaderSection;
import ObjectPages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactPageTest {
    WebDriver driver;

    HeaderSection HSPage;
    HomePage HPage;
    AboutPage APage;
    ContactPage CPage;
    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HSPage = new HeaderSection(driver);
        HPage = new HomePage(driver);
        APage = new AboutPage(driver);
        CPage = new ContactPage(driver);

        driver.get("https://qaroutingtest.ccbp.tech/");

    }

    @AfterMethod
    public void TearDown(){
        driver.quit();
    }

    //Test the Contact Page UI
    @Test(priority = 7)
    public void TestContactPageUI(){
        //Navigate to the URL https://qaroutingtest.ccbp.tech/
        //Click the Navbar "Contact" link.
        HSPage.ClickOnContact();
        //Verify if the Contact page image is displayed - use Assertions,
        //If the image is not displayed, print "Contact image is not displayed"
        Assert.assertTrue(CPage.findContactImage().isDisplayed(),"Contact image is not displayed");
        //Verify the Heading text of the Contact page - use Assertions
        //Expected text: Contact
        //If the Heading text does not match the expected text, print "Heading text does not match"
        Assert.assertEquals(CPage.getContactText(),"Contact","Heading text does not match");
        //Close the browser window.

    }



}
