package finalProject.tdd.page;
import finalProject.tdd.base.BaseUITest;
import finalProject.tdd.utility.SeleniumUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SeleniumUtilities {

    public WebElement createPrimaryAccountBtn;

    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(xpath= "//a[@class='chakra-button css-1jp0m7c']")
    public WebElement createPrimaryAccountButton;
    @FindBy(xpath = "//h2[@class='chakra-heading css-1at26de']")
    public WebElement tekInsuranceAppTitle;

}
