import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        /**Primro creare el scanner*/

        Scanner sc = new Scanner(System.in);

        /** Continuo solicitando un numero entre 32 y 126 y mostrando el caracter ASCII
         * que le corresponde, para lo cual lo pasamaremos a char y lo mostramos*/

        System.out.println("Introduce un número entre 32 y 126: ");
        int numEntero = sc.nextInt();

        char caracter = (char) numEntero;

        System.out.println("Codigo " + numEntero + " corresponde al carácter: " + caracter);
/**
        int mayusmin = Character.isUpperCase(caracter) ? (numEntero + 32) : (numEntero>96 && numEntero<123) ? (numEntero-32) : 0;

        String res = (mayusmin==0) ? "La variable no tiene mayusculas ni minusculas." : ("Version alterna (Cambio de mayuscula/minuscula): " + (char) mayusmin);

        System.out.println(res);


    }
}