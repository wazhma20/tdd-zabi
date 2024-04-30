package finalProject.tdd.page;


import finalProject.tdd.utility.SeleniumUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends SeleniumUtilities {


    public LoginPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='chakra-button css-ez23ye']")
    public static WebElement loginBtn;
    @FindBy(name = "username")
    public static WebElement userName;
    @FindBy(name = "password")
    public static WebElement userPassword;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]")
    public static WebElement signInBtn;
    @FindBy(xpath = "//h2[@class='chakra-heading css-1at26de']")
    public static WebElement customerServicePortalPage;

}
