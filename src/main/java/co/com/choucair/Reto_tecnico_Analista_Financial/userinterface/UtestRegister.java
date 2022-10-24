package co.com.choucair.Reto_tecnico_Analista_Financial.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegister {
    //First page of fields
    public static final Target JOIN_BUTTON = Target.the("Button that leads us to the register form").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target FNAME_FIELD = Target.the("First name field of the register form").located(By.id("firstName"));
    public static final Target LNAME_FIELD = Target.the("Last name field of the register form").located(By.id("lastName"));
    public static final Target EMAIL_FIELD = Target.the("Email field of the register form").located(By.id("email"));
    public static final Target BIRTH_MONTH_FIELD = Target.the("Birth month field of the register form").located(By.xpath("//*[@id=\"birthMonth\"]/option[13]"));
    public static final Target BIRTH_DAY_FIELD = Target.the("Birth day field of the register form").located(By.xpath("//*[@id=\"birthDay\"]/option[2]"));
    public static final Target BIRTH_YEAR_FIELD = Target.the("Birth year field of the register form").located(By.xpath("//*[@id=\"birthYear\"]/option[5]"));
    public static final Target LANGUAGES_FIELD = Target.the("Languages field of the register form").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target LANGUAGES_SPANISH_FIELD = Target.the("Spanish field of the languages field of the register form").located(By.xpath("//*[@id=\"ui-select-choices-row-0-0\"]/span/div/span"));
    public static final Target LOCATION_BUTTON = Target.the("Location button to go to the next page of the form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    //Location part of the form
    public static final Target CITY_FIELD = Target.the("City field of the location form").located(By.id("city"));
    public static final Target ZIP_FIELD = Target.the("Zip field of the location form").located(By.id("zip"));
    public static final Target COUNTRY_FIELD = Target.the("Country field of the location form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target COUNTRY_FIELD_INPUT = Target.the("Selected country field of the country field on the location form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target SELECTED_COUNTRY = Target.the("Selected country field of the country field on the location form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/ul/li/div[3]/span/div"));
    public static final Target DEVICES_BUTTON = Target.the("Devices button to go to the next page of the form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    //Devices part of the form
    public static final Target COMPUTER_FIELD = Target.the("Computer field of the devices form").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_FIELD_INPUT = Target.the("Computer input field of the computer field on the devices form").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECTED_COMPUTER = Target.the("Selected computer field of the computer field on the devices form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target COMPUTER_VERSION_FIELD = Target.the("Computer version field of the devices form").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_VERSION_INPUT_FIELD = Target.the("Computer version input field of the computer field on the devices form").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECTED_COMPUTER_VERSION = Target.the("Selected computer version field of the computer field on the devices form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target COMPUTER_LANGUAGE_FIELD = Target.the("Computer language field of the devices form").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_LANGUAGE_INPUT_FIELD = Target.the("Computer language input field of the devices form").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target SELECTED_COMPUTER_LANGUAGE= Target.the("Selected computer language field of the computer field on the devices form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target MOBILE_FIELD = Target.the("Mobile device field of the devices form").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_INPUT_FIELD = Target.the("Mobile device input field of the devices form").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECTED_MOBILE= Target.the("Selected mobile device field of the mobile device field on the devices form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target MOBILE_MODEL_FIELD = Target.the("Mobile device model field of the devices form").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_MODEL_INPUT_FIELD = Target.the("Mobile device model input field of the devices form").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECTED_MOBILE_MODEL= Target.the("Selected mobile device model field of the mobile device field on the devices form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target MOBILE_VERSION_FIELD = Target.the("Mobile device operating system field of the devices form").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_VERSION_INPUT_FIELD = Target.the("Mobile device operating system input field of the devices form").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target SELECTED_MOBILE_VERSION= Target.the("Selected mobile device operating system field of the mobile device field on the devices form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target LAST_STEP_BUTTON = Target.the("Last step button to go to the final page of the form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    //Passwords part of the form
    public static final Target FIRST_PASSWORD_FIELD = Target.the("First password field of the register form").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("Confirm password field of the register form").located(By.id("confirmPassword"));
    public static final Target TERMS_BOX = Target.the("Terms of use box of the register form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_BOX = Target.the("Privacy and security box of the register form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Final button of the form that completes the registration").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
    //Login buttons
    public static final Target LOGIN_BUTTON = Target.the("Login button in the page after registry").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a"));
    public static final Target LOGIN_EMAIL_FIELD = Target.the("Email field of the login form").located(By.id("username"));
    public static final Target LOGIN_PASSWORD_FIELD = Target.the("Password field of the login form").located(By.id("password"));
    public static final Target SIGN_IN_BUTTON = Target.the("Button to complete login").located(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/div/form/main/section[3]/div/div/button"));
    public static final Target VALIDATION_TEXT = Target.the("Text shown after succesfully logging in").located(By.xpath("/html/body/div/div/div[1]/div/div/section/div[2]"));
}
