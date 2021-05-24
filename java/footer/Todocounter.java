package footer;

import com.codeborne.selenide.SelenideElement;
import Functional.Newtodo;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.element;

public class Todocounter {
  private SelenideElement counter= $x("/html/body/div/section/footer/span");
    private SelenideElement strong=$x("html/body/div/section/footer/span/strong");
    private SelenideElement toggleall= $x("html/body/div/section/section/input");
    private SelenideElement todotoggle =element("#todo-list li:nth-child(2) .toggle");
    Newtodo newtodo=new Newtodo();
    public void score(){
        newtodo.add("a");
        strong.find("1");
        newtodo.add("a");
        strong.find("2");
        newtodo.add("a");
        strong.find("3");
        todotoggle.click();
        strong.find("2");
        toggleall.click();
        strong.find("0");

    }
}
