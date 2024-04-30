package finalProject.tdd.test;

import finalProject.tdd.base.BaseUITest;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlanTest extends BaseUITest {
    @Test
    public void ValidatingLoginAndNavigateToPlanPage() {
        clickOnElement(planPage.planBtn);


        boolean isPlanButtonDisplayedAfterLogin = isElementDisplayed(planPage.planBtn);
        Assert.assertTrue(isPlanButtonDisplayedAfterLogin,
                "User should be taken to plan page after successful login");
    }

}
