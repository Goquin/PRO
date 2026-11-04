import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int totalPositivos = 0;
        int totalNegativos = 0;
        int numCeros= 0;
        int numPos = 0;
        int numNeg = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduzca un numero entero: ");
            int num = sc.nextInt();

            if (num < 0) {
                totalNegativos = totalNegativos + num;
                ++numNeg;
            } else if (num > 0) {
                totalPositivos = totalPositivos + num;
                ++numPos;
            } else ++numCeros;

        }

        int mediaPositivos = totalPositivos / numPos;
        int mediaNegativos = totalNegativos / numNeg;

        System.out.println("La media de numeros positivos es: " + mediaPositivos);
        System.out.println("La media de numeros negativos es: " + mediaNegativos);
        System.out.println("El numero de ceros introducidos es: " + numCeros);
    }
}