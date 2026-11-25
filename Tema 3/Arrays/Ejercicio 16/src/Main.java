import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numList = new int[100];
        boolean aux = true;

        for (int i = 0 ; i < 100 ; i++) {
            numList[i] = (int) (Math.random()*21);

            System.out.print(numList[i] + " ");
        }

        System.out.print("\nIntroduce el primer valor: ");
        int primer = sc.nextInt();

        System.out.print("Introduce el segundo valor: ");
        int segundo = sc.nextInt();

        for (int k = 0; k < 100 ; k++) {

            if (numList[k] == segundo) {
                aux = false;
            }
        }

        if (aux) {
            for (int j = 0; j < 100; j++) {
                if (numList[j] == primer) {
                    numList[j] = segundo;
                    System.out.print("'" + numList[j] + "' ");
                } else {
                    System.out.print(numList[j] + " ");
                }
            }
        }else {
            System.out.println("No se han realizado cambios.");
            for (int l = 0 ; l < 100 ; l++) {
                numList[l] = (int) (Math.random()*21);

                System.out.print(numList[l] + " ");
            }
        }
    }
}