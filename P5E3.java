package Leonel.J;

public class P5E3 {
    public static void main(String[] args) {
        int[] ordenar = new int[8];
        ordenar[0] = 9;
        ordenar[1] = 15;
        ordenar[2] = 1;
        ordenar[3] = 14;
        ordenar[4] = 8;
        ordenar[5] = 7;
        ordenar[6] = 6;
        ordenar[7] = 5;


        for (boolean ordenado = false; !ordenado; ) {
            int contador = 0;
            for (int i = 0; i < ordenar.length - 1; i++) {
                if (ordenar[i] > ordenar[i + 1]) {
                    int intermedio = ordenar[i];
                    ordenar[i] = ordenar[i + 1];
                    ordenar[i + 1] = intermedio;
                    contador++;
                 //   System.out.println(contador);
                }
            }
            if (contador == 0) {
                ordenado = true;
            }
        }
        System.out.println("El array ordenado es: ");
        for (int j = 0; j < ordenar.length; j++) {
            System.out.println(ordenar[j]);
        }
    }
}