package EstudandoClasse;

class Numeros {
    private int num1;
    private int num2;

    public void setNum(int num1, int num2) { 
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int getSoma() { return num1 + num2; }

    public int getMulti() { return num1 * num2; }

    public int getSub() { return num1 - num2; }

    public int getDiv() { return num1 / num2; }

    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        numeros.setNum(10,2);
        System.out.println(numeros.getDiv());
        System.out.println(numeros.getSoma());
        System.out.println(numeros.getMulti());
        System.out.println(numeros.getSub());
    }
}
