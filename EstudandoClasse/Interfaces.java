package EstudandoClasse;

interface Animal {
    void Dormir();
    void Som();
}

class Cachorro implements Animal {
    public void Dormir() {
        System.out.println("O cachorro está dormindo");
    }

    public void Som() {
        System.out.println("O cachorro faz: Au au");
    }
}

class Main {
    public static void main(String[] args) {
        Cachorro meuDog=new Cachorro();
        meuDog.Dormir();
        meuDog.Som();
    }
}
