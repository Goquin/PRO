//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int pro = 5;
        int ssf = 6;
        int bae = 4;
        int lnt = 8;
        int itk = 9;
        int lnd = 7;
        int ets = 5;


                System.out.println("Materia\t\t Nota");
                System.out.println("PRO\t\t" + pro);
                System.out.println("SSF\t\t" + ssf);
                System.out.println("BAE\t\t" + bae);
                System.out.println("LNT\t\t" + lnt);
                System.out.println("ITK\t\t" + itk);
                System.out.println("LND\t\t" + lnd);
                System.out.println("ETS\t\t" + ets );
                System.out.println("Promedio:" + ( (double) (pro + ssf+ bae + lnt + itk + lnd + ets)/
                        7));
    }
}