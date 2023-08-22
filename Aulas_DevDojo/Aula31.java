//Continue

package Aulas_DevDojo;

public class Aula31 {
    public static void main(String[] args) {
        //Dado um valor de um carro, descubra em quantas parcelas ele pode ser parcelado;
        //Condicao valorParcela >= 1000; 

        double valorTotal = 30000;
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela "+ parcela + " R$ "+ valorParcela);
        }
    }
}
