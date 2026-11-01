import java.util.Scanner;
import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Introduzca una distancia (millas): ");
        double millas = sc.nextDouble();

        double km = millas/1.6093;


        System.out.println("Distancia (km): " + df.format(km));

        while (millas != 0) {
            System.out.print("Introduzca una distancia (millas): ");
            millas = sc.nextDouble();

            km = millas/1.6093;

            System.out.println("Distancia (km): " + df.format(km));
        }
    }
}