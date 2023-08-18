package ListaExtra;

import java.util.*;

class Item {
    String nome;
    double preco;
    int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }

    public void adicionar(int quantidadeAdicionar) {
        quantidade+=quantidadeAdicionar;
    }

    public double getTotal() {
        return preco*quantidade;
    }
}

public class exc1 {
    public static void main(String[] args) {
        List<Item>itens=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adicione os itens:");
        System.out.print("Quantidade de camisas: ");
        int quantidadeCamisas=scanner.nextInt();
        itens.add(new Item("Camisa", 10, quantidadeCamisas));

        System.out.print("Quantidade de tênis: ");
        int quantidadeTenis=scanner.nextInt();
        itens.add(new Item("Tênis", 5, quantidadeTenis));

        System.out.print("Quantidade de calças: ");
        int quantidadeCalcas=scanner.nextInt();
        itens.add(new Item("Calça", 7, quantidadeCalcas));

        double totalDinheiro=0;
        for (Item item : itens) {
            totalDinheiro+=item.getTotal();
        }

        for (Item item : itens) {
            System.out.printf("%d %s - %.2f$\n", item.quantidade, item.nome, item.getTotal());
        }

        System.out.printf("Total de dinheiro gasto: %.2f$\n", totalDinheiro);

        scanner.close();
    }
}
