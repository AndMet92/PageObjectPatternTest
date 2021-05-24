package Functional;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class Newtodo {
    private SelenideElement container = element("#new-todo");

    public void add(String text) {

        container.setValue(text).pressEnter();

    }


}
