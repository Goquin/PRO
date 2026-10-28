import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca las cifras de su DNI: ");
        int dni = sc.nextInt();

        int digitos = String.valueOf(dni).length();

        while (digitos != 8) {
            System.out.println("El dni introducido no es valido, no contiene 8 cifras.");

            System.out.print("Introduzca las cifras de su DNI, recuerde, son 8: ");
            dni = sc.nextInt();
        }

        int restoDNI = dni%23;
        char letraDNI;
        switch (restoDNI) {
            case 0:
                System.out.print("T");
                break;
            case 1:
                System.out.print("R");
                break;
            case 2:
                System.out.print("W");
                break;
            case 3:
                System.out.print("A");
                break;
            case 4:
                System.out.print("G");
                break;
            case 5:
                System.out.print("M");
                break;
            case 6:
                System.out.print("Y");
                break;
            case 7:
                System.out.print("F");
                break;
            case 8:
                System.out.print("P");
                break;
            case 9:
                System.out.print("D");
                break;
            case 10:
                System.out.print("X");
                break;
            case 11:
                System.out.print("B");
                break;
            case 12:
                System.out.print("N");
                break;
            case 13:
                System.out.print("J");
                break;
            case 14:
                System.out.print("Z");
                break;
            case 15:
                System.out.print("S");
                break;
            case 16:
                System.out.print("Q");
                break;
            case 17:
                System.out.print("V");
                break;
            case 18:
                System.out.print("H");
                break;
            case 19:
                System.out.print("L");
                break;
            case 20:
                System.out.print("C");
                break;
            case 21:
                System.out.print("K");
                break;
            case 22:
                System.out.print("E");
                break;
        }
        System.out.println("Su DNI es: " + dni + " con la letra " + "x");
    }
}