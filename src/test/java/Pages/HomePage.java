package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePageClass {

    public static final String SKIP_BTN = "nl.moboa.myclay:id/skip_button";
    public static final String PEOPLE_BTN = "nl.moboa.myclay:id/tab_people";
    public static final String SETTINGS_BTN = "nl.moboa.myclay:id/tab_setting";

    @AndroidFindBy(id = SKIP_BTN)
    public MobileElement skipButton;
    @AndroidFindBy(id = PEOPLE_BTN)
    public MobileElement peopleTabButton;
    @AndroidFindBy(id = SETTINGS_BTN)
    public MobileElement settingsButton;

    public HomePage(AndroidDriver driver) {
        super(driver);
    }



    public void clickSkipButton() {
        androidHelperMethods.WaitTillVisible(skipButton);
        androidHelperMethods.click(skipButton);
    }

    public void clickOnPeopleBtn() {
        androidHelperMethods.WaitTillVisible(peopleTabButton);
        androidHelperMethods.click(peopleTabButton);
    }
    public void logout() {
        androidHelperMethods.WaitTillVisible(settingsButton);
        androidHelperMethods.click(settingsButton);
        androidHelperMethods.clickTextElement();
    }

}
