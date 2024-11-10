import java.awt.*;
public class Main {
    public static void main(String[] args) {
        Recrutare person = new Recrutare();
        System.out.println(person);
        Recrutare person1 = new Recrutare("Pop","Ana",25,"Contabil","Contabilitate");
        System.out.println("\n" + person1);
        Actiuni prim = new Actiuni("Ordine",12,467532);
        System.out.println(prim);
        Salarii first = new Salarii(1200,3200,14000);
        first.getBonus(1200,170,3200);
        System.out.println(first);
    }
}