package EstudandoClasse;

interface iDisciplina{
    public abstract void inserirAluno(aAluno a);
    public abstract void removerAvaliacao(aAluno a);
    public abstract aAluno getAluno(String Nome);

    public abstract void ordenarAlunosPorNome();
    public abstract double mediaGeral();
    public abstract int quantosAcimaDaMedia();
    public abstract int quantosComMediaAcimaDe(double valor);
}