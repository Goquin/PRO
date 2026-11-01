//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");
        int x = sc.nextInt();

        System.out.println("Introduzca el segundo numero: ");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println("El numero mayor es: " + x);}

        if (x < y){
            System.out.println("El numero mayor es: " + y);}
    }
}