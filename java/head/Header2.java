package head;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;


public class Header2 {
    private SelenideElement todo = $x("html/body/div/section/section/ul/li/div/label");
    private SelenideElement placeholder = $x("//input[@placeholder='What needs to be done?']");

    public void check2() {
        placeholder.append("a").pressEnter();// Проверка правильности текста в плейсхолдере


        todo.shouldNotHave(Condition.text("What needs to be done?"));// Проверка автоудаления текста плейсхолдера в задаче


    }
}
