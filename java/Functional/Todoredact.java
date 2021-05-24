package Functional;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.elements;

public class Todoredact {

    String a;
    String b;
    private final ElementsCollection completed = elements("#todo-list li");

    public void clear(String a) {
        completed.findBy(Condition.exactText("a")).doubleClick();
        completed.findBy(cssClass("editing")).append("b").pressEscape();
        completed.findBy(exactText("a"));
    }

}

