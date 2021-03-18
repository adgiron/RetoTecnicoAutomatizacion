package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Page1 {
    public static final Target PRODUCTO = Target.the("BOTON PRODUCTO").located(By.xpath("//*[@id=\"main-menu\"]/div[2]/ul[1]/li[2]/a"));
    public static final Target DEPOSITO = Target.the("BOTON DEPOSITO").located(By.xpath("//*[@id=\"productosPersonas\"]/div/div[1]/div/div/div[1]/div/a"));

}


