package EstudandoClasse;

class Veiculo {
    protected String marca = "Ford";

    public void honk() {
        System.out.println("Tuu!, Tuuu!");
    }

    class Carro extends Veiculo {
        private String modelo = "Mustang";
    }

    public static void main(String[] args) {
        Veiculo.Carro meuCarro = new Veiculo().new Carro();
        meuCarro.honk();
        System.out.println(meuCarro.marca + " " + meuCarro.modelo);
    }
}
