package co.com.choucair.Reto_tecnico_Analista_Financial.tasks;

import co.com.choucair.Reto_tecnico_Analista_Financial.userinterface.UtestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Fill implements Task{

    private String strFname;
    private String strLname;
    private String strEmail;
    private String strLanguage;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strComputer;
    private String strVersion;
    private String strClanguage;
    private String strMobile;
    private String strMobilem;
    private String strMobilev;
    private String strPassword;

    public Fill(String strFname, String strLname, String strEmail, String strLanguage, String strCity, String strZip, String strCountry, String strComputer, String strVersion, String strClanguage, String strMobile, String strMobilem, String strMobilev, String strPassword) {
        this.strFname = strFname;
        this.strLname = strLname;
        this.strEmail = strEmail;
        this.strLanguage = strLanguage;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strClanguage = strClanguage;
        this.strMobile = strMobile;
        this.strMobilem = strMobilem;
        this.strMobilev = strMobilev;
        this.strPassword = strPassword;
    }

    public static Fill theForm(String strFname, String strLname, String strEmail, String strLanguage, String strCity, String strZip, String strCountry, String strComputer, String strVersion, String strClanguage, String strMobile, String strMobilem, String strMobilev, String strPassword){
        return Tasks.instrumented(Fill.class, strFname, strLname, strEmail, strLanguage, strCity, strZip, strCountry, strComputer, strVersion, strClanguage, strMobile, strMobilem, strMobilev, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegister.JOIN_BUTTON),
                Enter.theValue(strFname).into(UtestRegister.FNAME_FIELD),
                Enter.theValue(strLname).into(UtestRegister.LNAME_FIELD),
                Enter.theValue(strEmail).into(UtestRegister.EMAIL_FIELD),
                Click.on(UtestRegister.BIRTH_MONTH_FIELD),
                Click.on(UtestRegister.BIRTH_DAY_FIELD),
                Click.on(UtestRegister.BIRTH_YEAR_FIELD),
                Enter.theValue(strLanguage).into(UtestRegister.LANGUAGES_FIELD),
                Click.on(UtestRegister.LANGUAGES_SPANISH_FIELD),
                Click.on(UtestRegister.LOCATION_BUTTON),
                Enter.theValue(strCity).into(UtestRegister.CITY_FIELD), //Begining of the Location page of the form
                Enter.theValue(strZip).into(UtestRegister.ZIP_FIELD),
                Click.on(UtestRegister.COUNTRY_FIELD), Enter.theValue(strCountry).into(UtestRegister.COUNTRY_FIELD_INPUT), Click.on(UtestRegister.SELECTED_COUNTRY),
                Click.on(UtestRegister.DEVICES_BUTTON),
                Click.on(UtestRegister.COMPUTER_FIELD), Enter.theValue(strComputer).into(UtestRegister.COMPUTER_FIELD_INPUT), Click.on(UtestRegister.SELECTED_COMPUTER), //Begining of the Devices page of the form
                Click.on(UtestRegister.COMPUTER_VERSION_FIELD), Enter.theValue(strVersion).into(UtestRegister.COMPUTER_VERSION_INPUT_FIELD), Click.on(UtestRegister.SELECTED_COMPUTER_VERSION),
                Click.on(UtestRegister.COMPUTER_LANGUAGE_FIELD), Enter.theValue(strClanguage).into(UtestRegister.COMPUTER_LANGUAGE_INPUT_FIELD), Click.on(UtestRegister.SELECTED_COMPUTER_LANGUAGE),
                Click.on(UtestRegister.MOBILE_FIELD), Enter.theValue(strMobile).into(UtestRegister.MOBILE_INPUT_FIELD), Click.on(UtestRegister.SELECTED_MOBILE),
                Click.on(UtestRegister.MOBILE_MODEL_FIELD), Enter.theValue(strMobilem).into(UtestRegister.MOBILE_MODEL_INPUT_FIELD), Click.on(UtestRegister.SELECTED_MOBILE_MODEL),
                Click.on(UtestRegister.MOBILE_VERSION_FIELD), Enter.theValue(strMobilev).into(UtestRegister.MOBILE_VERSION_INPUT_FIELD), Click.on(UtestRegister.SELECTED_MOBILE_VERSION),
                Click.on(UtestRegister.LAST_STEP_BUTTON),
                Enter.theValue(strPassword).into(UtestRegister.FIRST_PASSWORD_FIELD), //Begining of the Passwords page of the form
                Enter.theValue(strPassword).into(UtestRegister.CONFIRM_PASSWORD_FIELD),
                Click.on(UtestRegister.TERMS_BOX),
                Click.on(UtestRegister.PRIVACY_BOX),
                Click.on(UtestRegister.COMPLETE_SETUP_BUTTON));
    }
}
