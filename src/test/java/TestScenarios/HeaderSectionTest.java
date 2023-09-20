package TestScenarios;

import ObjectPages.HeaderSection;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderSectionTest {

    WebDriver driver;

    HeaderSection HSPage;
    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HSPage = new HeaderSection(driver);
        driver.get("https://qaroutingtest.ccbp.tech/");

    }

    @AfterMethod
    public void TearDown(){
        driver.quit();
    }

    //Test the Header section UI

    @Test(priority = 1)
    public void TextHeaderSectionUI(){
        //Navigate to the URL https://qaroutingtest.ccbp.tech/
        //Verify if the page logo is displayed - use Assertions,
        //If the logo is not displayed, print "Page logo is not displayed"

        Assert.assertTrue(HSPage.findLogoImage().isDisplayed(),"Page logo is not displayed");

        //Verify the title of the page - use Assertions
        //Expected text: Wave
        //If the title does not match the expected text, print "Title text does not match"
        //Close the browser window.

        Assert.assertEquals(HSPage.getTitleName(),"Wave","Title text does not match");

    }

    //Test the navigation by clicking the Navbar About link

    @Test(priority = 2)
    public void TestNavigationClickingNavbarAbout(){

        //Navigate to the URL https://qaroutingtest.ccbp.tech/
        //Click the Navbar "About" link.

        HSPage.ClickOnAbout();
        //Verify the navigation to the About page - use Assertions
        //Expected URL: https://qaroutingtest.ccbp.tech/about
        //If the current URL does not match the expected URL, print "URLs do not match"
        //Close the browser window.
        Assert.assertEquals(driver.getCurrentUrl(),"https://qaroutingtest.ccbp.tech/about","URLs do not match");

    }

    //Test the navigation by clicking the Navbar Contact link

    @Test(priority = 3)
    public void TestClickNavbarContact(){
        //Navigate to the URL https://qaroutingtest.ccbp.tech/
        //Click the Navbar "About" link.

        HSPage.ClickOnContact();
        //Verify the navigation to the contact page - use Assertions
        //Expected URL: https://qaroutingtest.ccbp.tech/contact
        //If the current URL does not match the expected URL, print "URLs do not match"
        //Close the browser window.
        Assert.assertEquals(driver.getCurrentUrl(),"https://qaroutingtest.ccbp.tech/contact","URLs do not match");

    }

    //Test the navigation by clicking the Navbar Home link

    @Test(priority = 4)
    public void TestClickNavbarHome(){
        //Navigate to the URL https://qaroutingtest.ccbp.tech/
        //Click the Navbar "About" link.
        HSPage.ClickOnAbout();
        //Click the Navbar "Home" link.
        HSPage.ClickOnHome();
        //Verify the navigation to the home page - use Assertions
        //Expected URL: https://qaroutingtest.ccbp.tech/
        //If the current URL does not match the expected URL, print "URLs do not match"
        Assert.assertEquals(driver.getCurrentUrl(),"https://qaroutingtest.ccbp.tech/","URLs do not match");
        //Close the browser window.

    }







}
