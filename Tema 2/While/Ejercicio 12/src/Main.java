import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numIni;
        int numSeg;
        int conteoMayores=0;
        int conteoMenores=0;
        int conteototal=0;

        System.out.print("Dime un numero inicial: ");
        numIni = sc.nextInt();


        while  (numIni != 0) {

            System.out.print("Dime un numero: ");
            numSeg= sc.nextInt();

            if (numIni < numSeg) {
                ++conteoMayores;
            } else if (numIni > numSeg && numSeg !=0) {
                ++conteoMenores;
                System.out.println("Fallo es menor.");
            } else {
                ++conteototal;
            }

            numIni = numSeg;

        }

        int conteoTotal = conteototal + conteoMayores +conteoMenores;
        System.out.println("Total de números introducidos: " + conteoTotal);
        System.out.println("Números fallados: " + conteoMenores);
    }
}