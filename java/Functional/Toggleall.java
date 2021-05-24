package Functional;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Toggleall {
    Newtodo newtodo = new Newtodo();
    private SelenideElement toggleall = $x("html/body/div/section/section/input");
    private SelenideElement todolist = $x("/html/body/div/section/section");

    public void click5() {
        newtodo.add("a");
        newtodo.add("b");
        newtodo.add("c");
        toggleall.click();
        todolist.shouldNotHave(Condition.text("//*[@id='todo-list']//*[@class='completed ember-view']"));


    }
}
