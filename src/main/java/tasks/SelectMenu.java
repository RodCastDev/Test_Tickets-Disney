package tasks;

import com.assertthat.selenium_shutterbug.utils.web.Browser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;

public class SelectMenu implements Task {

    private Target target;

    public SelectMenu(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(target), Click.on(target));
    }

    public static SelectMenu selectMenu(Target optionTarget){
        return new SelectMenu(optionTarget);
    }
}
