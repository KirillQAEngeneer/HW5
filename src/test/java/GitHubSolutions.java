import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSolutions {

    @Test
    void buildLikeTheBestText() {
        open("https://github.com/");
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("div.enterprise-hero").shouldHave(text("Build like the best"));
    }
}
