import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double nota;
        double alta = 0;
        double baja = 10;
        double notaTotal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos alumnos son?: ");
        int alumnos = sc.nextInt();


        for (int i = 1; i <= alumnos ; i++) {

            System.out.print("Introduzca la nota del alumno " + i + ": ");
            nota = sc.nextDouble();

            notaTotal = notaTotal + nota;

            if (nota > alta) {
                alta = nota;
            }

            if (nota < baja) {
                baja = nota;
            }
        }

        double mediaNota = notaTotal / alumnos;

        System.out.println("La media de la nota es: " + mediaNota);
        System.out.println("La nota maxima fue: " + alta);
        System.out.println("La nota minima fue: " + baja);

    }
}