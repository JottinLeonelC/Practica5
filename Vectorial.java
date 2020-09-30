package Leonel.J;

public class Vectorial {
    public static void main(String[] args){
        int[] vector1= new int[3];
        int[] vector2= new int[3];

        vector1[0] = 2;
        vector1[1] = 4;
        vector1[2] = 6;
        vector2[0] = 1;
        vector2[1] = 3;
        vector2[2] = 5;

        int [] resultado = new int[3];

        resultado[0] = vector1[1]*vector2[2]-vector2[1]*vector1[2];
        resultado[1] = -vector1[0]*vector2[2]+vector2[0]*vector1[2];
        resultado[2] = vector1[0]*vector2[1]-vector2[0]*vector1[1];

        System.out.println("El producto vectorial entre los dos vectores es: ");
        for (int j = 0; j < resultado.length; j++) {
            System.out.println(resultado[j]);
        }
    }
}
