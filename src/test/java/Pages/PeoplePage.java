package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
public class PeoplePage extends BasePageClass {

    public PeoplePage(AndroidDriver driver) {
        super(driver);
    }
    public static final String ADD_PEOPLE_BTN = "nl.moboa.myclay:id/add_and_invite_iv";
    public static final String CREATE_PEOPLE_BTN = "nl.moboa.myclay:id/arrow_iv";
    public static final String FIRST_NAME_INPT = "nl.moboa.myclay:id/first_name_et";
    public static final String LAST_NAME_INPT = "nl.moboa.myclay:id/last_name_et";
    public static final String ALIAS_INPT = "nl.moboa.myclay:id/alias_et";
    public static final String NEXT_BTN = "nl.moboa.myclay:id/positive_button";
    public static final String EMAIL_ID_INPT = "nl.moboa.myclay:id/email_et";
    public static final String SELECT_ALL_BTN = "nl.moboa.myclay:id/select_groups_tv";
    public static final String PEOPLE_BTN = "nl.moboa.myclay:id/tab_people";
    public static final String FULLNAME_BTN = "nl.moboa.myclay:id/user_fullname";
    public static final String BLOCK_BTN = "nl.moboa.myclay:id/button";
    public static final String SEARCH_BTN = "nl.moboa.myclay:id/open_search_button";
    public static final String SEARCH_PEOPLE_INPUT = "nl.moboa.myclay:id/search_edit_text";
    public static final String BACK_BTN = "nl.moboa.myclay:id/back_button";

    @AndroidFindBy(id = ADD_PEOPLE_BTN)
    public MobileElement addPeopleButton;
    @AndroidFindBy(id = CREATE_PEOPLE_BTN)
    public MobileElement createNewUserButton;
    @AndroidFindBy(id = FIRST_NAME_INPT)
    public MobileElement firstNameInput;
    @AndroidFindBy(id = LAST_NAME_INPT)
    public MobileElement lastNameInput;
    @AndroidFindBy(id = ALIAS_INPT)
    public MobileElement alias;
    @AndroidFindBy(id = NEXT_BTN)
    public MobileElement nextButton;
    @AndroidFindBy(id = EMAIL_ID_INPT)
    public MobileElement emailId;
    @AndroidFindBy(id = SELECT_ALL_BTN)
    public MobileElement selectAllButton;
    @AndroidFindBy(id = PEOPLE_BTN)
    public MobileElement peopleTabButton;
    @AndroidFindBy(id = FULLNAME_BTN)
    public MobileElement fullNameButton;
    @AndroidFindBy(id = BLOCK_BTN)
    public MobileElement blockButton;
    @AndroidFindBy(id = SEARCH_BTN)
    public MobileElement searchButton;
    @AndroidFindBy(id = SEARCH_PEOPLE_INPUT)
    public MobileElement searchPeopleInput;
    @AndroidFindBy(id = BACK_BTN)
    public MobileElement backButton;


    public void createNewUser(String firstName,String lastName,String aliasValue,String emailIdValue) {
        androidHelperMethods.WaitTillVisible(addPeopleButton);
        androidHelperMethods.click(addPeopleButton);
        androidHelperMethods.WaitTillVisible(createNewUserButton);
        androidHelperMethods.click(createNewUserButton);
        androidHelperMethods.WaitTillVisible(firstNameInput);
        androidHelperMethods.enter(firstNameInput,firstName);
        androidHelperMethods.WaitTillVisible(lastNameInput);
        androidHelperMethods.enter(lastNameInput,lastName);
        androidHelperMethods.WaitTillVisible(alias);
        androidHelperMethods.enter(alias,aliasValue);
        androidHelperMethods.WaitTillVisible(nextButton);
        androidHelperMethods.click(nextButton);
        androidHelperMethods.WaitTillVisible(emailId);
        androidHelperMethods.enter(emailId,emailIdValue);
        androidHelperMethods.WaitTillVisible(nextButton);
        androidHelperMethods.click(nextButton);
        androidHelperMethods.WaitTillVisible(selectAllButton);
        androidHelperMethods.click(selectAllButton);
        androidHelperMethods.WaitTillVisible(nextButton);
        androidHelperMethods.click(nextButton);
        androidHelperMethods.WaitTillVisible(nextButton);
        androidHelperMethods.click(nextButton);
    }

    public void blockUser(String username)throws Exception{
        androidHelperMethods.WaitTillVisible(peopleTabButton);
        androidHelperMethods.click(peopleTabButton);
        androidHelperMethods.WaitTillVisible(searchButton);
        androidHelperMethods.click(searchButton);
        androidHelperMethods.WaitTillVisible(searchPeopleInput);
        androidHelperMethods.enter(searchPeopleInput,username);
        Thread.sleep(2000);
        androidHelperMethods.WaitTillVisible(fullNameButton);
        androidHelperMethods.click(fullNameButton);
        androidHelperMethods.WaitTillVisible(blockButton);
        androidHelperMethods.click(blockButton);
        androidHelperMethods.WaitTillVisible(backButton);
        androidHelperMethods.click(backButton);
    }
}
