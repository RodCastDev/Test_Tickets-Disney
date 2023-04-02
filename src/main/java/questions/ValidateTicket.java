package questions;

import javafx.scene.control.Tab;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateTicket implements Question<String> {

    private Target target;

    public ValidateTicket(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }

    public static ValidateTicket getText (Target target){
        return new ValidateTicket(target);
    }

}
