//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad: ");
        int c = sc.nextInt();

        System.out.println("Introduce las unidades: ");
        int u = sc.nextInt();

        System.out.println("Introduce el precio: ");
        double p = sc.nextDouble();

        double importe = c * u * p;

        double igic = importe * 0.07;

        double total = importe + igic;

        DecimalFormat df = new DecimalFormat("#.00");

        double redondeoTotalReal = round(total);
        double redondeoTotalSuperior = ceil(total);
        double redondeoTotalInferior = floor(total);

        System.out.println("El importe libre de IGIC es de: " + importe);
        System.out.println("El impuesto de IGIC es de: " + igic);
        System.out.println("El importe total es de: " + df.format(total));
        System.out.println("El importe redondeado es de: " + redondeoTotalReal);
        System.out.println("El importe redondeado superior es de: " + redondeoTotalSuperior);
        System.out.println("El importe redondeado inferior es de: " + redondeoTotalInferior);

    }
}