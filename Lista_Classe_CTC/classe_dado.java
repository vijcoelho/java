package Lista_Classe_CTC;

import java.util.Random;

class Dado {
    public void Sorteio() {
        Random random = new Random();
        int numRandom = random.nextInt(6)+1;
        System.out.println(numRandom);
    }
    
    public static void main(String[] args) {
        Dado dado = new Dado();
        System.out.print("\u001b[2J\u001b[H");
        dado.Sorteio();
    }
}

