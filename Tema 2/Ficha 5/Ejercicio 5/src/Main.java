import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un dia de la semana (del 1 al 7): ");
        int dia = sc.nextInt();

        switch (dia) {

            case 1:
                System.out.println("El dia de la semana es Luens");
                break;
            case 2:
                System.out.println("El dia de la semana es Martes");
                break;
            case 3:
                System.out.println("El dia de la semana es Miercoles");
                break;
            case 4:
                System.out.println("El dia de la semana Jueves");
                break;
            case 5:
                System.out.println("El dia es viernes");
                break;
            case 6:
                System.out.println("El dia es sabado");
                break;
            case 7:
                System.out.println("El dia es domingo");
                break;
            default:
                System.out.println("El valor introducido no es valido");
        }
    }
}