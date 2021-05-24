
import footer.Todocounter;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class counter extends Base {
    Todocounter todocounter = new Todocounter();
    @Before
    public void websate(){
        open("/");
    }
    @Test
    public void number(){
        todocounter.score();
    }
}
