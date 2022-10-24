package co.com.choucair.Reto_tecnico_Analista_Financial.questions;

import co.com.choucair.Reto_tecnico_Analista_Financial.userinterface.UtestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String strEmail;
    private String strPassword;
    private String question;

    public Answer(String strEmail, String strPassword, String question){
        this.strEmail = strEmail;
        this.strPassword = strPassword;
        this.question = question;
    }

    public static Answer toThe(String strEmail, String strPassword, String question){
        return new Answer(strEmail, strPassword, question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        actor.attemptsTo(Click.on(UtestRegister.LOGIN_BUTTON),
                Enter.theValue(strEmail).into(UtestRegister.LOGIN_EMAIL_FIELD),
                Enter.theValue(strPassword).into(UtestRegister.LOGIN_PASSWORD_FIELD),
                Click.on(UtestRegister.SIGN_IN_BUTTON));

        String validationText = Text.of(UtestRegister.VALIDATION_TEXT).viewedBy(actor).asString();
        if (question.equals(validationText)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
