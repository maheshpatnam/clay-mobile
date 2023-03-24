package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
public class SitesPage extends BasePageClass {

    public static final String SEARCH_BTN = "nl.moboa.myclay:id/open_search_button";
    public static final String SEARCH_INPT = "nl.moboa.myclay:id/search_edit_text";
    public static final String SITE0_BTN = "//android.view.ViewGroup[@content-desc=\"site_0\"]";


    @AndroidFindBy(xpath = SITE0_BTN)
    public MobileElement siteButton;

    @AndroidFindBy(id = SEARCH_BTN)
    public MobileElement searchButton;
    @AndroidFindBy(id = SEARCH_INPT)
    public MobileElement searchInput;

    public SitesPage(AndroidDriver driver) {
        super(driver);
    }

    public void openSite(String siteName) {
        androidHelperMethods.changeContext("NATIVE");
        androidHelperMethods.WaitTillVisible(searchButton);
        androidHelperMethods.click(searchButton);
        androidHelperMethods.WaitTillVisible(searchInput);
        androidHelperMethods.enter(searchInput,siteName);
        androidHelperMethods.WaitTillVisible(siteButton);
        androidHelperMethods.click(siteButton);
    }
}
