import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];
        int[] copyList = new int[10];


        //Variables//
        int conteoPrimos = 0;
        int divisores;
        int conteoraro;
        int conteoNoPrimos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el numero " + (i+1) + ": ");
            list[i] = sc.nextInt();
            copyList[i] = list[i];
        }

        for (int j = 0; j<10; j++) {
            divisores=list[j];
            conteoraro= 0;
            while (divisores>0) {
                if (list[j]%divisores == 0) {
                    conteoraro++;
                }
                divisores--;
            }

            if (conteoraro == 2) {
                list[conteoPrimos] = list [j];
                ++conteoPrimos;
            }
        }

        for (int k = 0; k<10 ; k++) {
            divisores=copyList[k];
            conteoraro= 0;
            while (divisores>0) {
                if (copyList[k]%divisores == 0) {
                    conteoraro++;
                }
                divisores--;
            }

            if (conteoraro != 2) {
                copyList[conteoNoPrimos] = copyList[k];
                ++conteoNoPrimos;
            }
        }

        for (int x = 0; x<(10-conteoPrimos); x++) {
            list[(x+conteoPrimos)] = copyList[x];
        }

        for (int y = 0; y<10 ; y++) {
            System.out.println(list[y]);
        }
    }
}