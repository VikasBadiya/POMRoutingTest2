package ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //Define the elements for the Home page
    //Use @CacheLookup annotation, if required

    //HomeImage
    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/div/div/img")
    @CacheLookup
    WebElement HomeImageLocator;

    //Home Text

    @FindBy(how = How.XPATH,using = "//*[@id='root']/div/div/div/div/h1")
    @CacheLookup
    WebElement HomeTextLocator;

    //_______________________________________________________________

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Define the methods for performing actions on the elements

    //find Home Image
    public WebElement findHomeImage(){
        return HomeImageLocator;
    }
    //getHomeText

    public String getHomeText(){
        return HomeTextLocator.getText();
    }
}
