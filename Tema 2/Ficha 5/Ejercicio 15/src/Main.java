import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota del primer control: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota del segundo control: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/2;

        if (media>= 5) {
            System.out.println("Aprobado, la nota obtenida es: " + media);
        } else {
            System.out.println("¿Cual ha sido el resultado de la recuperacion?(A/N)");
           char recuperacion = sc.next().charAt(0);

            switch (recuperacion) {
                case 'A':
                    System.out.println("Su nota es un 5");
                    break;
                case 'N':
                    System.out.println("Su nota meida, " + media + " es insuficiente.");
                    break;
                default:
                    System.out.println("Ha introducido un valor no valido");
            }
        }

    }
}