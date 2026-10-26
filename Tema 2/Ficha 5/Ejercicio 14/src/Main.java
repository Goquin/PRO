import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos casos puedes poner en un switch?");
        System.out.println("A) Los que quieras");
        System.out.println("B) Solamente 3");
        System.out.println("C) Minimo 5");
        char res1 = sc.next().charAt(0);

        System.out.println("¿Cuáles de los siguientes tipos de datos están permitidos para evaluar en una estructura switch?");
        System.out.println("A) double, float y objetos complejos tipo ArrayList.");
        System.out.println("B) Únicamente int y char, ya que los String y los enum requieren obligatoriamente estructuras if-else");
        System.out.println("C) int, String, char y tipos enum");
        char res2 = sc.next().charAt(0);

        System.out.println("Respecto al bloque default en una instrucción switch en Java, ¿cuál de las siguientes afirmaciones es verdadera?");
        System.out.println("A) Es obligatorio incluirlo siempre al final de cualquier switch.");
        System.out.println("B) Es opcional, puede colocarse en cualquier posición dentro del switch y se ejecuta únicamente si ningún case anterior coincide con el valor evaluado.");
        System.out.println("C) Solo puede colocarse de manera estricta antes del primer case.");
        char res3 = sc.next().charAt(0);

        System.out.println("¿Qué ocurre si se omite la sentencia break al final de un bloque case dentro de un switch?");
        System.out.println("A) El compilador de Java arroja un error de sintaxis y se niega a compilar el código.");
        System.out.println("B) Se produce el efecto conocido como fall-through: la ejecución continúa automáticamente hacia el código del siguiente case sin evaluar su valor.");
        System.out.println("C) El programa se detiene por completo de forma inmediata lanzando una excepción en tiempo de ejecución.");
        char res4 = sc.next().charAt(0);

        int nota1;
        int nota2;
        int nota3;
        int nota4;

        switch (res1) {
            case 'A':
                nota1 = 1;
                break;
            default:
                nota1 = 0;
                break;
            }
        switch (res2) {
            case 'C':
                nota2 = 1;
                break;
            default:
                nota2 = 0;
                break;
            }
        switch (res3) {
            case 'B':
                nota3 = 1;
                break;
            default:
                nota3 = 0;
                break;
            }
        switch (res4) {
            case 'B':
                nota4= 1;
                break;
            default:
                nota4 = 0;
                break;
            }

        int notafinal= nota1 + nota2 + nota3 +nota4;
        System.out.println("SU resultado es de " + notafinal + " sobre 4.");


    }
}