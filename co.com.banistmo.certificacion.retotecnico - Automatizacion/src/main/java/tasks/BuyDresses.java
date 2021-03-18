package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterface.Page1;
import userinterface.Page2;
import userinterface.Page3;

public class BuyDresses implements Task
{

    public static BuyDresses WebSite() {
        return Tasks.instrumented(BuyDresses.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Click.on(Page1.PRODUCTO),
                Click.on(Page1.DEPOSITO),
                Click.on(Page2.CUENTAAHORROCOMERCIAL),
                Click.on(Page3.DOCUMENTOS),
                Click.on(Page3.CONTRATO)


        );
    }
}