import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer lado: ");
        int lado1 = sc.nextInt();

        System.out.println("Introduzca el segundo lado: ");
        int lado2 = sc.nextInt();

        System.out.println("Introduzca el tercer lado: " );
        int lado3 = sc.nextInt();

        if (lado1 == lado2 && lado1==lado3) {
            System.out.println("El triangulo es equilatrero");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2!=lado3) {
            System.out.println("El triangulo es escaleno.");
        }else System.out.println("El triangulo es isosceles.");
    }
}