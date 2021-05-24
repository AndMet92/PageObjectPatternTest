package footer;

import com.codeborne.selenide.*;
import Functional.Newtodo;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class All {
    Newtodo newtodo = new Newtodo();
    Active active = new Active();

    private SelenideElement buttonall = $x("html/body/div/section/footer/ul/li[1]/a");
    private SelenideElement nocomplete = element(byXpath("/html/body/div/section/section/ul/li[2]/div/label"));
    private ElementsCollection complete = elements(byXpath("//*[@id='main']//*[@class='ember-view']"));

    public void setNewtodo(Newtodo newtodo) {
        this.newtodo = newtodo;
    }

    public void setActive(Active active) {
        this.active = active;
    }

    public void click2() {

        active.click();
        newtodo.add("c");
        buttonall.click();
        nocomplete.shouldHave(text("b"));
        complete.shouldHave(exactTexts("a", "c"));


    }


}
