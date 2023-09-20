package ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderSection {
    //Define the elements for the Header section
    //Use @CacheLookup annotation, if required

    //AppLogo
    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/nav/div/img")
    @CacheLookup
    WebElement LogoImageLocator;

    //AppTitle
    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/nav/div/h1")
    @CacheLookup
    WebElement TitleLocator;

    //AppHomeNavbar
    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/nav/ul/li[1]/a")
    @CacheLookup
    WebElement HomeNavbarLocator;

    //AppAboutNavbar

    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/nav/ul/li[2]/a")
    @CacheLookup
    WebElement AboutNavbarLocator;

   //AppContactNavbar
   @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/nav/ul/li[3]/a")
   @CacheLookup
   WebElement ContactNavbarLocator;

   //_________________________________________________________________

    WebDriver driver;
    WebDriverWait wait;

    public HeaderSection(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    //find logo image

    public WebElement findLogoImage(){
        return LogoImageLocator;
    }

    //get Title name

    public String getTitleName(){
        return TitleLocator.getText();
    }

    //Click Home Navbar

    public void  ClickOnHome(){
        HomeNavbarLocator.click();
    }

    //Click About Navbar

    public void  ClickOnAbout(){
        AboutNavbarLocator.click();
    }

    //Click Contact Navbar
    public void  ClickOnContact(){
        ContactNavbarLocator.click();
    }




}
