
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
/** Lo primero que hare sera crear las clases para el scanner y los numeros
 *  decimales redondeados a los dos primeros decimales y a los tres primeros decimales*/

        Scanner sc = new Scanner(System.in);

        DecimalFormat df2 = new DecimalFormat("#.00");
        DecimalFormat df3 = new DecimalFormat("0.000");
        DecimalFormat dfentero = new DecimalFormat("#");

/** A continuacion voy a solicitar los datos que son necesarios y añadir el valor
 *  de la constante de la densidad del aire*/
        System.out.println("Introduce la velocidad del viento (m/s): ");
        int velViento = sc.nextInt();

        System.out.println("Introduce el diámetro del motor (m): ");
        int diametroMotor = sc.nextInt();

        System.out.println("Introduce el rendimiento del sistema (% 0-100): ");
        int rendimiento = sc.nextInt();


        double D_AIRE = 1.225;

        /** Seguimos calculando la velocidad de rafaga, para ello primero calculare factor
         * de rafaga aleatorio, donde nos hara falta un numero entre 1 y 10, eligo estos
         * valores por la desviacion que me da el enunciado. Luego lo multiplicaremos por la velocidad del viento*/

        double numRandom = random() * 10 + 1;

        double factor = 0.9 * numRandom * 0.20;

        double velRafaga = velViento * factor;

        /** Continuamos calculando el area del rotor, sabiendo que A = r^2*PI,
         * como no hemos dado if, siempre mostrare resultado correcto. El radio sera igual a D/2*/

        double radioMotor = diametroMotor / 2;
        double areaMotor = PI * pow(radioMotor, 2);

        /** Comprobaremos que se ha realizado correctamente el calculo y asigno el valor de correcto e
         * incorreto dependiendo del caso*/

        double r_calc = sqrt(areaMotor/PI);

        String revision = (radioMotor == r_calc) ? "(Correcto)" : "(Incorrecto)";

        /** Procederemos a calcular la potencia teroica del viento, usadon la formula
         * P=1/2 * densidad * A * v^3 (v sera igual a la velocidad de rafaga, no la base*/

        double potenciaTeorica = 0.5 * areaMotor *D_AIRE * pow(velRafaga, 3);

        /** Por ultimo calcularemos la potencia neta del aerogenerador y la redondeamos*/

        double potenciaNeta = (potenciaTeorica * (rendimiento/100.0));

        double potenciaNetaRedon = round(potenciaNeta);

        /** Pasaremos ahora a calcular energia producida en un periodo de tiempo,
         * para ello, nos hara falta pedir un tiempo en minutos y lo pasaremos a segundos*/

        System.out.println("Introduce los minutos de observacion: ");
        int minObs = sc.nextInt();
        int segObs = minObs * 60;

        double energiaJoules = potenciaNeta * segObs;

        /** Lo pasamos a Wh, lo redondeamos y lo pasamos a kWh enteros*/

        double energiaWh = energiaJoules / 3600.0; // 1Wh = 3600 J//

        double energiaWhRedon = round(energiaWh);

        double energiakWh = energiaWhRedon / 1000.0;

        /** Usaremos una ternaria para saber si imprimir alta o normal*/

        String riesgo = (potenciaNeta > 5000) ? "ALTA" : "NORMAL";

        /** Para terminar mostraremos los resultados en los formatos decimales deseados*/

        System.out.println("---RESULTADOS---");
        System.out.println("Velocidad base (m/s): " + df2.format(velViento));
        System.out.println("Factor ráfaga: " + df3.format(factor));
        System.out.println("Velocidad de ráfaga (m/s): " + df2.format(velRafaga));
        System.out.println("Área barrida (m^2):" + df3.format(areaMotor) + " " + revision); //En el pdf aparece con tres decimales, aunque pone que deberia ser con 2//
        System.out.println("Radio (m): " + df2.format(radioMotor) + " | " + "r_calc desde A (m): " + df2.format(r_calc));
        System.out.println("Potencia teórica (W): " + df2.format(potenciaTeorica));
        System.out.println("Potencia neta (W): " + df2.format(potenciaNeta) + " | " + "redondeada: " + dfentero.format(potenciaNetaRedon) + " W");
        System.out.println("Energia en " + minObs + " min:");
        System.out.println("-J(Joules): " + df2.format(energiaJoules));
        System.out.println("-Wh: " + df2.format(energiaWh) + " | " + "Wh redondeados: " + energiaWhRedon + " | " + "kWh(enteros): " + dfentero.format(energiakWh));
        System.out.println("Nivel de potencia: " + riesgo);


    }
}