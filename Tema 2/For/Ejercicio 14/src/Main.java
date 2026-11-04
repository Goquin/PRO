import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int fac;
        int facTotal = 0;
        int fac600 = 0;



        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.print("Codigo del producto: ");
            String codigo = sc.nextLine();

            System.out.print("Cantidad de litros vendida: ");
            int litros = sc.nextInt();

            System.out.print("Precio del litro: ");
            int precio = sc.nextInt();

            fac = litros * precio;

            facTotal = facTotal+fac;

            if (fac >= 600) {
                ++fac600;
            }

            if (i==1) {
                System.out.println(" El numero de de litros del producto 1 fue: " + litros);
            }
        }

        System.out.println("La facturacion total fue: " + facTotal);
        System.out.println("El numero de facturas superior a 600 fue: " + fac600);
    }
}