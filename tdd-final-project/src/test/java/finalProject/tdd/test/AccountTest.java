package finalProject.tdd.test;

import finalProject.tdd.base.BaseUITest;
import finalProject.tdd.page.AccountPage;
import org.testng.annotations.Test;

public class AccountTest extends BaseUITest {

    @Test
    public void clickOnAccountBtn(){
        clickOnElement(AccountPage.creatPrimarAccountBtn);

    }
    @Test
    public void NavigateToCustomerServicePortalWithValidCDRCredentialsAndNavigateToAccountsVerify5RowPageIsDefault(){
        clickOnElement(AccountPage.creatPrimarAccountBtn);
        String expectedAccountRows = "Account Rows";
        String fiveRowPageIsDefault = getElementText(createAccountPage.createAccountBtn);

    }
}
