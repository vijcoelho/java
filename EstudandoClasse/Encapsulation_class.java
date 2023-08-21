package EstudandoClasse;

class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }
}

public class Encapsulation_class {
    public static void main(String[] args) {
        Pessoa obj = new Pessoa();
        obj.setNome("Vitor");
        System.out.println(obj.getNome());
    }
}
