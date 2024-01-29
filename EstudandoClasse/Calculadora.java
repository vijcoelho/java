package EstudandoClasse;

public class Calculadora {
    
    private float numero1, numero2;

    public float adicao() {
        return numero1 + numero2;
    }

    public float subtracao() {
        return numero1 - numero2;
    }
    
    public float multiplicacao() {
        return numero1 * numero2;
    }
    
    public float divisao() {
        if(numero1 == 0 || numero2 == 0) {
            System.out.println("Nao pode divider por 0");
        } 
        return numero1 / numero2;
    }

    public String operacoes() {
        return """
                + ADICAO
                * MULTIPLICACAO
                / DIVISAO
                - SUBTRACAO
                """;
    }

    public void perguntas(String pergunta) {
        switch (pergunta) {
            case "+":
                adicao();
                break;
            case "*":
                multiplicacao();
                break;
            case "/":
                divisao();
                break;
            case "-":
                subtracao();
                break;
            default:
                break;
        }
    }
}
