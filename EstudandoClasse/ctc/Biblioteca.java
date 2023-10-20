package EstudandoClasse.ctc;

class Biblioteca {
    public static final int DEFAULT_LENGHT = 10;

    private String nome;
    private Livro[] livros;
    private int limite;

    public Biblioteca() {
        this("Sem Nome", DEFAULT_LENGHT);
    }

    public Biblioteca(int qtosLivros) {
        this("Sem Nome", DEFAULT_LENGHT);
    }

    public Biblioteca(String nome) {
        this("Sem Nome", DEFAULT_LENGHT);
    }

    public Biblioteca(String nome, int qtosLivros) {
        this.nome = nome;
        
        if(qtosLivros < DEFAULT_LENGHT) qtosLivros = DEFAULT_LENGHT;
        this.livros = new Livro[qtosLivros];
        this.limite = 0;
    }

    public void incluir(Livro l) throws Exception {
        if(l == null) throw new Exception("Livro invalido");
        if(limite == livros.length) throw new Exception("Biblioteca sem espaço");

        if(pertence(l)) throw new Exception("Livro ja existe na biblioteca");

        livros[limite] = l;
        limite++;
    }

    public boolean pertence(Livro l) {
        for (int i = 0; i < livros.length; i++) {
            if(livro[i].equals(1)) {
                return true;
            }
            return false;
        }
    }

    public String toString() {
        String retorno = "Ocupacao da Biblioteca: "+this.nome +": " +this.limite+"/"+livros.length;
        
        for(int i = 0; i <this.limite; i++) {
            if(i == 0) retorno += "\n";
            retorno += livros[i] + " ";
        }
        return retorno;
    }
}