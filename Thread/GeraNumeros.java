package Thread;
import java.util.Random;

class GeraNumeros {
    public static final long MAX_NUMBERS = 1_000_000_000L; 
    
    public static void main(String[] args) {
        new GeraNumeros().run();
    }

    public void run() {
        Random semente = new Random();
        double soma = 0;
        System.out.println("Iniciando...");
        double tempo = System.currentTimeMillis();
        for (int i = 0; i < MAX_NUMBERS; i++) {
            soma += Math.pow(semente.nextDouble(), 10);dfadasdadadada
        }
        tempo = tempo - System.currentTimeMillis();
        System.out.println("Terminando: " + tempo/1000);
    }   
}
