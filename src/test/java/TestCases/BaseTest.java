package TestCases;

import DriverManager.DriverManagerType;
import DriverManager.DriverManager;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PeoplePage;
import Pages.SitesPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {


    static WebDriver driver;
    LoginPage loginPage;
    SitesPage sitesPage;
    HomePage homePage;
    PeoplePage peoplePage;

    @BeforeSuite
    public void setUp() {
        try {
            driver = DriverManager.getDriver(DriverManagerType.ANDROID);
            loginPage = new LoginPage((AndroidDriver)driver);
            sitesPage = new SitesPage((AndroidDriver)driver);
            homePage = new HomePage((AndroidDriver)driver);
            peoplePage = new PeoplePage((AndroidDriver)driver);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterSuite
    public void destroyDriver() {
        //  driver.quit();
    }
}