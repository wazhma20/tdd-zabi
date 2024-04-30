package finalProject.tdd.page;

import finalProject.tdd.utility.SeleniumUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountPage extends SeleniumUtilities {



    public AccountPage(){
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy( )
    public static WebElement creatPrimarAccountBtn;
    @FindBy(id = "accountsTable")
    public WebElement Account;


    @FindBy(id = "showPerPageDropdown")
    public WebElement showPerPageDropdown;


    @FindBy(xpath = "//table[@id='accountsTable']/tbody/tr")
    public List<WebElement> AccountRows;

  
    @FindBy(xpath = "//button[contains(text(),'Next')]")
    public WebElement nextPageButton;

}

