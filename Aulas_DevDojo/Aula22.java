//Operador Ternário

package Aulas_DevDojo;

public class Aula22 {
    public static void main(String[] args) {
        int idade = 19;
        String categoria;

        categoria = idade < 15 ? "Categoria Infantil": idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);
    }
}