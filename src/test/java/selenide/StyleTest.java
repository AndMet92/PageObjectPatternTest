package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class StyleTest {
    @Test
    public void StyleTest() {
        Configuration.baseUrl = "https://todomvc.com/examples/emberjs";
        String unique = "";
        open("/");
        SelenideElement NT = element("#new-todo");
        ElementsCollection TodLiLi = elements("#todo-list>li");
        extracted(NT, "a");
        extracted(NT, "b");
        extracted(NT, "c");
        TodLiLi.shouldHave(exactTexts("a", "b", "c"));
        // Edit
        TodLiLi.findBy(exactText("b")).doubleClick();
        TodLiLi.findBy(cssClass("editing"))
                .find(".edit").append("c").pressEnter();
        // Complete & Clear
        TodLiLi.findBy(exactText("bc"))
                .find(".toggle").click();
        element("#clear-completed").click();
        TodLiLi.shouldHave(exactTexts("a", "c"));
// Cancel Edit
        TodLiLi.findBy(exactText("c")).doubleClick();
        TodLiLi.findBy(cssClass("editing"))
                .find(".edit").append("to be canceled").pressEscape();
        // Delete
        TodLiLi.findBy(exactText("c")).hover()
                .find(".destroy").click();
        TodLiLi.shouldHave(exactTexts("a"));
    }

    private void extracted(SelenideElement NT, String a) {
        NT.append(a).pressEnter();
    }


}



