package Leonel.J;

import java.util.Scanner;

public class ArrayTeclado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nElementos;
        System.out.println("Digite la cantidad de elementos del arrays: ");
        nElementos = sc.nextInt();

        int[] numeros = new int[nElementos];
        for(int i = 0;i < nElementos; i++){
            System.out.println("Digite los elementos del arrays: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Elementos del arrays introducido: ");
            for (int j = 0; j < numeros.length; j++) {
                System.out.println(numeros[j]);
            }
    }
}