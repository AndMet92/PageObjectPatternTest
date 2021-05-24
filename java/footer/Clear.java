package footer;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class Clear {
    All all = new All();
    private SelenideElement buttonclear = $x("html/body/div/section/footer/button");
    private SelenideElement buttonall = $x("html/body/div/section/footer/ul/li[1]/a");
    private SelenideElement todolist = $x("//*[@id='main']//*[@class='ember-view']");

    public void click4() {
        all.click2();
        buttonclear.click();
        buttonall.click();
        todolist.shouldNotHave(Condition.text("#todo-list li.completed"));


    }


}

