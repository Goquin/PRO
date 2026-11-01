import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzaca un año: ");
        int año = sc.nextInt();

        if ((año % 4 == 0) && (año % 400 == 0) || (año % 100 != 0)) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("El año no es bisisesto.");
        }
    }
}