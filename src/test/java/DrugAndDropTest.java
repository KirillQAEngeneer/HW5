import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DrugAndDropTest {

    @Test
    void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $(byText("A")).dragAndDropTo($(byText("B"))).click();
//        actions().clickAndHold($(byText("A"))).moveToElement($(byText("B"))).release().build().perform();

        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));
    }
}
