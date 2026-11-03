import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int b500=0;
        int b200=0;
        int b100=0;
        int b50=0;
        int b20=0;
        int b10=0;
        int b5=0;


        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero multiplo de 5: ");
        int dinero = sc.nextInt();

        if (dinero%5 != 0) {
            dinero = dinero - dinero%5;

            System.out.println("Se ha modificado el dinero introducido por " + dinero + " para que sea multiplo de 5.");
        }

        while (dinero >= 500) {
            ++b500;
            dinero = dinero - 500;
        }

        while (dinero >= 200 ) {
            ++b200;
            dinero = dinero -200;
        }

        while (dinero >= 100) {
            ++b100;
            dinero = dinero -100;
        }

        while (dinero >= 50) {
            ++b50;
            dinero = dinero - 50;
        }

        while (dinero >= 20) {
            ++b20;
            dinero = dinero -20;
        }

        while (dinero >= 10) {
            ++b10;
            dinero = dinero - 10;

        }

        while (dinero >= 5) {
            ++b5;
            dinero = dinero -5;
        }

        System.out.print("Sera necesario: " + b500 + " billetes de 500€, " + b200 + " billetes de 200€, " + b100 +
                " billetes de 100€, " + b50 + " billetes de 50€, " + b20 + " billetes de 20€, " + b10 + " billetes de 10€ y " + b5 + " billetes de 5€");
    }
}