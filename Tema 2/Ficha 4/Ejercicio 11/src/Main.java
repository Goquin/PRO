import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un caracter: ");
        char letra = sc.next().charAt(0);

        int letra1 = (char) letra;
        if ((letra1>47) && (letra1<58)) {
            System.out.println("Es un digito.");
        } else {
            System.out.println("No es un digito");
        }
    }
}