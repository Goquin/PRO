//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int A = 1 ;
        int B = 2 ;
        int C = 3 ;
        int D = 4 ;
        int Bini = 2 ;

        System.out.println("A = " + A + " / " + "B = " + B + " / " + "C = " + C + " / " + "D = " + D);

        B = C;
        C = A;
        A = D;
        D = Bini;
        System.out.println("A = " + A + " / " + "B = " + B + " / " + "C = " + C + " / " + "D = " + D);

    }
}