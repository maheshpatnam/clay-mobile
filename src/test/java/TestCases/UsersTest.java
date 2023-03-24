package TestCases;

import org.testng.annotations.Test;
import util.utility;
import java.util.Properties;
public class UsersTest extends BaseTest {
    String testDataPath = System.getProperty("user.dir") + "//src//main//resources//testdata.properties";
    Properties properties;

    @Test
    public void createUsers() throws Exception {
        properties = utility.loadProperties(testDataPath);

        String userName = properties.getProperty("username");
        String password = properties.getProperty("password");
        String siteName = properties.getProperty("siteName");
        String siteFirstName = properties.getProperty("siteFirstName");
        String siteLastName = properties.getProperty("sitelastName");
        String siteAlias = properties.getProperty("siteAlias");
        String siteEmailId = properties.getProperty("siteEmailId");

        loginPage.login(userName, password);
        sitesPage.openSite(siteName);
        homePage.clickSkipButton();
        homePage.clickOnPeopleBtn();
        peoplePage.createNewUser(siteFirstName, siteLastName, siteAlias, siteEmailId);
        peoplePage.blockUser(userName);
        homePage.logout();
    }
}
