package EstudandoClasse.ctc;

class Principal{
    public static void main(String[] args) {
        Biblioteca doCotuca = new Biblioteca("Do CTC");

        System.out.println(doCotuca);
        try {
            doCotuca.incluir(new Livro(1, "JAVA 20.87"));
            doCotuca.incluir(new Livro(2, "JAVA 21"));
        } catch(Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }

        System.out.println(doCotuca);
    }
}
