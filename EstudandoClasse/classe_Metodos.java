package EstudandoClasse;

public class classe_Metodos {
    static void StaticMethod() { 
        System.out.println("Static metodo, nao precisa criar um obj para ser chamado, basta chamar normalmente (Metodo();)");

    }

    public void PublicMethod() {
        System.out.println("Já utilizando o public, é necessario criar um obj para ele ser chamado.");
    }
    
    public static void main(String[] args) {
        StaticMethod();
        
        classe_Metodos Obj=new classe_Metodos();
        Obj.PublicMethod();
    }
}
