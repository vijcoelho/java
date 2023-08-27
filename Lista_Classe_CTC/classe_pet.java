package Lista_Classe_CTC;

import java.util.Scanner;

class Pet {
    private String nome;
    private int idade;
    private String raca;
    private char sexo;

    public void Informacoes() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\u001b[2J\u001b[H");
        System.out.print("Coloque o nome do animal: ");
        nome = scanner.next();
        System.out.print("Qual idade?: ");
        idade = scanner.nextInt();
        System.out.print("Qual a raça: ");
        raca = scanner.next();
        System.out.print("Qual o sexo: ");
        sexo = scanner.next().charAt(0);

        scanner.close();
    }
    
    public void MostrarInfos() {
        System.out.print("\u001b[2J\u001b[H");
        System.out.println("Nome: "+nome + "\r\n"+"Idade: "+ idade +"\r\n"+ "Raça: "+ raca + "\r\n"+ "Sexo: "+ sexo);
    }

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.Informacoes();
        pet.MostrarInfos();
    }
}
