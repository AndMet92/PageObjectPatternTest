package footer;

import com.codeborne.selenide.SelenideElement;
import Functional.*;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class Active {
    Newtodo newtodo = new Newtodo();
    Checbox checbox = new Checbox();

    private SelenideElement buttonactive = $x("html/body/div/section/footer/ul/li[2]/a");
    private final SelenideElement Container1 = element("#todo-list>li");

    public void click() {
        newtodo.add("a");
        newtodo.add("b");
        checbox.clicks();
        buttonactive.click();
        Container1.shouldNotHave(exactText("b"));
    }


}



