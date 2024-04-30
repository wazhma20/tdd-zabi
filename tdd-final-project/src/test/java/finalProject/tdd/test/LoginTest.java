package finalProject.tdd.test;
import finalProject.tdd.base.BaseUITest;
import finalProject.tdd.page.LoginPage;
import finalProject.tdd.utility.SeleniumUtilities;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends SeleniumUtilities {


    public static WebElement loginBtn;

    @Test
    public void loginWithValidCredentialAndValidateUserNavigatesToCustomerServicePortalPage(){
        clickOnElement(LoginPage.loginBtn);
        sendText(LoginPage.userName,"supervisor");
        sendText(LoginPage.userPassword,"tek_supervisor");
        clickOnElement(LoginPage.signInBtn);

        boolean isCustomerServicePortalTitleDisplayedAfterLogin = isElementDisplayed(LoginPage.customerServicePortalPage);
        Assert.assertTrue(isCustomerServicePortalTitleDisplayedAfterLogin,
                "User should be taken to customer service portal page after successful login");



    }
}
