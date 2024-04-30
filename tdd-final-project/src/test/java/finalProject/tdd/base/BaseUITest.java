package finalProject.tdd.base;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import finalProject.tdd.page.*;
import finalProject.tdd.utility.SeleniumUtilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({ExtentITestListenerAdapter.class})
public class BaseUITest extends SeleniumUtilities {
    public HomePage homePage;
    public CreateAccountPage createAccountPage;
    public LoginPage loginPage;
    public PlanPage planPage;
    public UserProfilePage profilePage;
    public UserProfilePage userProfilePage;
    @BeforeMethod
    public void initiateTestMethod(){
        super.openBrowser();
        homePage = new HomePage();
        createAccountPage = new CreateAccountPage();
        loginPage = new LoginPage();
    }
    @AfterMethod
    public void endTestMethod (ITestResult result) throws InterruptedException {
        // Thread.sleep(20000);
        if(result.getStatus()== ITestResult.FAILURE){
            TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
            String screenShot = takesScreenshot.getScreenshotAs(OutputType.BASE64);
            ExtentTestManager.getTest().fail("Test Failed Taking Screen Shot"
                    , MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot).build());
        }
        super.closingBrowser();
    }
}
