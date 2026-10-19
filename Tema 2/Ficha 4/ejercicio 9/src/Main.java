import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un caracter: ");
        char letra = sc.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("El caracter es mayuscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("Es una minuscula");
        } else {
            System.out.println("El caracter no es una letra.");
        }

    }
}