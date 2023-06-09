package DriverManager;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.utility;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class AndroidDriverManager {
    Properties properties;
    private static Map<String, AndroidDriver> mobileDriverPool = new HashMap();
    static DesiredCapabilities capabilities;
    AndroidDriver driver;

    public AndroidDriver getAndroidDriver(String propertyPath) {
        try {
            properties = utility.loadProperties(propertyPath);
            String platformVersion = properties.getProperty("platformVersion");
            String deviceName = properties.getProperty("deviceName");
            String nodeURL = properties.getProperty("nodeURL");
            String appPackage = properties.getProperty("appPackage");
            String appActivity = properties.getProperty("appActivity");
            String platformName = properties.getProperty("platformName");
            String app = properties.getProperty("apkPath");
            String avd = properties.getProperty("avd");
            capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformVersion", platformVersion);
            capabilities.setCapability("deviceName", deviceName);
            capabilities.setCapability("appPackage", appPackage);
            capabilities.setCapability("appActivity", appActivity);
            capabilities.setCapability("platformName", platformName);
            capabilities.setCapability("noReset", false);
            capabilities.setCapability(MobileCapabilityType.UDID, deviceName);
            capabilities.setCapability("autoGrantPermissions", "true");
            capabilities.setCapability("app", System.getProperty("user.dir") + "//src//main//" + app);
            return driver = new AndroidDriver(new URL(nodeURL), capabilities);

        } catch (Exception e) {
            System.out.println("Not able to create Android Driver " + e.getMessage());
        }
        return driver;
    }
}
