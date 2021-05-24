package footer;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Linkchec {
    private SelenideElement link1 = $x("/html/body/div/footer/p[2]/a[1]");
    private SelenideElement link2 = $x("/html/body/div/footer/p[2]/a[2]");
    private SelenideElement link3 = $x("/html/body/div/footer/p[3]/a");

    public void check() {
        System.out.println("Link 1 =" + link1.getText());
        System.out.println("Link 1 =" + link2.getText());
        System.out.println("Link 1 =" + link3.getText());
        link1.click();
        open("/");
        link2.click();
        open("/");
        link3.click();

    }
}
