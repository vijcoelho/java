package Exc_Classes;

class Numeros {
    private int[] vetor;
    private int maior;
    private int menor;
    private double media;

    public Numeros(int[] _valores) {
        vetor = _valores;
    }

    public void localizaMaior() {
        maior = Integer.MIN_VALUE; // Inicialize a variável maior com o menor valor possível
        for (int numero : vetor) {
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("Maior valor: " + maior);
    }

    public void localizarMenor() {
        menor = Integer.MAX_VALUE; // Inicialize a variável menor com o maior valor possível
        for (int numero : vetor) {
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Menor valor: " + menor);
    }

    public void calcularMedia() {
        int soma = 0;
        for (int numero : vetor) {
            soma += numero;
        }
        media = (double) soma / vetor.length; // Calcule a média como um valor double
        System.out.println("Média: " + media);
    }

    public static void main(String[] args) {
        int[] _valores = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Numeros nums = new Numeros(_valores);
        nums.localizaMaior();
        nums.localizarMenor();
        nums.calcularMedia();
    }
}
