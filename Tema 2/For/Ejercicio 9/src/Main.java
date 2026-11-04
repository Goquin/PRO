import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int ramdom= 0;

        System.out.print("Introduce el priemer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {

            if (num2 > num1) {
                ramdom = (int) (Math.random() * (num2 - num1) + num1) + 1;
            }
            if (num2 < num1) {
                ramdom = (int) (Math.random() * (num1 - num2) + num2) + 1;
            }

            System.out.println(ramdom);
        }


    }
}