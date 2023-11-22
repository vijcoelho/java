package EstudandoClasse;

import java.util.ArrayList;
import java.util.Collections;

class Disciplina implements iDisciplina{
    
    private ArrayList<aAluno> alunos;

    public Disciplina() {
        this.alunos = new ArrayList<>();
    }

    public void inserirAluno(aAluno a) {
        alunos.add(a);
    }

    public void removerAvaliacao(aAluno a) {
        alunos.remove(a);
    }

    public aAluno getAluno(String nome) {
        for(aAluno alunos : alunos) {
            if(alunos.getNome().equals(nome)) {
                return alunos;
            }
        }
        return null;
    }

    public void ordenarAlunosPorNome() {
        Collections.sort(alunos, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
    }

    public double mediaGeral() {
        if(alunos.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        int quatidade = 0;
        for(aAluno aluno: alunos) {
            Avaliacao[] avaliacaos = aluno.getAvaliacoes();
            for(Avaliacao avaliacao: avaliacaos) {
                soma += avaliacao.getNota();
                quatidade++;
            }
        }
        return soma/quatidade;
    }

    public int quantosAcimaDaMedia() {
        double media = mediaGeral();
        int contador = 0;

        for (aAluno aluno : alunos) {
            Avaliacao[] avaliacoes = aluno.getAvaliacoes();
            double soma = 0.0;
            for (Avaliacao avaliacao : avaliacoes) {
                soma += avaliacao.getNota();
            }
            double mediaAluno = soma / avaliacoes.length;
            if (mediaAluno > media) {
                contador++;
            }
        }

        return contador;
    }
    
    public int quantosComMediaAcimaDe(double valor) {
        int contador = 0;

        for (aAluno aluno : alunos) {
            Avaliacao[] avaliacoes = aluno.getAvaliacoes();
            double soma = 0.0;
            for (Avaliacao avaliacao : avaliacoes) {
                soma += avaliacao.getNota();
            }
            double mediaAluno = soma / avaliacoes.length;
            if (mediaAluno > valor) {
                contador++;
            }
        }

        return contador;
    }
}
