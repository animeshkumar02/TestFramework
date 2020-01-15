package DemoApplicationTests;

import Utils.ReadConfig;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.logging.Logger;

public class TestBase {
    ReadConfig readConfig = new ReadConfig();

    public String baseURL = readConfig.getBaseURL();
    public String userName = readConfig.getUserName();
    public String passord = readConfig.getPassword();
    public static WebDriver driver;
    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br) throws IOException {
        logger = Logger.getLogger("eBanking");
        PropertyConfigurator.configure("log4j.properties");

        if(br.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
            driver = new ChromeDriver();
        } else if (br.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxPath());
            driver = new FirefoxDriver();
        } else {
            System.out.println("Incorrect Browser Name");
        }



    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
