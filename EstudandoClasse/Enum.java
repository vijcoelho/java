package EstudandoClasse;

enum Level {
    LOW,
    MEDIUM,
    HIGH,
}

public class Enum {
    public static void main(String[] args) {
        Level var=Level.LOW;

        switch(var) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
