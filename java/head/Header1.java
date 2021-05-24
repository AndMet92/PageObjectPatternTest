package head;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Header1 {
    private SelenideElement todos = $x("html/body/div/section/header/h1");

    public void check1() {
        todos.shouldHave(Condition.text("todos"));
    }


}
