/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double promedio;
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        for (int i = 0; i < promedios.length; i++) {
            promedio = promedios[i];
            // usamos un if para determinar si el tipo de promedio
            if ((promedio >= 0) && (promedio <= 5)) {
                promediosCualitativos[i] = "Promedio Regular";
            } else {
                if ((promedio >= 6) && (promedio <= 8.9)) {
                    promediosCualitativos[i] = "Promedio Bueno";
                } else {
                    if ((promedio >= 9) && (promedio <= 10)) {
                        promediosCualitativos[i] = "Promedio Sobresaliente";
                    }
                }
            }
            System.out.printf("%s promedio: %.2f promedio cualitativo %s\n",
                     estudiantes[i], promedios[i], promediosCualitativos[i]);
        }

    }
}
