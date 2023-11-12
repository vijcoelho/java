import java.util.Scanner;

public class CRUD {

    private static Scanner scanner = new Scanner(System.in);

    static void menu() {
        System.out.print("\u001b[2J\u001b[H");
        System.out.println("Escolha a opcao abaixo:");
        System.out.println("0 - Sair");
        System.out.println("1 - Inserir dados");
        System.out.println("2 - Alterar dados");
        System.out.println("3 - Pesquisar dados");
        System.out.println("4 - Deletar dados");
    }

    private static String nome = " ";
    private static int idade = 0:
    private static int codigo = 0;

    static void opcao1() {
        System.out.print("\u001b[2J\u001b[H");
        System.out.print("\nInsira o nome: ");
        nome = scanner.next();
        System.out.println("Seu nome é: " + nome);

        System.out.print("\nInsira a idade: ");
        idade = scanner.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.print("\nInsira o codigo: ");
        codigo = scanner.nextInt();
        System.out.println("Seu codigo é: " + codigo);
    }

    static void opcao2() {
        System.out.print("\u001b[2J\u001b[H");
        System.out.print("Seu nome atual é " + nome + ". Deseja mudar? [s/n]: ");
        String pergunta = scanner.next();

        if (pergunta.equalsIgnoreCase("s")) {
            System.out.print("\u001b[2J\u001b[H");
            System.out.print("Insira seu novo nome: ");
            String novo_nome = scanner.next();
            nome = novo_nome;
        } else if (pergunta.equalsIgnoreCase("n")) {
            System.out.printf("\nEntão seu nome continuará o mesmo nesse caso %s", nome);

            System.out.println("\nDeseja então mudar a sua idade. [s/n]");
            String pergunta_2 = scanner.next();

            if (pergunta_2.equalsIgnoreCase("s")) {
                System.out.print("\u001b[2J\u001b[H");
                System.out.print("Insira sua nova idade: ");
                int nova_idade = scanner.nextInt();
                idade = nova_idade;
            } else {
                System.out.printf("\nOk, sua idade continuará como estava %d", idade);
            }
        } else {
            System.out.println("\nResposta inválida. Apenas [s/n].");
        }
    }

    static void opcao3() {
        System.out.print("\u001b[2J\u001b[H");
        System.out.print("Coloque o código para mostrar o usuário: ");
        int pesquisa = scanner.nextInt();

        if (pesquisa == codigo) {
            System.out.println("Nome: "+nome+"   "+"Idade: "+idade);
            System.out.print("1 para continuar: ");
            pesquisa = scanner.nextInt();
        } else {
            System.out.println("Esse código não existe");
        }
    }

    static void opcao4() {
        System.out.print("\u001b[2J\u001b[H");
        System.out.println("Informe o código: ");
        int pesquisa = scanner.nextInt();

        if (pesquisa == codigo) {
            System.out.println("Deseja realmente excluir este cadastro? [s/n]: ");
            String resposta = scanner.next();
            
            if (resposta.equalsIgnoreCase("s")) {
                System.out.print("\u001b[2J\u001b[H");
                System.out.println("Cadastro excluído com sucesso!");
                System.out.print("1 para continuar: ");
                pesquisa = scanner.nextInt();
                nome = "";
                idade = 0;
                codigo = 0;
            } else {
                System.out.println("Não foi feita nenhuma alteração");
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int opcao = scanner.nextInt();
            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                opcao1();
            } else if (opcao == 2) {
                opcao2();
            } else if (opcao == 3) {
                opcao3();
            } else if (opcao == 4) {
                opcao4();
            }
        }
        scanner.close();
    }
}
