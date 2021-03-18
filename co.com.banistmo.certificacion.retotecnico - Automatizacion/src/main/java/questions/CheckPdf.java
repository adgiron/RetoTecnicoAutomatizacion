package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;
import userinterface.Page3;

public class CheckPdf implements Question<Boolean>
{

    String texto;

    public CheckPdf(String texto)
    {
        this.texto = texto;
    }

    public static CheckPdf is(String texto)
    {
        return new CheckPdf(texto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text = Text.of(Page3.CONTRATO).viewedBy(actor).asString();
        return texto.equals(text);
    }
}
