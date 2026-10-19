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

        char numEnteroCaracter = (char) numEntero;

        System.out.println("Codigo " + numEntero + " corresponde al carácter: " + numEnteroCaracter);

         /** Mediante ternarias preguntamos si el caracter es mayuscula , si es mayuscula le sumamos 32 a el numero introducido
          * para obtener el numero correspondiente de la minuscula, e introduciendo otra ternaria preguntamos si el numero introducido esta entre
          * 96 y 123 para saber si es minuscula o un caracter no correspondiente a una letra, si es minuscula restamos 32 para obtener el valor
          * del numero en mayusculas y en caso de que no le asigno un valor arbitrario, es este caso cero*/

        int mayusMin = Character.isUpperCase(numEnteroCaracter) ? (numEntero + 32) : (numEntero>96 && numEntero<123) ? (numEntero-32) : 0;

        /** Con otra ternaria compueblo el valor que he obtenido antes y asigno el valor que quiero que se muestre*/

        String solucion = (mayusMin==0) ? "La variable no tiene mayusculas ni minusculas." : ("Version alterna (Cambio de mayuscula/minuscula): " + (char) mayusMin);

        System.out.println(solucion);

        /** Seguimos con el ejercicio 2.3, para ello solicitamos un caracter y lo paso a numero*/

        System.out.println("Introduce un caracter: ");
        char caracter = sc.next().charAt(0);

        int caracterNumEntero = caracter;

        System.out.println("El carácter '" + caracter + "' tiene el código ASCII: " + caracterNumEntero);

        /** Para termianar calcularemos el numero de arriba y de abajo y cual es su caracter para mostrarlo en pantalla*/

        int caracterNumEnteroSuperior = caracterNumEntero + 1;

        int caracterNumEnteroInferior = caracterNumEntero - 1;

        char caracterSuperior = (char) caracterNumEnteroSuperior;

        char caracterInferior = (char) caracterNumEnteroInferior;

        System.out.println("Carácter anterior: " + caracterInferior);

        System.out.println("Carácter siguiente: " + caracterSuperior);

    }
}