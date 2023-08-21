package EstudandoClasse;
    abstract class abstract_method {
        public String nome="Vitor";
        public int idade=19;
        public abstract void Estudo();
    }

    class Estudante extends abstract_method {
        public int ano_de_graduacao=2021;
        public void Estudo() {
            System.out.println("Estudando todo santo dia");
        }
    }

    class Segundo {
        public static void main(String[] args) {
            Estudante obj=new Estudante();

            System.out.println("Nome: "+obj.nome);
            System.out.println("Idade: "+obj.idade);
            System.out.println("Ano da graduacao: "+obj.ano_de_graduacao);
            obj.Estudo();
        }
    }
