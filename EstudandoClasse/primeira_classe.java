package EstudandoClasse;

public class primeira_classe {
    public void Tanque() {
        System.out.println("O tanque do carro está cheio");
    }

    public void Velocidade(int x) {
        System.out.println("O carro está a mais de "+x);
    }

    public static void main(String[] args) {
        primeira_classe carro=new primeira_classe();
        carro.Tanque();
        carro.Velocidade(200);
    }
} 
