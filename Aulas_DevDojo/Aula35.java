//ForEach

package Aulas_DevDojo;

public class Aula35 {
    public static void main(String[] args) {
        // int[] numeros = new int[3]; Formas de criar uma array
        // int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};
        
        // for (int i = 0; i < numeros3.length; i++) {
        //     System.out.println(numeros3[i]);
        // }
        for (int num : numeros3) { //Nao te da o indice
            System.out.println(num);
        }
    }
}
