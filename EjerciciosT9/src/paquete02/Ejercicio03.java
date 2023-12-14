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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int media;
        int num;
        int suma = 0;
        int contador = 1;
        int contador2 = 0;
        int contador3 = 0;
        // usamos contador para usarlo despues para devidir la suma de los 
        // valores y sacar la media
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
            contador++;
        }
        // usamos contador2 y contador3 para llevar la cuenta de los 
        // numeros que son mayores o menores a la media
        media = suma / contador;
        for (int i = 0; i < arreglo.length; i++) {
            num = arreglo[i];
            if (num > media) {
                contador2++;
            }
            if (num < media) {
                contador3++;
            }
        }
        System.out.printf("Numeros arriba de la media: %d\n"
                + "Numeros abajo de la media: %d\n",
                 contador2, contador3);
    }

}
