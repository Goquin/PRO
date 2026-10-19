import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        System.out.println("Introduce el exponente: ");
        int exp = sc.nextInt();

        if (exp>0) {
            System.out.println("El resultado es: " + Math.pow(num , exp));
        } else if (exp < 0) {
            System.out.println("El resultado es: " + 1/(Math.pow(num, exp)));
        } else {
            System.out.println("El resultado es 1");
        }
    }
}