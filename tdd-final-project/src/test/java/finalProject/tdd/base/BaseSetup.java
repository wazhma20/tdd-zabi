package finalProject.tdd.base;
import finalProject.tdd.page.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
public class BaseSetup {
    private static final Logger LOGGER = LogManager.getLogger(BaseSetup.class);
    private static WebDriver driver;
    private static Properties properties;
    protected LoginPage porpertes;


    public BaseSetup(){
        try {
            String filePath = System.getProperty("user.dir")
                    +"/src/test/resources/config/application-config.properties";
            LOGGER.info("Configuration File path"+filePath);
            File propertyFile = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(propertyFile);
            properties = new Properties();
            properties.load(fileInputStream);
        }
        catch (IOException ex){
            throw new RuntimeException("Config file not found"+ex.getMessage());
        }

    }
    private String getProperty(String key){
        LOGGER.debug("Retrieving property for key"+key);
        String property = this.properties.getProperty(key);
        LOGGER.debug("property Value");
        return property;
    }
    public void openBrowser(){
        String appUrl = getProperty("ui.url");
        String browserType = getProperty("ui.browser");
        boolean isHeadless = Boolean.parseBoolean(getProperty("ui.isHeadless"));

        switch(browserType){
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                if(isHeadless) chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                if(isHeadless) edgeOptions.addArguments("headless");
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                throw new RuntimeException("Wrong Browser Type");

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(appUrl);
    }
    public void closingBrowser() {
        LOGGER.debug("closing browser");
        if(driver !=null){
            driver.quit();
        }
    }
    public WebDriver getDriver(){
        return driver;
    }
}