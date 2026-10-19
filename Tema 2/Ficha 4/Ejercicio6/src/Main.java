import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        int num = sc.nextInt();

        if ((num%3==0) && (num%5==0)){
            System.out.println("Es multiplo de 3 y 5");
        } else {
            System.out.println("No es multiplo de alguno");
        }

        if ((num%2==0) || (num%3==0)) {
            System.out.println("El numero es multiplo de 2 o 3");
        } else {
            System.out.println("El numero no es multiplo de ninguno");
        }
    }
}