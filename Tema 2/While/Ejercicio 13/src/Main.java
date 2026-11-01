import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minimo = 1;
        int maximo = 100;
        int intento;
        String igual = "igual";
        String mayor = "mayor";
        String menor = "menor";
        String respuesta = " ";
        System.out.println("Quiero que pienses un numero del 1 al 100.");

        while (!respuesta.equals(igual)) {

            intento = (int) (Math.random() * (maximo - minimo) + minimo) + 1;

            System.out.println("¿Su numero es " + intento + "?");
            respuesta = sc.nextLine();

            if (respuesta.equals(mayor)) {
                minimo = intento;
            }

            if (respuesta.equals(menor)) {
                maximo = intento;
            }

        }

    }
}