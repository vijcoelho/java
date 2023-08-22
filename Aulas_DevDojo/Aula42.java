//EXERCICIO;

package Aulas_DevDojo;


class Carro {
    public String nome;
    public String Modelo;
    public int ano;
}

public class Aula42 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Uno";
        carro.Modelo = "Fiat";
        carro.ano = 2010;
        
        carro2.nome = "Gol"; 
        carro2.Modelo = "Bolinha";
        carro2.ano = 2022;
        
        System.out.println("Nome do carro: " + carro.nome + "\nModelo do carro: " + carro.Modelo + "\nAno do carro: " + carro.ano);
        System.out.println("-----------------------");
        System.out.println("Nome do carro: " + carro2.nome + "\nModelo do carro: " + carro2.Modelo + "\nAno do carro: " + carro2.ano);   
                           
    }
}
