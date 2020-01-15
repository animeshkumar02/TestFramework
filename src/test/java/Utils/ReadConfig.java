package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties pro;

    public ReadConfig() {
        File src = new File("Configurations/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getBaseURL(){
        String url = pro.getProperty("baseURL");
        return url;
    }

    public String getUserName() {
        String userName = pro.getProperty("userName");
        return userName;
    }

    public String getPassword() {
        String pass = pro.getProperty("password");
        return pass;
    }

    public String getChromePath() {
        String cPath = pro.getProperty("chromePath");
        return cPath;
    }

    public String getFirefoxPath() {
        String fPath = pro.getProperty("firefoxPath");
        return fPath;
    }
}
