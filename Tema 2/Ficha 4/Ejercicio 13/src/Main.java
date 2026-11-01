import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nota: ");
        double nota = sc.nextDouble();

        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();

        System.out.println("Introduzca su genero (M o F): ");
        char sexo = sc.next().charAt(0);
        int sexoNum = (char) sexo;

        if ((nota>= 5 && nota<=10) && (edad>=18) && (sexoNum == 77)) {
            System.out.println("POSIBLE");
        } else if ((nota>= 5) && (edad>=18) && (sexoNum == 70)) {
            System.out.println("ACEPTADA");
        } else {
            System.out.println("NO ACEPTADA");
        }
    }
}