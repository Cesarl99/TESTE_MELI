import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero pra calcular a tabuada: ");
        int numero  = scanner.nextInt();
        System.out.println("=====================================");
        System.out.println("=========== TABUADA DO " + numero + " ===========");
        System.out.println("=====================================");
        // calcula a tabuada do numero digitado
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }

        scanner.close();
    }
}
