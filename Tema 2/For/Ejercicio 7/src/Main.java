import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int edad;
        double altura;
        int edadTotal = 0;
        double alturaTotal = 0;
        int adultos = 0;
        int altos = 0;


        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5 ; i++) {

            System.out.print("Introduzca la edad del alumno: ");
            edad = sc.nextInt();

            System.out.print("Introduzca la altura del alumno: ");
            altura = sc.nextDouble();

            edadTotal = edadTotal + edad;
            alturaTotal = alturaTotal + altura;

            if (edad > 17) {
                ++adultos;
            }

            if (altura > 1.74 ) {
                ++altos;
            }

        }

        double mediaEdad = edadTotal / 5;
        double mediaAltura = alturaTotal / 5;

        System.out.println("La media de edad es de: " + mediaEdad);
        System.out.println("La media de altura es de: " + mediaAltura);
        System.out.println("El numero de adultos es: " + adultos);
        System.out.println("El numero de altos es: " + altos);
    }
}