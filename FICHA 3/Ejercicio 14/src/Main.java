//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzaca un numero entero de 5 cifras: ");
        int x = sc.nextInt();

        int a = x/10000;

        int b = x/1000;

        int c = x/100;

        int d = x/10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(x);

        int f = ((((x%10000)%1000)%100)%10);

        System.out.println(f);

        int g = (((x%10000)%1000)%100);

        System.out.println(g);

        int h = ((x%10000)%1000);

        System.out.println(h);

        int i = (x%10000);

        System.out.println(i);

        System.out.println(x);


    }
}