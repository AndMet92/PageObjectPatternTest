package footer;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class Completed {
    private SelenideElement buttoncompleted = $x("html/body/div/section/footer/ul/li[3]/a");
    private SelenideElement nocomplete = element(byXpath("/html/body/div/section/section/ul/li/div/label"));

    Active active = new Active();

    public void click3() {
        active.click();
        buttoncompleted.click();
        nocomplete.shouldNotHave(exactText("a"));
        nocomplete.shouldHave(exactText("b"));

    }
}
