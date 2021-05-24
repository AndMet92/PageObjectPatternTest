package Functional;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.elements;

public class Complete {
    String a;
    String b;
    String c;
    String d;
    private ElementsCollection completed = elements("#todo-list li.completed");
    private ElementsCollection notcompleted = elements("#todo-list li:not(.completed)");

    public void secom(String a) {
        completed.shouldHave(exactTexts("a")); //
    }

    public void senotcom(String b, String c) {
        notcompleted.shouldHave(exactTexts("b" + "c"));

    }

    public void redaction(String d) {
        completed.findBy(exactText("a")).doubleClick().setValue("d").pressEnter();
        completed.findBy(exactText("d"));
    }

    public void click() {
    }
}

