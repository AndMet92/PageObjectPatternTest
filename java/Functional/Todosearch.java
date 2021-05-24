package Functional;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class Todosearch {


    String a;
    String b;
    String c;
    private final SelenideElement Container1 = element("#todo-list>li");

    public void search(String a, String b, String c) {

        Container1.shouldBe(Condition.exactText("a" + "b" + "c"));
    }
}
