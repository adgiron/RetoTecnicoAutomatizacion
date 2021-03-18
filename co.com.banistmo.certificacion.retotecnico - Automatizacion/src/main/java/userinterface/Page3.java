package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Page3 {
    public static final Target DOCUMENTOS = Target.the("BOTON DOCUMENTOS").located(By.xpath("//*[@id=\"filialTabs\"]/li[5]/a"));
    public static final Target CONTRATO = Target.the("BOTON CONTRATO").located(By.xpath("//a[@title='Contrato Único de Productos y Servicios Bancarios']"));
    public static final Target PDF= Target.the("BOTON PDF").located(By.xpath("//embed[@type='application/pdf"));
}

