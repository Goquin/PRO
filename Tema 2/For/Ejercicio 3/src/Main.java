import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ganancias;
        int gananciasTotal = 0;

        System.out.print("Introduzca el numero de ventas: ");
        int i = sc.nextInt();

        for (int nveces = 1; nveces <= i; nveces++) {
            System.out.println("Introduzca la ganancia de la venta numero " + nveces + ": ");
            ganancias = sc.nextInt();
            gananciasTotal = gananciasTotal + ganancias;

        }

        System.out.println("Las ganancias totales son de: " + gananciasTotal + "€");

    }
}