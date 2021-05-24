package Functional;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class Checbox {

    private SelenideElement todotoggle = element("#todo-list li:nth-child(2) .toggle");

    public void clicks() {
        todotoggle.click();

    }
}
