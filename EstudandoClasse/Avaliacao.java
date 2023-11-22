package EstudandoClasse;

class Avaliacao {
    
    private String nome;
    private double nota;
    private int peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean equals(Avaliacao prova, Avaliacao prova2) {
        if(prova.nome.equals(prova2.nome)) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Avaliacao prova2) {
        if(this.nome.compareTo(prova2.getNome()) > 0) {
            return 1;
        }
        else if(this.nome.compareTo(prova2.getNome()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public Avaliacao clone() {
        try {
            return (Avaliacao)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Avaliacao prova = new Avaliacao();
        Avaliacao prova2 = new Avaliacao();

        prova.setNome("Vitor");
        prova2.setNome("Paulao");
        prova.setNota(9.9);
        prova2.setNota(5.5);
        prova.setPeso(2);
        prova2.setPeso(1);

        prova.equals(prova2);
        prova.compareTo(prova2);
        prova.clone();

        System.out.println(prova.compareTo(prova2));
        System.out.println(prova2.equals(prova2));
    }
}
