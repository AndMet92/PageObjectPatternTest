
import footer.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Functional.Toggleall;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class button extends Base {
    Active active = new Active();
    All all=new All();
    Completed completed= new Completed();
    Clear clear= new Clear();
    Toggleall toggleall= new Toggleall();
    Nameselement nameselement=new  Nameselement();
@Before
public void websate(){
    open("/");
}
    @Test

            public void click(){ // Проверка правильности работы кнопки Active
        active.click();
    }
    @Test
    public void click2 (){ // Проверка правильности работы кнопки All
    all.click2();

    }
    @Test
    public void click3(){ //Проверка правильности работы кнопки Completed
    completed.click3();
    }
    @Test
    public void click4(){
    clear.click4();
    }
    @Test
    public void click5(){
    toggleall.click5();
    }
    @Test
    public void names(){
        nameselement.print();
    }
    @After
    public void close(){
    closeWindow();
    }
}




