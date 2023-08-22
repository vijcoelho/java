package Aulas_DevDojo;

public class Aula41_ProfessorTeste {
    public static void main(String[] args) {
        Aula41_professor professor = new Aula41_professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);
    }
}
