package ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
    //Define the elements for the About page
    //Use @CacheLookup annotation, if required

    //About Image
    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/div/div/img")
    @CacheLookup
    WebElement AboutImageLocator;

    //About Text

    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/div/div/h1")
    @CacheLookup
    WebElement AboutTextLocator;


    //About Description

    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/div/div/p")
    @CacheLookup
    WebElement AboutDescriptionLocator;

    //________________________________________________________________
    WebDriver driver;


    public AboutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Define the methods for performing actions on the elements

    //find About Image

    public WebElement findAboutImage(){
        return AboutImageLocator;
    }

    //getAboutText
    public String getAboutText(){
        return AboutTextLocator.getText();
    }

    //get About Description

    public String getAboutDescription(){
        return AboutDescriptionLocator.getText();
    }
}
