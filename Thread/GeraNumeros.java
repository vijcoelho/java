package Thread;
import java.util.Random;

class GeraNumeros extends Thread{
    public static final long MAX_NUMBERS = 1_000_000_000L; 
    private long quantosNumeros;

    public GeraNumeros(long qtos) {
        this.quantosNumeros = qtos;
    }

    public void run() {
        Random semente = new Random();
        double soma = 0;
        System.out.println("Iniciando thread "+ super.getName());
        double tempo = System.currentTimeMillis();
        for (int i = 0; i < MAX_NUMBERS; i++) {
            soma += Math.pow(semente.nextDouble(), 10);
        }
        tempo = tempo - System.currentTimeMillis();
        System.out.println(super.getName() +" Terminando em "+ tempo/1000);
        System.out.println("Soma: "+ soma);
    }
    
    public static void main(String[] args) {
        int qtosThread = 1;
        if(args.length > 0) {
            qtosThread = Integer.parseInt(args[0]);
        }
    
        for (int i = 0; i < qtosThread; i++) {
            new GeraNumeros(MAX_NUMBERS/qtosThread).start();
        }
    }
}
