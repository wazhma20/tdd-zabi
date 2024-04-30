package finalProject.tdd.test;
import finalProject.tdd.base.BaseUITest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateAccountTest extends BaseUITest {


    @Test
    public void clickOnCreateAccountBtn(){
        clickOnElement(homePage.createPrimaryAccountBtn);
    }
    @Test
    public void validateFormTitleAsExpectedInCreateAccountPage() {
        clickOnElement(homePage.createPrimaryAccountBtn);
        String expectedTitle = "Create Primary Account Holder";
        String actualTitle = getElementText(createAccountPage.createPrimaryAccountHolderTitle);
        Assert.assertEquals(actualTitle,expectedTitle,
                "The expected title should be same as the actual title");
    }
    @Test
    public void fillUpTheFormClickOnCreateAccountBtnAndValidateUserNavigatesToSignUpPageAndValidateEmailAsExpected(){
        clickOnElement(homePage.createPrimaryAccountBtn);
        sendText(createAccountPage.userEmail,"Hejaz0984@gmail.com");
        sendText(createAccountPage.firstName,"Hejaz");
        selectFromDropDown(createAccountPage.userGender,"Male");
        sendText(createAccountPage.employmentStatus,"student");
        selectFromDropDown(createAccountPage.userTitle,"Mr.");
        sendText(createAccountPage.userLastName,"Ahmady");
        selectFromDropDown(createAccountPage.maritalStatus,"Single");
        sendText(createAccountPage.dateOfBirth,"01/08/1999");
        clickOnElement(createAccountPage.createAccountBtn);

        boolean isSignUpYourAccountPageDisplayed = isElementDisplayed(createAccountPage.SignUpYourAccountPage);
        Assert.assertTrue(isSignUpYourAccountPageDisplayed);

        String expectedEmail = "Hejaz0984@gmail.com";
        String actualEmail = getElementText(createAccountPage.validateEmailAddressAsExpected);
        Assert.assertEquals(actualEmail,expectedEmail,
                "The expected email should be same as the actual email");
    }
    @Test
    public void createAccountWithExistingEmailAndValidateErrorMessageAzsExpected(){
        clickOnElement(homePage.createPrimaryAccountBtn);
        sendText(createAccountPage.userEmail,"Hejaz0984@gmail.com");
        sendText(createAccountPage.firstName,"Hejaz");
        selectFromDropDown(createAccountPage.userGender,"Male");
        sendText(createAccountPage.employmentStatus,"student");
        selectFromDropDown(createAccountPage.userTitle,"Mr.");
        sendText(createAccountPage.userLastName,"Ahmady");
        selectFromDropDown(createAccountPage.maritalStatus,"Single");
        sendText(createAccountPage.dateOfBirth,"01/08/1999");
        clickOnElement(createAccountPage.createAccountBtn);

        String expectedErrorMessage = "Account with email Hejaz0984@gmail.com is exist";
        String actualErrorMessage = getElementText(createAccountPage.emailErrorMessage);
        String deletedErrorText = actualErrorMessage.replace("ERROR","").trim();
        Assert.assertEquals(deletedErrorText,expectedErrorMessage,
                "The expected error message should be same as actual error message");
    }

}