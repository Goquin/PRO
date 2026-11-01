import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una temperatura en grados centigrados: ");
        int temCelcius = sc.nextInt();

        int temKevins = temCelcius+273;

        System.out.println("Temperatura (Kº): " + temKevins);

        System.out.print("¿Repetir proceso? (S/N): ");
        char res = sc.next().charAt(0);



        while (res == 'S') {
            System.out.print("Introduzca una temperatura en grados centigrados: ");
            temCelcius = sc.nextInt();

            temKevins = temCelcius+273;

            System.out.println("Temperatura (Kº): " + temKevins);

            System.out.print("¿Repetir proceso? (S/N): ");
            res = sc.next().charAt(0);
        }
    }
}