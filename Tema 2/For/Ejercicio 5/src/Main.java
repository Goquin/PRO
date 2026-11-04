//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int multiplicacion = 1;

        for (int i=1 ; i < 20 ; i = i +2) {
            multiplicacion = multiplicacion* i;
        }

        System.out.println("El producto de los 10 primeros impares es: " + multiplicacion);
    }
}