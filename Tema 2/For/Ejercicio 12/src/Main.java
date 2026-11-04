import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double ganAnual;
        double ganTotal= 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad a invertir: ");
        double inv = sc.nextDouble();

        System.out.print("Interes anual: ");
        double inte = sc.nextDouble();

        System.out.print("Duracion en años: ");
        int años = sc.nextInt();



        for (int i= 1; i <= años; i++) {

            ganAnual= inv * (inte/100);

            inv = inv+ganAnual;

            System.out.println("La ganancia anual sera de: " + ganAnual);
        }

        System.out.println("El total al final de los " + años + " sera de: " + inv);
    }
}