public class Main {
  public static void main(String[] args) {
    System.out.println("Olá, Mundo");
    System.out.println("Estou aprendendo JAVA");
    System.out.println(3 + 2);
    String nome = "Vitor";
    System.out.println("Meu nome é "+ nome);
    int idade = 18;
    idade = 19; //mudou a variavel
    final int ano = 2023; // nao podera ser mudada como o metodo de cima
    System.out.println("Ano : " + ano);
    System.out.println("Minha idade é " + idade);
    // int numero = 5;
    // float flornum = 5.99f;
    // char letra = 'D';
    // boolean bool = true;
    // String texto = "Hello";
    int numero1 = 10, numero2 = 2;
    int soma = numero1 + numero2;
    int divisao = numero1 % numero2;
    int multi = numero1 * numero2;
    System.out.println("Soma "+ soma); 
    System.out.println("Divisao "+ divisao); 
    System.out.println("Multiplicaçao "+ multi); 
    // String firstName = "Vitor";
    // String lastName = "Coelho";
    // System.out.println(firstName + " " + lastName);
    String firstName = "Vitor ";
    String lastName = "Coelho";
    System.out.println(firstName.concat(lastName));
    // nextBoolean()	Reads a boolean value from the user
    // nextByte()	Reads a byte value from the user
    // nextDouble()	Reads a double value from the user
    // nextFloat()	Reads a float value from the user
    // nextInt()	Reads a int value from the user
    // nextLine()	Reads a String value from the user
    // nextLong()	Reads a long value from the user
    // nextShort()	Reads a short value from the user
    }  
}
