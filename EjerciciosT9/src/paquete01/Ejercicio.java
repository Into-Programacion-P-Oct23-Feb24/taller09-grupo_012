/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.*;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int num;
        String[] marcas;
   
        String marca;
        String acumulador = "";
        System.out.println("Ingrese la cantidad de marcas");
        num = entrada.nextInt();
        entrada.nextLine();
        marcas = new String[num];

        for (int contador = 0;contador < num;contador++){
            System.out.println("Ingrese las marcas");
            marca = entrada.nextLine();
            String letra = marca.substring(0, 1).toUpperCase();
            if (letra.equals("C") || letra.equals("A")
                    || letra.equals("T")) {
                System.out.println("Ingrese una marca diferente");
                // esto hace que el contador se disminuya en uno
                --contador;
            } else {
                marcas[contador] = marca;
                acumulador = String.format("%s\n%s",
                         acumulador, marcas[contador]);
            }
        
        }
        System.out.printf("%s\n", acumulador);
    }
}
