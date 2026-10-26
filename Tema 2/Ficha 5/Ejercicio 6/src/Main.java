import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce numero");
        int numero = sc.nextInt();

        switch (numero) {
            case 5:
                int cuatro;
                System.out.println("case 5");
                break;
            case 6:
                cuatro=4;
                System.out.println("case 6" + cuatro);
                break;
            case 7:
                System.out.println(cuatro);
                break;
        }

    }
}