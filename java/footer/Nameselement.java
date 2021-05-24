package footer;

import com.codeborne.selenide.SelenideElement;
import Functional.Checbox;
import Functional.Newtodo;

import static com.codeborne.selenide.Selenide.$x;

public class Nameselement {
    Newtodo newtodo=new Newtodo();
    Checbox checbox=new Checbox();
    private SelenideElement buttonactive = $x("html/body/div/section/footer/ul/li[2]/a");
    private SelenideElement buttonall = $x("html/body/div/section/footer/ul/li[1]/a");
    private SelenideElement buttonclear = $x("html/body/div/section/footer/button");
    private SelenideElement buttoncompleted = $x("html/body/div/section/footer/ul/li[3]/a");
    private SelenideElement counter= $x("/html/body/div/section/footer/span");

    private SelenideElement p1= $x("/html/body/div/footer/p[1]");
    private SelenideElement p2= $x("/html/body/div/footer/p[2]");
    private SelenideElement p3= $x("/html/body/div/footer/p[3]");

    public void print(){
        newtodo.add("a");
        newtodo.add("a");
        checbox.clicks();
        System.out.println("Name counter = "+counter.getText());
        System.out.println("Name All = "+buttonall.getText());
        System.out.println("Name Active = "+buttonactive.getText());
        System.out.println("Name Completed = "+buttoncompleted.getText());
        System.out.println("Name Clear completed = "+buttonclear.getText());

        System.out.println("Name String1 = "+p1.getText());
        System.out.println("Name String2 = "+p2.getText());
        System.out.println("Name String3 = "+p3.getText());

    }
}
