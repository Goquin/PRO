import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int num = sc.nextInt();

        if (num < 0 ){
            System.out.println("El numero es negativo.");
        } else if (num > 0) {
            System.out.println("El numero es positivo.");
        } else {
            System.out.println("El numero es 0.");
        }

    }
}