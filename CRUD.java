import java.util.Scanner;

public class CRUD {
    
    private static Scanner scanner = new Scanner(System.in);

    static void menu() {
            
        System.out.println("Escolha a opcao abaixo:");
        System.out.println("0 - Sair");
        System.out.println("1 - Inserir dados");
        System.out.println("2 - Alterar dados");
        System.out.println("3 - Pesquisar dados");
        System.out.println("4 - Deletar dados");

    }
    
    static void opcao1() {
        
        System.out.print("\nInsira o nome: ");
        String nome = scanner.next();
        System.out.println("Seu nome é: "+ nome);
        
        System.out.print("\n Insira a idade: ");
        int idade =  scanner.nextInt();
        System.out.println("Sua idade é: "+ idade);
        
        System.out.print("\nInsira o codigo: ");
        int codigo = scanner.nextInt();
        System.out.println("Seu codigo é: "+ codigo);
        
        scanner.close();
    }

    static void opcao2 (String nome, int idade) {
    
        System.out.print("Seu nome atual é " + nome +" . Deseja mudar? [s/n]: ");
        String pergunta = scanner.next();
        if (pergunta == "s" && pergunta == "S") {
            
            System.out.print("Insira seu novo nome: ");
            String novo_nome = scanner.next();
            nome = novo_nome;
        }
        else if (pergunta == "n" && pergunta == "N") {
            
            System.out.printf("Entao seu nome continuara o mesmo. (%s)",nome);

            System.out.println("Deseja entao mudar a sua idade. [s/n]");
            String pergunta_2 = scanner.next();
            
            if (pergunta_2 == "s" && pergunta_2 == "S") {
                
                System.out.print("Insira sua nova idade: ");
                int nova_idade = scanner.nextInt();
                idade = nova_idade;
            }
            else {
                System.out.printf("Ok, sua idade continuara como estava (%s)",idade);
            }
        }
        else {
            System.out.println("Apenas [s/n].");
        }
    }
    
    public static void main(String[] args) {
        while (true) {
            menu();
            int opcao = scanner.nextInt();
            if (opcao == 0) {
                break;
            }
            else if (opcao == 1) {
                opcao1();
            }
            else if (opcao == 2) {
                opcao2("unknow", 0);
            }
        }        
    }
}
