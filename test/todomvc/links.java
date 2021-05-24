
import footer.Linkchec;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;


public class links extends Base {
    Linkchec linkchec=new Linkchec();
    @Before
    public void websate(){
        open("/");
    }
    @Test
    public void linkchec (){

        linkchec.check();

    }
}
