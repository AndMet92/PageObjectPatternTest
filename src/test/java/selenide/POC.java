package selenide;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.*;

public class POC {
    @Test
    public void selenide() {
        // Цель: проверить соответствует ли введенный текст в поле задачи, сохраненному.
        open("http://todomvc4tasj.herokuapp.com");
        element("#new-todo").setValue("a").pressEnter();
        elements(" #todo-list > li > div > label > font > font ").shouldHave(exactTexts("a"));
        
        
        // elements("#todo-list").shouldHave(CollectionCondition.texts("a"));

      //  elements("#todo-list li label font").shouldHave(CollectionCondition.texts("a"));





    }
}


