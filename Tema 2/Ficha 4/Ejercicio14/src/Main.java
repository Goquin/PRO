import java.util.Scanner;
import static java.lang.Math.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Introduce y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Introduce x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Introduce y2: ");
        double y2 = sc.nextDouble();
        System.out.println("Introduce r1: ");
        double r1 = sc.nextDouble();
        System.out.println("Introduce r2: ");
        double r2 = sc.nextDouble();

        double restax = x2-x1;
        double restay = y2-y1;
        double distancia = sqrt(pow(restax, 2) + pow(restay,2));

        double sumaRadio = r1 + r2;
        double restaRadio = r1 - r2;

        if (distancia > sumaRadio) {
            System.out.println("Exteriores");
        } else if (distancia == sumaRadio) {
            System.out.println("Tangente exteriores");
        }    else if (distancia < sumaRadio) {
            System.out.println("Secantes");
        } else if (distancia>0 &&  distancia< abs(sumaRadio)) {
            System.out.println("Interiores");
        } else if (distancia == restaRadio) {
            System.out.println("Tangente interiores");
        } else {
            System.out.println("Concentricas");
        }
    }
}