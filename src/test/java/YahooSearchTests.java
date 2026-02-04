import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YahooSearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.yahoo.com/");
        $("[role=search]").setValue("selenide").pressEnter();
        //$(By.xpath("[role=search]")).setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}
