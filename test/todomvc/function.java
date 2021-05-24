
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Functional.*;

import static com.codeborne.selenide.Selenide.closeWindow;

public class function extends Base {
    Newtodo newtodo = new Newtodo();
    Websate websate = new Websate();
    Todosearch todosearch = new Todosearch();
    Checbox checbox = new Checbox();
    Complete complete = new Complete();
    Todoredact todoredact = new Todoredact();
    Tododelete tododelete = new Tododelete();

    @Before
    public void startwindow1() {

        websate.open();
    }

    @Test
    public void entertext() {


        newtodo.add("q");// Ввод текста в поля ввода.
        newtodo.add("w");// Ввод текста в поля ввода.
        newtodo.add("e");// Ввод текста в поля ввода.
    }

    public void search() {
        todosearch.search("q", "w", "e");// Поиск введенного текста
    }

    public void click() {
        checbox.clicks();// Активация чекбокса выполнения задачи
    }

    public void complete() {
        complete.secom("w"); //Проверка, что задача помечена как выполненная
        complete.senotcom("q", "e");// Проверка, что остальные задачи помечены как не выполненные
        complete.redaction("d");// Проверка возможности и правильности редактирование задачи

    }

    public void redaction() { // Проверка возможности редактирования задачи и удаления внесенных изменений
        todoredact.clear("z");
    }

    @Test
    public void del() {
        tododelete.delete("a", "b"); //Проверка возможности удаления задачи с помощью кнопки
    }

    @After
    public void after() {
        closeWindow();


    }


}









