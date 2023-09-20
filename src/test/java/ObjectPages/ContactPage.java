package ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
    //Define the elements for the Contact page
    //Use @CacheLookup annotation, if required

    //Contact Image
    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/div/div/img")
    @CacheLookup
    WebElement ContactImageLocator;

    //Contact Text

    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/div/div/h1")
    @CacheLookup
    WebElement ContactTextLocator;

    //_____________________________________________________________

    WebDriver driver;

    public ContactPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //Define the methods for performing actions on the elements

    //find ContactImage
    public WebElement findContactImage(){
        return ContactImageLocator;
    }
    //getContactText

    public String getContactText(){
        return ContactTextLocator.getText();
    }

}
