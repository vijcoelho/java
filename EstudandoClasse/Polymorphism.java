package EstudandoClasse;

class Animal {
    public void SomDeAnimal() {
        System.out.println("O animal faz este som...");
    }

    class Porco extends Animal {
        public void SomDeAnimal() {
            System.out.println("O porco faz: roink, roink");
        }
    }

    class Cachorro extends Animal {
        public void SomDeAnimal() {
            System.out.println("O cachorro faz: Au, Au, Auuuu");
        }
    }

    class Main {
        public static void main(String[] args) {
            Animal meuAnimal=new Animal();
            Animal porco= new Animal();
            Animal cachorro= new Animal();
            meuAnimal.SomDeAnimal();
            porco.SomDeAnimal();
            cachorro.SomDeAnimal();
        }
    }
}
