import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a RPGhax.");
        System.out.println("Por favor, introduzca el nombre de su personaje.");
        String name = sc.nextLine();

        System.out.println("Perfecto, bienvenido de vuelta " + name);

        System.out.println("Por favor, elige una clase entre arquero, mago o guerrero.");
        String clase = sc.nextLine();

        if (clase.equals("guerrero") || clase.equals("mago") || clase.equals("arquero")) {
            System.out.println("Perfecto, has elegido " + clase);
        } else {
            System.out.println("Lo sentimos, la clase seleccionada no esta permitida, intentalo de nuevo.");
            System.out.println("Por favor, elige una clase entre arquero, mago o guerrero.");
            String clase1 = sc.nextLine();
            if (clase1.equals("guerrero") || clase1.equals("mago") || clase1.equals("arquero")) {
                System.out.println("Perfecto, has elegido " + clase1);
            } else {
                System.out.println("Lo sentimos, la clase seleccionada no esta permitida, intentalo de nuevo.");
            }
        }

        int puntos = 10;

        System.out.println("Tienes 10 puntos disponible para repartir entre fuerza, habilidad e inteligencia.");
        System.out.println("¿Que quieres subir primero?");
        String subhab = sc.nextLine();

        if (puntos > 0) {
            if (subhab.equals("fuerza") || subhab.equals("habilidad") || subhab.equals("inteligencia")) {
                System.out.println("Asi que quieres subir " + subhab);
                System.out.println("¿Cuantos puntos quieres dedicarle?");
                int puntosGastar = sc.nextInt();
                sc.nextLine();
                int puntosActuales = puntos - puntosGastar;

                if (puntosActuales > 0) {

                    System.out.println("Tienes " + puntosActuales + " puntos disponible para repartir entre fuerza, habilidad e inteligencia.");
                    System.out.println("¿Que quieres subir ahora?");
                    String subhab1 = sc.nextLine();


                    if (subhab1.equals("fuerza") || subhab1.equals("habilidad") || subhab1.equals("inteligencia")) {
                        System.out.println("Asi que quieres subir " + subhab1);
                        System.out.println("¿Cuantos puntos quieres dedicarle?");
                        int puntosGastar1 = sc.nextInt();
                        sc.nextLine();

                        int puntosActuales1 = puntosActuales - puntosGastar1;

                        if (puntosActuales1 > 0) {

                            System.out.println("Tienes " + puntosActuales1 + " puntos disponible para repartir entre fuerza, habilidad e inteligencia.");
                            System.out.println("¿Que quieres subir ahora?");
                            String subhab2 = sc.nextLine();

                            if (subhab2.equals("fuerza") || subhab2.equals("habilidad") || subhab2.equals("inteligencia")) {
                                System.out.println("Asi que quieres subir " + subhab2);
                                System.out.println("¿Cuantos puntos quieres dedicarle?");
                                int puntosGastar2 = sc.nextInt();
                                sc.nextLine();

                                int puntosActuales2 = puntosActuales1 - puntosGastar2;

                            }
                        }
                    }
                }
            }
        }
    }
}