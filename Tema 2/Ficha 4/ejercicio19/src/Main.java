import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca las horas");
        int hora = sc.nextInt();

        System.out.println("Introduzca los minutos");
        int min = sc.nextInt();

        System.out.println("Introduzca los segundos");
        int seg = sc.nextInt();

        if ((hora<25 && hora >-1) && (min<61 && min>-1) && (seg<61 && seg>-1)) {
            System.out.println("la hora es valida");
            System.out.println(hora + ":" + min + ":" + seg);
        }else System.out.println("La hora no es valida");
    }
}