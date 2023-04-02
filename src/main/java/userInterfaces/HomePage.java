package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://test.destinojet.co/")
public class HomePage extends PageObject{
    public static final Target SelectMenu = Target.the("Tickes Disney").
            locatedBy("//*[@id=\"pageSite\"]/div[4]/div/div/div/div[1]/div/div/div[2]/ul/li[5]/a");

    public static final Target SendDate = Target.the("Fecha").located(By.id("arrivalDate"));
    public static final Target SendDays = Target.the("Dias").located(By.id("days"));
    public static final Target SendAdultos = Target.the("Adultos").located(By.id("adults"));
    public static final Target Sendchildren = Target.the("Ninos").located(By.id("children"));
    public static final Target ButtonSearch = Target.the("boton-buscar").located(By.xpath("(//*[@class='btn btn-secondcolor btn-block'][contains(text(), 'Buscar')])[2]"));

    public static final Target Resumtitle = Target.the("Titulo-resumen").located(By.xpath("/html/body/bf-root/div/bf-results/div/div/div[2]/bf-aside/div/div[1]"));
}
