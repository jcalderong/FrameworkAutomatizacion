package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VentanaHome {

    public static final Target BOTON_SALDO = Target.the("Bot�n saldo")
            .located(By.id("com.experitest.ExperiBank:id/makePaymentButton"));

}
