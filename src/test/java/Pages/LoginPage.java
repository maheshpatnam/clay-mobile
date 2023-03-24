package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageClass {

    public static final String CONTINUE_BTN = "nl.moboa.myclay:id/button";
    public static final String ALLOW_BTN = "com.android.permissioncontroller:id/permission_allow_button";
    public static final String USERNAME_INPT = "nl.moboa.myclay:id/input";
    public static final String PASSWORD_INPT = "//input[@name=\"password\"]";
    public static final String LOGIN_BTN = "//button[@name=\"SubmitButton\"]";


    @AndroidFindBy(id = CONTINUE_BTN)
    MobileElement continue_Btn;
    @AndroidFindBy(id = USERNAME_INPT)
    MobileElement userName_Input;
    @AndroidFindBy(id = ALLOW_BTN)
    MobileElement allow_Btn;

    @FindBy(xpath = PASSWORD_INPT)
    public WebElement passwordInput;
    @FindBy(xpath = LOGIN_BTN)
    public WebElement loginButton;
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }
    public void clickAllow() {
        androidHelperMethods.WaitTillVisible(allow_Btn);
        androidHelperMethods.click(allow_Btn);
    }

    public void login(String username, String password) throws Exception {

        androidHelperMethods.WaitTillVisible(userName_Input);
        androidHelperMethods.enter(userName_Input, username);
        androidHelperMethods.WaitTillVisible(continue_Btn);
        androidHelperMethods.click(continue_Btn);
        // switching from web to native
        Thread.sleep(3000);
        androidHelperMethods.changeContext("WEBVIEW");
        Thread.sleep(2000);
        androidHelperMethods.WaitTillWebElementVisible(passwordInput);
        androidHelperMethods.enterWebText(passwordInput, password);
        androidHelperMethods.WaitTillWebElementVisible(loginButton);
        androidHelperMethods.webClick(loginButton);
    }
}
