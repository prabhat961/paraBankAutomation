package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
    Properties pro;

    public readConfig(){
        File src = new File("./Configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        }
        catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }
    public String getApplicationURL()
    {
        return pro.getProperty("baseURL");
    }
    public String getChromePath()
    {
        return pro.getProperty("chromepath");
    }

    public String getFirefoxPath()
    {
        return pro.getProperty("firefoxpath");
    }

    public String getCFTPath(){
        return pro.getProperty("CFTPath");
    }
}
