import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int conteo1= 0;
        int conteo2= 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");
        int num2 = sc.nextInt();

        for (int i1 = 1; i1<num1 ; i1++) {

            if ((num1%i1) == 0) {
                conteo1 = conteo1 + i1;
            }

        }

        for (int i2 = 1; i2<num2 ; i2++) {

            if ((num2%i2) ==0) {
                conteo2 = conteo2 + i2;
            }

        }

        if (conteo1 == num2 && conteo2 == num1) {
            System.out.println("Felicidades, tus numeros son amigos.");
        } else System.out.println("No son amigos");
    }
}