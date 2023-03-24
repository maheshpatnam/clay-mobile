package Pages;

import actionHelper.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
class BasePageClass {
    protected AndroidDriver androidDriver;
    ReusableMethods androidHelperMethods;
    public BasePageClass(AndroidDriver driver) {
        this.androidDriver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        androidHelperMethods= new ReusableMethods(androidDriver);
    }
}
