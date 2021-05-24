package Functional;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class Tododelete {
    private SelenideElement rubbish = element(byXpath("//input[@id='new-todo']"));
    private SelenideElement rubbish2 = element("#todo-list>li");

    public void delete(String a, String b) {
        rubbish.setValue("a").pressEnter();
        rubbish.setValue("b").pressEnter();
        rubbish2.shouldHave(Condition.exactText("a")).hover().find(".destroy").click();
        rubbish2.shouldNotHave(Condition.exactText("a"));


    }
}