package finalProject.tdd.page;

import finalProject.tdd.utility.SeleniumUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfilePage extends SeleniumUtilities {
    public static Object CustomerServicePortalPage;



    public UserProfilePage(){
        PageFactory.initElements(getDriver(),this);

    }

    @FindBy(xpath = "//button[@id='profileButton']")
    public static WebElement UserProfilBtn;

    @FindBy(xpath = "//div[@id='profileDrawer']")
    public WebElement profileSideDrawer;

    @FindBy(xpath = "//button[@id='logoutButton']")
    public static WebElement LoginPage;

}
