package DemoApplicationTests;

import DemoApplicationPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001_Login extends TestBase {

    @Test
    public void LoginTest() {
        driver.get(baseURL);
        logger.info("URL is opened");

        LoginPage lPage = new LoginPage(driver);

        lPage.setUserName(userName);
        logger.info("User Name is entered");
        lPage.setPassword(passord);
        logger.info("Password is entered");
        lPage.login();
        logger.info("Login Button is clicked");
        System.out.println(driver.getTitle());

        if(driver.getTitle().equals("GTPL Bank Manager HomePage")){
            Assert.assertTrue(true);
            logger.info("Title is matching");
        } else {
            Assert.assertTrue(false);
            logger.info("Title is not matching");
        }
    }
}
