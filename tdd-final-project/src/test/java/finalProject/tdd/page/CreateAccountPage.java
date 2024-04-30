package finalProject.tdd.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import finalProject.tdd.utility.SeleniumUtilities;

public class CreateAccountPage extends SeleniumUtilities {
    public CreateAccountPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(xpath = "//h2[@class='chakra-heading css-1jb3vzl']")
    public WebElement createPrimaryAccountHolderTitle;
    @FindBy(name = "email")
    public WebElement userEmail;
    @FindBy(name = "firstName")
    public WebElement firstName;
    @FindBy(id = "gender")
    public WebElement userGender;
    @FindBy(name = "employmentStatus")
    public WebElement employmentStatus;
    @FindBy(id = "title")
    public WebElement userTitle;
    @FindBy(name = "lastName")
    public WebElement userLastName;
    @FindBy(id = "maritalStatus")
    public WebElement maritalStatus;
    @FindBy(name = "dateOfBirth")
    public WebElement dateOfBirth;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]")
    public WebElement createAccountBtn;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/h2[1]")
    public WebElement SignUpYourAccountPage;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/h2[3]")
    public WebElement validateEmailAddressAsExpected;
    @FindBy(xpath = "//div[@class='chakra-alert banner-error css-1ykemat']")
    public WebElement emailErrorMessage;
}
