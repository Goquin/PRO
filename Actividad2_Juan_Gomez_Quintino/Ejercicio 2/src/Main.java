/**Juan Gómez Quintino
 * Actividad 2 para la asignatura de programacion de 1ºDAW*/

import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("##.00");

        //Variables declaradas//

        int numAlumnos;
        double notaAlumno;
        int numAprobados = 0;
        int numSuspensos = 0;
        double notaTotal = 0;
        double notaMax = 0;
        double notaMin = 10;
        int numSobresalientes = 0;
        double media;
        int opcion;
        double porcentajeAprobados;
        double porcentajeSuspensos;
        double validarNota;
        int porcentajeSubida;

        // 1.1 Validacion del dato solicitado


        do {
            System.out.print("Introduce el numero de alumnos (1-40): ");

            if (sc.hasNextInt()) {
                numAlumnos  = sc.nextInt();

                if (numAlumnos >0 && numAlumnos < 41 ) {
                    break;
                } else {
                    System.out.println("Valor fuera de rango. Debe estar entre 1 y 40.");
                }
            } else {
                System.out.println("Error: debes introducir un número entero.");
                sc.next(); //Borra el anterior, evitando asi el bucle infinito
            }
        } while (true);

        //1.2 solicitud de cada nota y validacion de la misma

        for (int i=1; i <= numAlumnos; i++) {
            do {
                System.out.print("Introduce la nota del alumno " + i + " (0-10): ");

                if (sc.hasNextDouble()) {
                    notaAlumno  = sc.nextDouble();

                    if (notaAlumno >= 0 && notaAlumno <= 10 ) {
                        break;
                    } else {
                        System.out.println("Valor fuera de rango. Debe estar entre 0 y 10.");
                    }
                } else {
                    System.out.println("Error: debes introducir un número real.");
                    sc.next(); //Borra el anterior, evitando asi el bucle infinito
                }

            } while (true);

            //1.3 Calculo y almacenamiento de los datos solicitados

            if (notaAlumno >= 5) {
                numAprobados++;
            } else {
                numSuspensos++;
            }

            if (notaAlumno >= 9) {
                numSobresalientes++;
            }

            if (notaAlumno > notaMax) {
                notaMax = notaAlumno;
            }
            if (notaAlumno < notaMin) {
                notaMin = notaAlumno;
            }

            notaTotal = notaTotal + notaAlumno;

            //2.1 Pasar el numero a entero y utilizar el switch para mostrar la calificación cualitativa.

            int notaAlumnoEnt = (int) notaAlumno;

            switch (notaAlumnoEnt) {
                case 0,1,2,3,4 :
                    System.out.println("Calificación cualitativa: Suspenso");
                    break;
                case 5 :
                    System.out.println("Calificación cualitativa: Suficiente");
                    break;
                case 6 :
                    System.out.println("Calificación cualitativa: Bien");
                    break;
                case 7 :
                    System.out.println("Calificación cualitativa: Notable bajo");
                    break;
                case 8 :
                    System.out.println("Calificación cualitativa: Notable alto");
                    break;
                case 9 :
                    System.out.println("Calificación cualitativa: Sobresaliente");
                    break;
                case 10 :
                    System.out.println("Calificación cualitativa: Matricula de honor");
                    break;
            }

        }

        //Calculo de la media perteneciente a 1.2 y porcentajes de aprobados y suspensos para 3.
        media = notaTotal / numAlumnos;
        porcentajeAprobados = (numAprobados*100.0)/numAlumnos;
        porcentajeSuspensos = (numSuspensos*100.0)/numAlumnos;

        //3 Creacion del menu


        do {


            do {

                System.out.println("\n====================================");
                System.out.println(" MENÚ GESTOR DE CALIFICACIONES");
                System.out.println("====================================");
                System.out.println("1.Mostrar estadística del grupo");
                System.out.println("2.Buscar si una nota seria Apto o No Apto");
                System.out.println("3.Simular subida de nota a todo el grupo");
                System.out.println("4.Salir");
                System.out.print("Elige una opcion (1-4): ");

                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                    if (opcion < 1 || opcion > 4) {
                        System.out.println("Valor fuera de rango. Debe estar entre 1 y 4.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Error: debes introducir un número entero.");
                    sc.next();
                }

            } while (true);


            switch (opcion) {

                case 1: //Opcion 1, mostrar estadisticas del grupo
                    System.out.println("\n===ESTADÍSTICAS DEL GRUPO===");
                    System.out.println("Número total de alumnos: " + numAlumnos);
                    System.out.println("Nota media del grupo: " + df2.format(media));
                    System.out.println("Nota maxima: " + df2.format(notaMax));
                    System.out.println("Nota minima: " + df2.format(notaMin));
                    System.out.println("Número de aprobados: " + numAprobados);
                    System.out.println("Número de suspensos: " + numSuspensos);
                    System.out.println("Porcentaje de aprobados : " + df2.format(porcentajeAprobados) + "%");
                    System.out.println("Porcentaje de suspensos : " + df2.format(porcentajeSuspensos) + "%");
                    System.out.println("Número de sobresalientes (>=9): " + numSobresalientes);
                    break;

                case 2: // Comprobar si una nota es Apta o No Apta

                    do {
                        System.out.print("Introduce una nota para comprobar si es Apto/No Apto (0-10): ");

                        if (sc.hasNextDouble()) {
                            validarNota=sc.nextDouble();

                            if (validarNota <=10 && validarNota>= 0) {
                                break;
                            } else {
                                System.out.println("Valor fuera de rango. Debe estar entre 0 y 10.");
                            }
                        }else {
                            System.out.println("Error: debes introducir un número real.");
                            sc.next();
                        }


                    }while (true);

                    if (validarNota >= 5) {
                        System.out.println("Resultado: Apto");
                    } else {
                        System.out.println("Resultado: No Apto");
                    }
                    break;

                case 3 : //Simulacion de subida del grupo
                    do {
                        System.out.print("Introduce el porcentaje de subida (0-100): ");

                        if (sc.hasNextInt()) {
                            porcentajeSubida = sc.nextInt();

                            if (porcentajeSubida >= 0 && porcentajeSubida <= 100) {
                                break;
                            } else {
                                System.out.println("Valor fuera de rango. Debe estar entre 0 y 100.");
                            }
                        }else {
                            System.out.println("Error: debes introducir un número entero.");
                            sc.next();
                        }

                    } while (true);

                    System.out.println("\n ===SIMULACIÓN DE SUBIDA DE NOTAS===");
                    System.out.println("Media original del grupo: " + df2.format(media));

                    double mediaActual = media * (1 + (porcentajeSubida / 100.0));

                    if (mediaActual > 10) {
                        System.out.println("Media simulada tras aplicar una subida del " + porcentajeSubida + "%: 10");
                    } else {
                        System.out.println("Media simulada tras aplicar una subida del " + porcentajeSubida + "%: " + mediaActual);
                    }

                    System.out.println("Nota: esta es una simulacion. Las notas reales NO se han modificado.");
                    break;

                case 4 :
                    System.out.println("Saliendo del gestor. ¡Hasta proto!");
                    break;
            }

        } while (opcion != 4);
    }
}