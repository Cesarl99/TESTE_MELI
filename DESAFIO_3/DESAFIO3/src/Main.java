import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero pra calcular o factorial: ");
        int numero  = scanner.nextInt();
        long resultado = 1;
        for (int i = 2; i <= numero ; i++) {
            resultado *= i;
        }
        System.out.println("o factorial do numero: " + numero + " é " + resultado);

        scanner.close();
    }
}
