import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int pagoMes;
        int pagoTotal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos meses ha de pagar: ");
        int meses = sc.nextInt();

        System.out.print("Cuanto pago el primer meses: ");
        int pago = sc.nextInt();

        for (int i = 1; i <= meses; i++) {

            pago = pago * 2;
            System.out.println("El mes " + i + " ha de pagar: " + pago);
            pagoTotal = pagoTotal + pago;
        }

        System.out.println("El pago total sera de: " + pagoTotal);
    }
}