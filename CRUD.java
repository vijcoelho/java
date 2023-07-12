import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        int codigo = 0;
        int opcao = 0;
    
        while (true) {
            
            System.out.println("Escolha a opcao abaixo:");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir dados");
            System.out.println("2 - Alterar dados");
            System.out.println("3 - Pesquisar dados");
            System.out.println("4 - Deletar dados");

            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1: 
                System.out.print("Insira o nome: ");
                nome = scanner.next();
                System.out.print("Insira a idade: ");
                idade =  scanner.nextInt();
                System.out.print("Insira o codigo: ");
                codigo = scanner.nextInt();

                case 2:
                System.out.print("Insira o novo nome: ");
                String novo_nome = scanner.next();
                nome = novo_nome;
                System.out.printf("Novo nome: %s",nome);
                System.out.print("Insira a nova idade: ");
                int nova_idade =  scanner.nextInt();
                idade = nova_idade;
                System.out.printf("Nova idade: %s",idade);

            }
        }
        
    }
}
