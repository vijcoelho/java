package JAVA_EXC;

public class exc50 {
    public static void main(String[] args) {
        StringBuilder div3 = new StringBuilder();
        StringBuilder div5 = new StringBuilder();
        StringBuilder div3_5 = new StringBuilder();

            for(int i = 0; i < 100; i++){
            if (i % 3 == 0) {
                div3.append(i).append(", ");
            } if (i % 5 == 0) {
                div5.append(i).append(", ");
            } if (i % 3 == 0 && i % 5 == 0) {
                div3_5.append(i).append(", ");
            }
        }
        System.out.println("Divided by 3:\n" + div3);
        System.out.println("\nDivided by 5:\n" + div5);
        System.out.println("\nDivided by 3 & 5:\n" + div3_5);
    }
}
