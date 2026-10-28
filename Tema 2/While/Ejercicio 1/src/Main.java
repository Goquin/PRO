import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la nota: ");
        int nota = sc.nextInt();

        while (nota<0 || nota>14) {
            System.out.println("La nota introducida no es valida");
            System.out.print("Introduzca la nota correcta: ");
            nota = sc.nextInt();
        }

        switch (nota){
            case 1,2,3,4 :
                System.out.println("Suspenso");
                break;
            case 5 :
                System.out.println("Suficiente");
                break;
            case 6 :
                System.out.println("Bien");
                break;
            case 7 :
                System.out.println("Notable bajo");
                break;
            case 8 :
                System.out.println("Notable alto");
                break;
            case 9 :
                System.out.println("Sobresaliente");
                break;
            case 10 :
                System.out.println("Matricula de honor");
                break;
        }
    }
}