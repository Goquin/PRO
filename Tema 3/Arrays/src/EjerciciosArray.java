import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjerciciosArray {
    public static void main(String[] args) {

    /**    int[] num = new int[12];

        num [0] = 39;
        num [1] = -2;
        num [4] = 0;
        num [6] = 14;
        num [8] = 5;
        num [9] = 120;

        for (int i=0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Intrduzca el numero de elementos: ");
        int x = sc.nextInt();
        int[] num = new int [x];
        int intro = 0;
        int max = -999999;
        int min= 999999;
        int totalPositivos = 0;
        int totalNegativos = 0;
        int cantidaPositivos = 0;
        int cantidadNegativos = 0;

        for (int i=0; i < num.length; i++) {
            System.out.print("Introduzca el numero " + (i+1) + ": ");
            intro = sc.nextInt();
            num [i] = intro;

            if (max < intro) {
                max = intro;
            }

            if (min > intro) {
                min = intro;
            }

            if (intro < 0) {
                totalNegativos = totalNegativos + intro;
                cantidadNegativos++;
            }

            if (intro > 0) {
                totalPositivos = totalPositivos + intro;
                cantidaPositivos++;
            }
        }

        for (int j=0; j < num.length; j++) {

            if (max == num[j]) {
                System.out.print(" maximo ->" + num [j] + " ");
            } else if (min == num[j]) {
                System.out.print(" minimo ->" + num [j] + " ");
            } else {
                System.out.print(num[j] + " ");
            }
        }

        System.out.println("\nLa media de los positivos es: " + (totalPositivos/cantidaPositivos));
        System.out.print("La media de los negativos es: " + (totalNegativos/cantidadNegativos));

    }
}