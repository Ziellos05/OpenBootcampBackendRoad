import java.util.Scanner;

public class ClaseScanner_FlagTechnique {

    public void usingScanner() {
        Scanner scanner = new Scanner(System.in);

        // Técnica del FLAG

        boolean ok = false;

        do {
            System.out.print("Mete dos números");

            // Aquí bloqueo esperando que me meta 2 números
            scanner.nextInt();
            scanner.nextInt();

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("Enteros son: " + a + " " + b);
        } while (!ok);

    }

}
