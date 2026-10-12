
public class Principal {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i % 5 == 0) {
                    System.out.println("I=" + (i / 5) + " J=" + (i / 5 + j));
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", i * 0.2, i * 0.2 + j);
                }
            }
        }
    }
}
