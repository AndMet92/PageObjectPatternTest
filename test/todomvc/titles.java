
import head.Header1;
import head.Header2;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class titles extends Base {
    Header1 header1= new  Header1();
    Header2 header2= new Header2();
    @Before
    public void websate(){
        open("/");
    }

    @Test
    public void header1(){
        header1.check1();

   }
    @Test
    public void header2(){
       header2.check2();
    }

}
