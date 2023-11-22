package EstudandoClasse;

import java.util.ArrayList;
import java.util.Collections;

public abstract class aAluno {

    private String Nome;
    private Avaliacao[] notas;

    public abstract void setNome(String n);
    public abstract String getNome();
    public abstract boolean equals(Object obj);
    public abstract int compareTo(aAluno aluno);
    public abstract aAluno clone();
    public abstract Avaliacao[] getAvaliacoes();
    public abstract void inserirAvaliacao(Avaliacao a);
    public abstract void removerAvaliacao(Avaliacao a);
    public abstract void ordenarAvaliacoesPorNome();
    public abstract double media();
}

class Aluno extends aAluno {

    private String nome;
    private ArrayList<Avaliacao> notas;

    public Aluno() {
        this.notas = new ArrayList<>();
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Aluno) {
            Aluno aluno = (Aluno) obj;
            return this.nome.equals(aluno.getNome());
        }
        return false;
    }

    public int compareTo(aAluno aluno) {
        if (aluno instanceof Aluno) {
            Aluno aluno2 = (Aluno) aluno;
            return this.nome.compareTo(aluno2.getNome());
        }
        return -1;
    }

    public aAluno clone() {
        Aluno clone = new Aluno();
        clone.setNome(this.nome);
        return clone;
    }

    public Avaliacao[] getAvaliacoes() {
        return notas.toArray(new Avaliacao[0]);
    }

    public void inserirAvaliacao(Avaliacao a) {
        notas.add(a);
    }

    public void removerAvaliacao(Avaliacao a) {
        notas.remove(a);
    }

    public void ordenarAvaliacoesPorNome() {
        Collections.sort(notas, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
    }

    public double media() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (Avaliacao a : notas) {
            soma += a.getNota();
        }

        return soma / notas.size();
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");

        Avaliacao avaliacao1 = new Avaliacao();
        avaliacao1.setNome("Matemática");
        avaliacao1.setNota(8.5);

        Avaliacao avaliacao2 = new Avaliacao();
        avaliacao2.setNome("Português");
        avaliacao2.setNota(7.8);

        aluno1.inserirAvaliacao(avaliacao1);
        aluno2.inserirAvaliacao(avaliacao2);

        System.out.println("Aluno 1 igual ao Aluno 2? " + aluno1.equals(aluno2));

        aluno1.ordenarAvaliacoesPorNome();

        System.out.println("Avaliações do Aluno 1 ordenadas por nome:");
        for (Avaliacao a : aluno1.getAvaliacoes()) {
            System.out.println("Nome: " + a.getNome() + ", Nota: " + a.getNota());
        }

        System.out.println("Média do Aluno 2: " + aluno2.media());
    }
}
