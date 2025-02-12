package configReader;

import org.apache.log4j.Level;
import utilities.IconfigReader;
import utilities.ResourceHelper;

import java.util.Properties;


public class PropertyFileReader implements IconfigReader {

    private Properties prop = null;

    public PropertyFileReader() {
        prop = new Properties();
        try {
            prop.load(ResourceHelper
                    .getResourcePathInputStream("configfile/"
                            + "config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String getUserName() {
        return prop.getProperty("Username");
    }

    public String getPassword() {
        return prop.getProperty("Password");
    }

    public String getWebsite() {
        return prop.getProperty("Website");
    }

    public int getPageLoadTimeOut() {
        return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
    }

    public int getImplicitWait() {
        return Integer.parseInt(prop.getProperty("ImplcitWait"));
    }

    public int getExplicitWait() {
        return Integer.parseInt(prop.getProperty("ExplicitWait"));
    }

    public String getDbType() {
        return prop.getProperty("DataBase.Type");
    }

    public String getDbConnStr() {
        return prop.getProperty("DtaBase.ConnectionStr");
    }


    public Level getLoggerLevel() {

        switch (prop.getProperty("Logger.Level")) {

            case "DEBUG":
                return Level.DEBUG;
            case "INFO":
                return Level.INFO;
            case "WARN":
                return Level.WARN;
            case "ERROR":
                return Level.ERROR;
            case "FATAL":
                return Level.FATAL;
        }
        return Level.ALL;
    }

}
