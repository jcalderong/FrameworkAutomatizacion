package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.VentanaHome;

public class BalanceHomePage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return VentanaHome.BOTON_SALDO.resolveFor(actor).isVisible();
    }

    public static BalanceHomePage isVisible() {
        return new BalanceHomePage();
    }

}
